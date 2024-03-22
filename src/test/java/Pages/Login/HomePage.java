package Pages.Login;

import Commons.ValidateHepler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    private ValidateHepler validateHepler;
    private By accountAvatar = By.xpath("//div[@class='box-avatar']");
    private By quanTriVien = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right show']/li[1]");

    public HomePage(WebDriver driver){
        this.driver = driver;
        validateHepler = new ValidateHepler(this.driver);
    }

    public DashboardPage openDasdBoard(){
        validateHepler.waitForPageLoad();
        validateHepler.clickElement(accountAvatar);
        validateHepler.clickElement(quanTriVien);
        validateHepler.waitForPageLoad();
        return new DashboardPage(driver);
    }
}
