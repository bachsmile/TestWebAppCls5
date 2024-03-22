package Pages.QuanLyToChuc;

import Commons.ValidateHepler;
import Pages.QuanLyToChuc.QLKieuNguoiDung.QLKieuNguoiDungPage;
import Pages.QuanLyToChuc.QLNguoiDung.QLNguoiDungPage;
import Pages.QuanLyToChuc.QLNguoiDung.QLNguoiDungPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QLToChucPage {
    private WebDriver driver;
    private ValidateHepler validateHepler;
    private By QLKieuNguoiDung = By.xpath("//span[contains(text(),'Kiểu người dùng')]");
    private By QLNguoiDung = By.xpath("//span[contains(text(),'Người dùng')]");
    private By QLNhomNguoiDung = By.xpath("//span[contains(text(),'Quản lý nhóm người dùng')]");
    private By QLCoCauToChuc = By.xpath("//span[contains(text(),'Quản lý cơ cấu tổ chức')]");
    private By QLViTriChucDanh = By.xpath("//span[contains(text(),'Quản lý vị trí chức danh')]");
    private By QLNangLuc = By.xpath("//span[contains(text(),'Quản lý năng lực')]");
    private By QLChungNhan = By.xpath("//span[contains(text(),'Quản lý chứng nhận')]");

    public QLToChucPage(WebDriver driver) {
        this.driver = driver;
        validateHepler = new ValidateHepler(this.driver);
    }
    public QLKieuNguoiDungPage openQLKND(){
        validateHepler.waitForPageLoad();
        validateHepler.clickElement(QLKieuNguoiDung);
        return new QLKieuNguoiDungPage(driver);
    }

    public QLNguoiDungPage openQLND(){
        validateHepler.waitForPageLoad();
        validateHepler.clickElement(QLNguoiDung);
        return new QLNguoiDungPage(driver);
    }

//    public QLKieuNguoiDungPage openQLNhomNguoiDung(){
//        validateHepler.waitForPageLoad();
//        validateHepler.clickElement(QLNhomNguoiDung);
//        return new QLKieuNguoiDungPage(driver);
//    }
//
//    public QLKieuNguoiDungPage openQLCoCauToChuc(){
//        validateHepler.waitForPageLoad();
//        validateHepler.clickElement(QLCoCauToChuc);
//        return new QLKieuNguoiDungPage(driver);
//    }
//
//    public QLKieuNguoiDungPage openQLViTriChucDanh(){
//        validateHepler.waitForPageLoad();
//        validateHepler.clickElement(QLViTriChucDanh);
//        return new QLKieuNguoiDungPage(driver);
//    }
//
//    public QLKieuNguoiDungPage openQLNangLuc(){
//        validateHepler.waitForPageLoad();
//        validateHepler.clickElement(QLNangLuc);
//        return new QLKieuNguoiDungPage(driver);
//    }
//
//    public QLKieuNguoiDungPage openQLChungNhan(){
//        validateHepler.waitForPageLoad();
//        validateHepler.clickElement(QLChungNhan);
//        return new QLKieuNguoiDungPage(driver);
//    }
}
