package TestCase.QuanLyToChuc.QLKieuNguoiDung;

import Commons.CommonSetup;
import Commons.ReportListener;
import Commons.ValidateHepler;
import Pages.Login.DashboardPage;
import Pages.Login.SiginPage;
import Pages.QuanLyToChuc.QLKieuNguoiDung.QLKieuNguoiDungPage;
import Pages.QuanLyToChuc.QLToChucPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.Random;

@Listeners(ReportListener.class)
public class QuanLyKieuNguoiDungTest extends CommonSetup {

    private WebDriver driver;
    private ValidateHepler validateHepler;
    private SiginPage siginPage;
    private DashboardPage dashboardPage;
    private QLToChucPage qlToChucPage;
    private QLKieuNguoiDungPage qlKieuNguoiDungPage;

    @BeforeClass
    public void Setup(){
        driver = getDriver();
    }

    @Test(priority = 1)
    public void openQLKNDPage(){
        siginPage = new SiginPage(driver);
        dashboardPage = siginPage.login("pvcadm","123456",1);
        qlToChucPage = dashboardPage.openQLTC();
        qlKieuNguoiDungPage = qlToChucPage.openQLKND();
    }

    @Test(priority = 2)
    public void searchKieuNguoiDungFail(){
        qlKieuNguoiDungPage.searchQLKND("Học viên ABC",2);
    }

    @Test(priority = 3)
    public void searchKieuNguoiDungTrue(){
        qlKieuNguoiDungPage.searchQLKND("Chính",1);
    }

    @Test(priority = 4)
    public void gotoAddNewKieuNguoiDungPage(){
        qlKieuNguoiDungPage.gotoAddNewPage();
    }

    @Test(priority = 5)
    public void editKieuNguoiDung(){
        qlKieuNguoiDungPage.edit();
    }

    @Test(priority = 6)
    public void deleteNewKieuNguoiDung(){
        qlKieuNguoiDungPage.delete();
    }

    @Test(priority = 7)
    public void addNewBacktoList(){
        qlKieuNguoiDungPage.addNewBackToList();
    }
//
//    @Test(priority = 8)
//    public void addNewReset(){
//        qlKieuNguoiDungPage.addNewReset();
//Đang lỗi k hiển thị danh sách quyền
//    }
//
//    @Test(priority = 9)
//    public void addNewKieuNguoiDungSuccess(){
//        String characters = "abcdefghijklmnopqrstuvwxyz0123456789";
//        StringBuilder randomString = new StringBuilder();
//
//        Random random = new Random();
//        for (int i = 0; i < 6; i++) {
//            int randomIndex = random.nextInt(characters.length());
//            char randomChar = characters.charAt(randomIndex);
//            randomString.append(randomChar);
//        }
//        qlKieuNguoiDungPage.addNewKieuNguoiDung(randomString.toString(),1);
//    }
//
//    @Test(priority = 10)
//    public void addNewKieuNguoiDungFail(){
//        String characters = "abcdefghijklmnopqrstuvwxyz0123456789";
//        StringBuilder randomString = new StringBuilder();
//
//        Random random = new Random();
//        for (int i = 0; i < 6; i++) {
//            int randomIndex = random.nextInt(characters.length());
//            char randomChar = characters.charAt(randomIndex);
//            randomString.append(randomChar);
//        }
//        qlKieuNguoiDungPage.addNewKieuNguoiDung(randomString.toString(),2);
//    }
//
//    @Test(priority = 11)
//    public void editKieuNguoiDungSaveSuccess(){
//        qlKieuNguoiDungPage.searchQLKND("QTV chính tạo không đụng",1);
//        qlKieuNguoiDungPage.editKND(1);
//    }
//
//    @Test(priority = 12)
//    public void editKieuNguoiDungSaveFail(){
//        qlKieuNguoiDungPage.searchQLKND("QTV chính tạo không đụng",1);
//        qlKieuNguoiDungPage.editKND(2);
//    }
//
//    @Test(priority = 13)
//    public void editKieuNguoiDungReset(){
//        qlKieuNguoiDungPage.searchQLKND("học viên chính tạo",1);
//        qlKieuNguoiDungPage.editReset();
//    }
//
//    @Test(priority = 14)
//    public void editKieuNguoiDungBackToListND(){
//        qlKieuNguoiDungPage.edit();
//        qlKieuNguoiDungPage.editBackToList();
//    }

    @AfterClass
    public void closeBrowser(){
        driver.close();
    }
}
