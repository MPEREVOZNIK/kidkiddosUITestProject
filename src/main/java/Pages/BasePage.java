package Pages;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class BasePage {
    protected static WebDriver webDriver;
    protected static WebDriverWait wait;
    private static final  Logger Logger = LogManager.getLogger(BasePage.class);

    public void setWebDriver(WebDriver webDriver){
        this.webDriver = webDriver;
        wait = new WebDriverWait(webDriver,9);
    }
    protected void clickElementByXpath(String xpath){
        Logger.info("Element is clicked with xpath: " + xpath);
        findElementByXpath(xpath).click();

    }
    protected void getAttribute(String xpath){
        webDriver.findElement(By.xpath(xpath)).getAttribute("value");
    }
    protected void sendTextToElementByXpath(String xpath, String text) {
        Logger.info("the text is inserted to the element with xpath: " + xpath);

        findElementByXpath(xpath).sendKeys(text);
    }
    protected boolean elementExists(String xpath){
        try {
            Logger.info("Checking if element is displayed");
            webDriver.findElement(By.xpath(xpath));
            return true;
        }
        catch(Exception error) {
            return false;
        }
        }
        protected WebElement findElementByXpath(String xpath){
        Logger.info("Finding the element by xpath: " + xpath);
        WebElement element;
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        element = webDriver.findElement(By.xpath(xpath));
        return element;
        }
        protected String getCurrentPageURL(){
        Logger.info("Getting the current URL");

        return webDriver.getCurrentUrl();
        }
        public void takeScreenshot(String name){
            TakesScreenshot takesScreenshot = (TakesScreenshot) webDriver;
            File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(file, new File("Screenshots " + name + ".jpeg"));
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
}



