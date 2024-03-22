package TestCase.QuanLyToChuc.QLNguoiDung;

import Commons.CommonSetup;
import Commons.ReportListener;
import Pages.Login.DashboardPage;
import Pages.Login.SiginPage;
import Pages.QuanLyToChuc.QLNguoiDung.CapNhatNguoiDungPage;
import Pages.QuanLyToChuc.QLNguoiDung.QLNguoiDungPage;
import Pages.QuanLyToChuc.QLToChucPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.Random;

@Listeners(ReportListener.class)
public class CapNhatNguoiDungTest extends CommonSetup {

    private WebDriver driver;
    private SiginPage siginPage;
    private QLToChucPage qlToChucPage;
    private DashboardPage dashboardPage;
    private QLNguoiDungPage qlNguoiDungPage;
    private CapNhatNguoiDungPage capNhatNguoiDungPage;

    @BeforeClass
    public void Setup() {
        driver = getDriver();
    }

    @Test(priority = 1)
    public void openEditUser(){
        siginPage = new SiginPage(driver);
        dashboardPage = siginPage.login("pvcadm","123456",1);
        qlToChucPage = dashboardPage.openQLTC();
        qlNguoiDungPage = qlToChucPage.openQLND();
        capNhatNguoiDungPage = qlNguoiDungPage.openEditUser();
    }

    @Test(priority = 3)
    public void capNhatThongTinCoBanThanhCong() throws InterruptedException {
        driver.navigate().to("https://kinhdoanh.cloudlms.dev/admin/organization/users?tabActive=list");
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
        capNhatNguoiDungPage.openCapNhapnguoiDung();
        capNhatNguoiDungPage.capNhatThongTinCoBanTaiKhoan(ho.toString(), ten.toString(), email, tenDangNhap.toString(),  sdt.toString(), kpiHocTap.toString(), kpiGiangDay.toString(), 1);
    }

    @Test(priority = 2)
    public void capNhatThongTinCoBanHuyBo() throws InterruptedException {
        driver.navigate().to("https://kinhdoanh.cloudlms.dev/admin/organization/users?tabActive=list");
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
        capNhatNguoiDungPage.openCapNhapnguoiDung();
        capNhatNguoiDungPage.capNhatThongTinCoBanTaiKhoan(ho.toString(), ten.toString(), email, tenDangNhap.toString(),  sdt.toString(), kpiHocTap.toString(), kpiGiangDay.toString(), 2);
    }

    @Test(priority = 4)
    public void capNhatThongTinCoBanThatBai() throws InterruptedException {
        driver.navigate().to("https://kinhdoanh.cloudlms.dev/admin/organization/users?tabActive=list");
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
        capNhatNguoiDungPage.openCapNhapnguoiDung();
        capNhatNguoiDungPage.capNhatThongTinCoBanTaiKhoan(ho.toString(), ten.toString(), email, tenDangNhap.toString(),  sdt.toString(), kpiHocTap.toString(), kpiGiangDay.toString(), 3);
    }

    @Test(priority = 5)
    public void capNhatGTNam() throws InterruptedException {
        qlNguoiDungPage.searchNguoiDung("PVC Test Update",1);
        capNhatNguoiDungPage.openCapNhapnguoiDung();
        capNhatNguoiDungPage.capNhatGioiTinh(1);
    }

    @Test(priority = 6)
    public void capNhatGTNu() throws InterruptedException {
        qlNguoiDungPage.searchNguoiDung("PVC Test Update",1);
        capNhatNguoiDungPage.openCapNhapnguoiDung();
        capNhatNguoiDungPage.capNhatGioiTinh(2);
    }

    @Test(priority = 7)
    public void capNhatCCTCXoaTatCa() throws InterruptedException {
        qlNguoiDungPage.searchNguoiDung("PVC Test Update",1);
        capNhatNguoiDungPage.openCapNhapnguoiDung();
        capNhatNguoiDungPage.chinhSuaCCTC("PVC Test Update","chính tạo test Auto","",3);
    }

    @Test(priority = 8)
    public void themMoiCCTCkhongcoVTCD() throws InterruptedException {
        qlNguoiDungPage.searchNguoiDung("PVC Test Update",1);
        capNhatNguoiDungPage.openCapNhapnguoiDung();
        capNhatNguoiDungPage.chinhSuaCCTC("PVC Test Update","chính tạo test Auto","",1);
    }

    @Test(priority = 9)
    public void themMoiCCTCcoVTCD() throws InterruptedException {
        qlNguoiDungPage.searchNguoiDung("PVC Test Update",1);
        capNhatNguoiDungPage.openCapNhapnguoiDung();
        capNhatNguoiDungPage.chinhSuaCCTC("PVC Test Update","chính tạo test Auto","",3);
        capNhatNguoiDungPage.chinhSuaCCTC("PVC Test Update","chính tạo test Auto","Chức danh test",2);
    }

