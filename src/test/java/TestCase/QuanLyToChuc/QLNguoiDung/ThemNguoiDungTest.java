package TestCase.QuanLyToChuc.QLNguoiDung;

import Commons.CommonSetup;
import Commons.ReportListener;
import Pages.Login.DashboardPage;
import Pages.QuanLyToChuc.QLNguoiDung.QLNguoiDungPage;
import Pages.QuanLyToChuc.QLNguoiDung.ThemNguoiDungPage;
import Pages.QuanLyToChuc.QLToChucPage;
import Pages.Login.SiginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.Random;

@Listeners(ReportListener.class)
public class ThemNguoiDungTest extends CommonSetup {

    private WebDriver driver;
    private SiginPage siginPage;
    private QLToChucPage qlToChucPage;
    private DashboardPage dashboardPage;
    private QLNguoiDungPage qlNguoiDungPage;
    private ThemNguoiDungPage themNguoiDungPage;

    @BeforeClass
    public void Setup() {
        driver = getDriver();
    }

    @Test(priority = 1)
    public void openAddNewUser(){
        siginPage = new SiginPage(driver);
        dashboardPage = siginPage.login("pvcadm","123456",1);
        qlToChucPage = dashboardPage.openQLTC();
        qlNguoiDungPage = qlToChucPage.openQLND();
        themNguoiDungPage = qlNguoiDungPage.openAddNewUser();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals(driver.getCurrentUrl(),"https://kinhdoanh.cloudlms.dev/admin/organization/users/profile?tab=infor");
    }

    @Test(priority = 2)
    public void themMoiThanhCong(){
        driver.navigate().to("https://kinhdoanh.cloudlms.dev/admin/organization/users/profile?tab=infor");
        String characters = "abcdefghijklmnopqrstuvwxyz0123456789";
        String characters1 = "0123456789";
        StringBuilder ho = new StringBuilder();
        StringBuilder ten = new StringBuilder();
        StringBuilder tenDangNhap = new StringBuilder();
        StringBuilder sdt = new StringBuilder();
        StringBuilder kpiHocTap = new StringBuilder();
        StringBuilder kpiGiangDay = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            int randomIndex1 = random.nextInt(characters.length());
            int randomIndex2 = random.nextInt(characters.length());
            int randomIndex3 = random.nextInt(characters.length());
            char randomChar1 = characters.charAt(randomIndex1);
            char randomChar2 = characters.charAt(randomIndex2);
            char randomChar3 = characters.charAt(randomIndex3);
            ho.append(randomChar1);
            ten.append(randomChar2);
            tenDangNhap.append(randomChar3);
        }
        for (int i = 0; i < 3; i++) {
            int randomIndex = random.nextInt(characters1.length());
            char randomChar = characters1.charAt(randomIndex);
            kpiHocTap.append(randomChar);
            kpiGiangDay.append(randomChar);
        }
        for (int i = 0; i < 10; i++) {
            int randomIndex = random.nextInt(characters1.length());
            char randomChar = characters1.charAt(randomIndex);
            sdt.append(randomChar);
        }
        String email = tenDangNhap.toString()+"@gmail.com";
        themNguoiDungPage.gotoTabHoSoCaNhan();
        themNguoiDungPage.diaChiTabHoSoCaNhan(2);
        themNguoiDungPage.giaoDucTabHoSoCaNhan(1);
        themNguoiDungPage.kinhNghiemTabHoSoCaNhan(2);
        themNguoiDungPage.themMoiHoSoCaNhan();
        themNguoiDungPage.gotoTabThongTinTaiKhoan();
        themNguoiDungPage.themNguoiDung(1,ho.toString(), ten.toString(), email, tenDangNhap.toString(), "123456", sdt.toString(), kpiHocTap.toString(), kpiGiangDay.toString(), 1);
    }

    @Test(priority = 3)
    public void themMoiLuuVaCapNhat(){
        driver.navigate().to("https://kinhdoanh.cloudlms.dev/admin/organization/users/profile?tab=infor");
        String characters = "abcdefghijklmnopqrstuvwxyz0123456789";
        String characters1 = "0123456789";
        StringBuilder ho = new StringBuilder();
        StringBuilder ten = new StringBuilder();
        StringBuilder tenDangNhap = new StringBuilder();
        StringBuilder sdt = new StringBuilder();
        StringBuilder kpiHocTap = new StringBuilder();
        StringBuilder kpiGiangDay = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            int randomIndex1 = random.nextInt(characters.length());
            int randomIndex2 = random.nextInt(characters.length());
            int randomIndex3 = random.nextInt(characters.length());
            char randomChar1 = characters.charAt(randomIndex1);
            char randomChar2 = characters.charAt(randomIndex2);
            char randomChar3 = characters.charAt(randomIndex3);
            ho.append(randomChar1);
            ten.append(randomChar2);
            tenDangNhap.append(randomChar3);
        }
        for (int i = 0; i < 3; i++) {
            int randomIndex = random.nextInt(characters1.length());
            char randomChar = characters1.charAt(randomIndex);
            kpiHocTap.append(randomChar);
            kpiGiangDay.append(randomChar);
        }
        for (int i = 0; i < 10; i++) {
            int randomIndex = random.nextInt(characters1.length());
            char randomChar = characters1.charAt(randomIndex);
            sdt.append(randomChar);
        }
        String email = tenDangNhap.toString()+"@gmail.com";
        themNguoiDungPage.gotoTabHoSoCaNhan();
        themNguoiDungPage.diaChiTabHoSoCaNhan(2);
        themNguoiDungPage.giaoDucTabHoSoCaNhan(1);
        themNguoiDungPage.kinhNghiemTabHoSoCaNhan(2);
        themNguoiDungPage.themMoiHoSoCaNhan();
        themNguoiDungPage.gotoTabThongTinTaiKhoan();
        themNguoiDungPage.themNguoiDung(1,ho.toString(), ten.toString(), email, tenDangNhap.toString(), "123456", sdt.toString(), kpiHocTap.toString(), kpiGiangDay.toString(), 2);
    }

