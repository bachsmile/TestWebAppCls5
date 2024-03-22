package Pages.Login;

import Commons.ValidateHepler;
import Pages.QLKHPage;
import Pages.QuanLyToChuc.QLToChucPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DashboardPage {

    WebDriver driver;
    private ValidateHepler validateHepler;
    private By toChucDaoTao = By.xpath("//span[contains(text(),'Tổ chức đào tạo')]");
    private By QLKH = By.xpath("//span[@class='menu-title break-spaces'][contains(text(),'Quản lý khóa học')]");
    private By QLTC = By.xpath("//span[contains(text(),'Quản lý tổ chức')]");
    private String url = "/dashboard/admin";

    public DashboardPage(WebDriver driver){
        this.driver = driver;
        validateHepler = new ValidateHepler(this.driver);
    }

    public void openTCDT(){
        validateHepler.waitForPageLoad();
        Assert.assertTrue(validateHepler.verifyUrl(url),"Không phải trang Dashboard");
        validateHepler.clickElement(toChucDaoTao);
    }

    public QLKHPage openQLKH(){
        validateHepler.waitForPageLoad();
        validateHepler.clickElement(QLKH);
        return new QLKHPage(driver);
    }

    public QLToChucPage openQLTC(){
        validateHepler.waitForPageLoad();
        validateHepler.clickElement(QLTC);
        return new QLToChucPage(driver);
    }

    public void checkSearchTableByColum(int colum, String value){

    }
}
