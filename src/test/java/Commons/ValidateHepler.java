package Commons;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class ValidateHepler {
    private WebDriver driver;
    private WebDriverWait wait;

    public ValidateHepler(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void setTextElement(By element, String value){
        //wait.until(ExpectedConditions.invisibilityOfElementLocated(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        driver.findElement(element).sendKeys(value);
    }

    public void sendKeysENTER(By element){
        //wait.until(ExpectedConditions.invisibilityOfElementLocated(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        driver.findElement(element).sendKeys(Keys.ENTER);
    }

    public void clickElement(By element){
       // wait.until(ExpectedConditions.invisibilityOfElementLocated(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        driver.findElement(element).click();
    }

    public void selectElementByText(By element, String text){
        //Chuyển từ đối tượng By sang webElement -> driver.findElement()
        Select select = new Select(driver.findElement(element));
        select.selectByVisibleText(text);
    }

    public void selectElementByValue(By element, String value){
        //Chuyển từ đối tượng By sang webElement -> driver.findElement()
        Select select = new Select(driver.findElement(element));
        select.selectByValue(value);
    }
    public void waitForPageLoad(){
        ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver webDriver) {
                return ((JavascriptExecutor)driver).executeScript("return document.readyState").toString().equals("complete");
            }
        };
        ExpectedCondition<Boolean> jQueryLoad = new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                try {
                    return ((Long)((JavascriptExecutor)driver).executeScript("return jQuery.active")==0);
                } catch (Exception e) {
                    return true;
                }
            }
        };
        try {
            wait = new WebDriverWait(driver,Duration.ofSeconds(30));
            wait.until(jsLoad);
            wait.until(jQueryLoad);
        } catch (Exception e) {
            Assert.fail("time out");
        }
    }

    public Boolean checkDisplayedElement(By element) {
        //wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        return driver.findElement(element).isDisplayed();
    }

    public Boolean checkTitle(String value) {
        //wait = new WebDriverWait(driver, 10);
        return driver.getTitle().equals(value);
    }

    public Boolean verifyElementText(By element,String value) {
        return driver.findElement(element).getText().equals(value);
    }

    public boolean verifyUrl(String url){
        return driver.getCurrentUrl().contains(url);
    }

    public void clearinputbox(By element){
        driver.findElement(element).clear();
    }

    public boolean checkenableclickbutton(By element){
        return driver.findElement(element).isDisplayed()&&driver.findElement(element).isEnabled();
    }

    public boolean checkStatusCheckbox(By element){
        return driver.findElement(element).isSelected();
    }

}