//*******************************************************************
    @Test(priority = 4)
    public void themMoiThatBai(){
        driver.navigate().to("https://kinhdoanh.cloudlms.dev/admin/organization/users/profile?tab=infor");
        String characters = "abcdefghijklmnopqrstuvwxyz0123456789";
        String characters1 = "0123456789";
        StringBuilder ho = new StringBuilder();
        StringBuilder ten = new StringBuilder();
        StringBuilder tenDangNhap = new StringBuilder();
        StringBuilder sdt = new StringBuilder();
        StringBuilder kpiHocTap = new StringBuilder();
        StringBuilder kpiGiangDay = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            int randomIndex1 = random.nextInt(characters.length());
            int randomIndex2 = random.nextInt(characters.length());
            int randomIndex3 = random.nextInt(characters.length());
            char randomChar1 = characters.charAt(randomIndex1);
            char randomChar2 = characters.charAt(randomIndex2);
            char randomChar3 = characters.charAt(randomIndex3);
            ho.append(randomChar1);
            ten.append(randomChar2);
            tenDangNhap.append(randomChar3);
        }
        for (int i = 0; i < 3; i++) {
            int randomIndex = random.nextInt(characters1.length());
            char randomChar = characters1.charAt(randomIndex);
            kpiHocTap.append(randomChar);
            kpiGiangDay.append(randomChar);
        }
        for (int i = 0; i < 10; i++) {
            int randomIndex = random.nextInt(characters1.length());
            char randomChar = characters1.charAt(randomIndex);
            sdt.append(randomChar);
        }
        String email = tenDangNhap.toString()+"@gmail.com";
        themNguoiDungPage.gotoTabHoSoCaNhan();
        themNguoiDungPage.diaChiTabHoSoCaNhan(2);
        themNguoiDungPage.giaoDucTabHoSoCaNhan(1);
        themNguoiDungPage.kinhNghiemTabHoSoCaNhan(2);
        themNguoiDungPage.themMoiHoSoCaNhan();
        themNguoiDungPage.gotoTabThongTinTaiKhoan();
        themNguoiDungPage.themNguoiDung(1,ho.toString(), ten.toString(), email, tenDangNhap.toString(), "123456", sdt.toString(), kpiHocTap.toString(), kpiGiangDay.toString(), 5);
    }

    @Test(priority = 5)
    public void themMoiQuayLai(){
        driver.navigate().to("https://kinhdoanh.cloudlms.dev/admin/organization/users/profile?tab=infor");
        themNguoiDungPage.themNguoiDung(1,"","","","","","","","", 4);
    }

    @Test(priority = 6)
    public void goToTabToHoSoCaNhan(){
        driver.navigate().to("https://kinhdoanh.cloudlms.dev/admin/organization/users/profile?tab=infor");
        themNguoiDungPage.gotoTabHoSoCaNhan();
    }
