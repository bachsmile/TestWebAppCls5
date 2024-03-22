package Pages;

import Commons.ValidateHepler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static java.lang.Thread.sleep;

public class QLKHPage {

    WebDriver driver;
    private ValidateHepler validateHepler;
    private By nameCourse = By.xpath("(//table//tbody//tr[1]//td[2])[2]");
    private By inputSearch = By.xpath("//div[@class='input-search']//input");


    public QLKHPage(WebDriver driver){
        this.driver = driver;
        validateHepler = new ValidateHepler(this.driver);
    }

    public void CheckSearchTableColum(int colum, String value) throws InterruptedException {
        validateHepler.setTextElement(inputSearch,value);
        sleep(5000);
        List<WebElement> listCourse = driver.findElements(By.xpath("//table//tbody//tr//td//div[@class=\"font-weight-bolder\"]"));
        if(listCourse.size()>0) {
            for (int i = 1; i <= listCourse.size(); i++) {
                WebElement elementcheck = driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td["+colum+"]//div[@class=\"font-weight-bolder\"]"));
                System.out.println(elementcheck.getText());
                //Assert.assertTrue(elementcheck.getText().equals(value),"Không có khoá học này");
            }
        }
    }
}