    @Test(priority = 10)
    public void thayDoiCCTCkhongcoVTCD() throws InterruptedException {
        qlNguoiDungPage.searchNguoiDung("PVC Test Update",1);
        capNhatNguoiDungPage.openCapNhapnguoiDung();
        capNhatNguoiDungPage.chinhSuaCCTC("PVC Test Update","chính tạo update","",4);
    }

    @Test(priority = 11)
    public void thayDoiCCTCcoVTCD() throws InterruptedException {
        qlNguoiDungPage.searchNguoiDung("PVC Test Update",1);
        capNhatNguoiDungPage.openCapNhapnguoiDung();
        capNhatNguoiDungPage.chinhSuaCCTC("PVC Test Update","chính tạo test Auto","Chức danh test",5);
    }

    @Test(priority = 12)
    public void capNhatThaiBai() throws InterruptedException {
        qlNguoiDungPage.searchNguoiDung("PVC Test Update",1);
        capNhatNguoiDungPage.openCapNhapnguoiDung();
        capNhatNguoiDungPage.chinhSuaCCTC("PVC Test Update","chính tạo test Auto","",6);
    }

    @Test(priority = 13)
    public void capNhatXoaVTCD() throws InterruptedException {
        qlNguoiDungPage.searchNguoiDung("PVC Test Update",1);
        capNhatNguoiDungPage.openCapNhapnguoiDung();
        capNhatNguoiDungPage.chinhSuaCCTC("PVC Test Update","chính tạo test Auto","",7);
    }

    @Test(priority = 14)
    public void capNhatThemVTCD() throws InterruptedException {
        qlNguoiDungPage.searchNguoiDung("PVC Test Update",1);
        capNhatNguoiDungPage.openCapNhapnguoiDung();
        capNhatNguoiDungPage.chinhSuaCCTC("PVC Test Update","chính tạo test Auto","Chức danh test",8);
    }

    @Test(priority = 15)
    public void capNhatThayDoiVTCD() throws InterruptedException {
        qlNguoiDungPage.searchNguoiDung("PVC Test Update",1);
        capNhatNguoiDungPage.openCapNhapnguoiDung();
        capNhatNguoiDungPage.chinhSuaCCTC("PVC Test Update","chính tạo test Auto","chức danh thay đổi",9);
    }

    @Test(priority = 16)
    public void capNhatThongTinCoBanTabHoSoCaNhan() throws InterruptedException {
//        driver.navigate().to("https://kinhdoanh.cloudlms.dev/admin/organization/users?tabActive=list");
        String characters = "abcdefghijklmnopqrstuvwxyz0123456789";
        String characters1 = "0123456789";
        String tennguoidung = "PVC test update";
        StringBuilder cccd = new StringBuilder();
        StringBuilder noicongtac = new StringBuilder();
        StringBuilder tieusu = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            int randomIndex1 = random.nextInt(characters.length());
            int randomIndex2 = random.nextInt(characters.length());
            int randomIndex4 = random.nextInt(characters.length());
            char randomChar2 = characters.charAt(randomIndex2);
            char randomChar4 = characters.charAt(randomIndex4);
            noicongtac.append(randomChar2);
            tieusu.append(randomChar4);
        }
        for (int i = 0; i < 8; i++) {
            int randomIndex = random.nextInt(characters1.length());
            char randomChar = characters1.charAt(randomIndex);
            cccd.append(randomChar);
        }
        int day, day1, day2, month, month1, month2, year, year1, year2;
        day = random.nextInt(28) + 1;
        day1 = random.nextInt(28) + 1;
        day2 = random.nextInt(28) + 1;
        month = random.nextInt(12) + 1;
        month1 = random.nextInt(12) + 1;
        month2 = random.nextInt(12) + 1;
        year = random.nextInt(2023 - 1900 + 1) + 1900;
        year1 = random.nextInt(2020 - 2015 + 1) + 2015;
        year2 = random.nextInt(2024 - 2021 + 1) + 2021;
        String ngaysinh = String.format("%02d/%02d/%04d", day, month, year);
        String ngaynhanviec = String.format("%02d/%02d/%04d", day1, month1, year1);
        String ngaynghiviec = String.format("%02d/%02d/%04d", day2, month2, year2);
        String trinhdo = "Đại Học";
        qlNguoiDungPage.searchNguoiDung(tennguoidung,1);
        capNhatNguoiDungPage.openCapNhapnguoiDung();
        capNhatNguoiDungPage.gotoTabHoSoCaNhan();
        capNhatNguoiDungPage.capNhatThongTinCoBanHoSoCaNhan(tennguoidung, ngaysinh, cccd.toString(), noicongtac.toString(), trinhdo, ngaynhanviec.toString(), ngaynghiviec.toString(), tieusu.toString(),1);
    }


    @AfterClass
    public void closeBrowser(){
        driver.close();
    }
}