//*****************************************************************
//    @Test(priority = 7)
//    public void goToTabThongTinCongViec(){
//        driver.navigate().to("https://kinhdoanh.cloudlms.dev/admin/organization/users/profile?tab=infor");
//        themNguoiDungPage.gotoTabThongTinCongViec();
//    }

    @Test(priority = 8)
    public void themMoiDiaChiThanhCong(){
        driver.navigate().to("https://kinhdoanh.cloudlms.dev/admin/organization/users/profile?tab=infor");
        themNguoiDungPage.gotoTabHoSoCaNhan();
        themNguoiDungPage.diaChiTabHoSoCaNhan(2);
    }

    @Test(priority = 9)
    public void themMoiDiaChiHuyBo(){
        driver.navigate().to("https://kinhdoanh.cloudlms.dev/admin/organization/users/profile?tab=infor");
        themNguoiDungPage.gotoTabHoSoCaNhan();
        themNguoiDungPage.diaChiTabHoSoCaNhan(1);
    }

    @Test(priority = 10)
    public void themMoiGiaoDucHuyBo(){
        driver.navigate().to("https://kinhdoanh.cloudlms.dev/admin/organization/users/profile?tab=infor");
        themNguoiDungPage.gotoTabHoSoCaNhan();
        themNguoiDungPage.giaoDucTabHoSoCaNhan(3);
    }

    @Test(priority = 11)
    public void themMoiGiaoDucThanhCong(){
        driver.navigate().to("https://kinhdoanh.cloudlms.dev/admin/organization/users/profile?tab=infor");
        themNguoiDungPage.gotoTabHoSoCaNhan();
        themNguoiDungPage.giaoDucTabHoSoCaNhan(1);
    }

    @Test(priority = 12)
    public void themMoiGiaoDucThatBai(){
        driver.navigate().to("https://kinhdoanh.cloudlms.dev/admin/organization/users/profile?tab=infor");
        themNguoiDungPage.gotoTabHoSoCaNhan();
        themNguoiDungPage.giaoDucTabHoSoCaNhan(2);
    }

    @Test(priority = 13)
    public void themMoiKinhNghiemThanhCong(){
        driver.navigate().to("https://kinhdoanh.cloudlms.dev/admin/organization/users/profile?tab=infor");
        themNguoiDungPage.gotoTabHoSoCaNhan();
        themNguoiDungPage.kinhNghiemTabHoSoCaNhan(2);
    }

    @Test(priority = 14)
    public void themMoiKinhNghiemThatBai(){
        driver.navigate().to("https://kinhdoanh.cloudlms.dev/admin/organization/users/profile?tab=infor");
        themNguoiDungPage.gotoTabHoSoCaNhan();
        themNguoiDungPage.kinhNghiemTabHoSoCaNhan(3);
    }

    @Test(priority = 15)
    public void themMoiKinhNghiemHuyBo(){
        driver.navigate().to("https://kinhdoanh.cloudlms.dev/admin/organization/users/profile?tab=infor");
        themNguoiDungPage.gotoTabHoSoCaNhan();
        themNguoiDungPage.kinhNghiemTabHoSoCaNhan(1);
    }

    @AfterClass
    public void closeBrowser(){
        driver.close();
    }
}
