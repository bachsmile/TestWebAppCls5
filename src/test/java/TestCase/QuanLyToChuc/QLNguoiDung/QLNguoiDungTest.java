package TestCase.QuanLyToChuc.QLNguoiDung;

import Commons.CommonSetup;
import Commons.ReportListener;
import Commons.ValidateHepler;
import Pages.Login.DashboardPage;
import Pages.QuanLyToChuc.QLNguoiDung.QLNguoiDungPage;
import Pages.QuanLyToChuc.QLToChucPage;
import Pages.Login.SiginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ReportListener.class)
public class QLNguoiDungTest extends CommonSetup {

    private WebDriver driver;
    private ValidateHepler validateHepler;
    private SiginPage siginPage;
    private QLToChucPage qlToChucPage;
    private DashboardPage dashboardPage;
    private QLNguoiDungPage qlNguoiDungPage;

    @BeforeClass
    public void setup(){
        driver = getDriver();
    }

    @Test(priority = 1)
    public void openQLNguoiDungPage(){
        siginPage = new SiginPage(driver);
        dashboardPage = siginPage.login("pvcadm","123456",1);
        qlToChucPage = dashboardPage.openQLTC();
        qlNguoiDungPage = qlToChucPage.openQLND();
    }

    @Test(priority = 2)
    public void locDanhSachNguoiDung(){
        qlNguoiDungPage.locTinhTrangHoatDong("Hoạt động","CCTC chính","chính tạo","Học viên","01/01/2021","01/11/2024","Trực tiếp",1);
    }

//    @Test(priority = 2)
//    public void locDanhSachNguoiDungNull(){
//        qlNguoiDungPage.locTinhTrangHoatDong("Đã nghỉ","CCTC chính","chính tạo","Học viên","1/11/2023","1/11/2024","Thêm từ tập tin",2);
//    }

    @Test(priority = 3)
    public void goToAddNguoiDungTrucTiep(){
        qlNguoiDungPage.goToAddNguoiDung(1);
    }

    @Test(priority = 4)
    public void goToAddNguoiDungTuFile(){
        qlNguoiDungPage.goToAddNguoiDung(2);
    }

    @Test(priority = 5)
    public void goToAddNguoiTuAPI(){
        qlNguoiDungPage.goToAddNguoiDung(3);
    }

    @Test(priority = 6)
    public void goToDuyetNguoiDung(){
        qlNguoiDungPage.goToDuyetNguoiDung();
    }


    @Test(priority = 7)
    public void searchNguoiDung(){
        qlNguoiDungPage.searchNguoiDung("pvc00",1);
    }

//    @Test(priority = 8)
//    public void searchNguoiDungNull(){
//        qlNguoiDungPage.searchNguoiDung("pvckhongco%%%",2);
//     Chua xac nhan duoc vi chua co img khi danh sach du lieu trong
//    }

    @Test(priority = 9)
    public void goToCapNhatThongTinNguoiDung(){
        qlNguoiDungPage.goToCapNhatThongTinChungNguoiDung();
    }

    @Test(priority = 10)
    public void goToCapNhatChucDanhTuTapTin(){
        qlNguoiDungPage.goToCapNhatChucDanhTuTapTin();
    }

//    @Test(priority = 11)
//    public void goToCapNhatCoCauToChucTuFile(){
//        qlNguoiDungPage.goToCapNhatCoCauToChucTuFile();
//        //chua co button
//    }
//
//    @Test(priority = 12)
//    public void xoaTatCa(){
//        //chua test
//    }
//
    @Test(priority = 13)
    public void xoaTatCaHuyBo(){
        qlNguoiDungPage.xoaTatCa(2);
    }

    @Test(priority = 14)
    public void goToXemChiTiet(){
        qlNguoiDungPage.goToXemChiTiet();
    }

//    @Test(priority = 15)
//    public void goToXemBaoCao(){
//        qlNguoiDungPage.goToXemBaoCao();
//        // chua co button
//    }
//
    @Test(priority = 16)
    public void goToChinhSua(){
        qlNguoiDungPage.goToChinhSua();
    }

    @Test(priority = 17)
    public void capMatKhau(){
        qlNguoiDungPage.searchNguoiDung("Chính test",1);
        qlNguoiDungPage.capMatKhau(2);
    }

    @Test(priority = 18)
    public void capMatKhauHuyBo(){
        qlNguoiDungPage.searchNguoiDung("Chính test",1);
        qlNguoiDungPage.capMatKhau(1);
    }

    @Test(priority = 19)
    public void thayDoiTrangThaiDangChoDuyet(){
        qlNguoiDungPage.searchNguoiDung("Chính test",1);
        qlNguoiDungPage.thayDoiTrangThai(1);
    }

    @Test(priority = 20)
    public void thayDoiTrangThaiHoatDong(){
        qlNguoiDungPage.thayDoiTrangThai(2);
    }

    @Test(priority = 21)
    public void thayDoiTrangThaiKhongHoatDong(){
        qlNguoiDungPage.thayDoiTrangThai(3);
    }

    @Test(priority = 22)
    public void thayDoiTrangThaiDaNghi(){
        qlNguoiDungPage.thayDoiTrangThai(4);
    }

//    @Test(priority = 23)
//    public void thayDoiTrangHuyBo(){
//        qlNguoiDungPage.thayDoiTrangThai(5);
//    }

    @AfterClass
    public void closeBrowser(){
        driver.close();
    }
}
