package Pages.QuanLyToChuc.QLNguoiDung;

import Commons.ValidateHepler;
import org.openqa.selenium.*;
import org.testng.Assert;

import java.util.List;


public class QLNguoiDungPage {

    private WebDriver driver;
    private ValidateHepler validateHepler;
    private By btnThemNguoiDung = By.xpath("//span[contains(text(),'Thêm mới')]");
    private By BthChonCachThemNguoiDung = By.xpath("(//div[@class='btn-group-style']/button)[2]");
    private By themTuTapTin = By.xpath("//span[contains(text(),'Thêm từ tập tin')]");
    private By themTuAPI = By.xpath("//span[contains(text(),'Thêm từ API')]");
    private By btnDuyetNguoiDung = By.xpath("//span[contains(text(),'Duyệt người dùng')]");
    private By timKiem = By.xpath("//input[@placeholder='Tìm kiếm']");
    private By dropdownBtn = By.xpath("//div[@class='d-flex justify-end ml-2']//div[@class='text-center cm-drop-down']//button");
    private By capNhatThongTinChungNguoiDung = By.xpath("//span[contains(text(),'Cập nhật thông tin chung người dùng')]");
    private By capNhatChucDanhTuTepTin = By.xpath("//span[contains(text(),'Cập nhật chức danh từ file')]");
    private By capNhatCoCauToChucTuFile = By.xpath("(//div[@class='dropdown b-dropdown show btn-group']//ul//li)[3]");
    private By xoaTatCa = By.xpath("//div[@class='d-flex']//button");
    private By xoaTapTin = By.xpath("(//div[@class='dropdown b-dropdown show btn-group']//ul//li)[5]");
    private By caiDatHienThi = By.xpath("(//div[@class='dropdown b-dropdown show btn-group']//ul//li)[6]");
    private By xuatExcel = By.xpath("//button[@class='btn mr-1 btn-outline-primary']");
    private By tinhTrangHoatDong = By.xpath("//input[@placeholder='Tình trạng hoạt động']");
    private By tinhTrangHoatDongDropdownList = By.xpath("(//ul[@id='vs2__listbox']//li)[2]");
    private By tinhTrangHoatDongSelected = By.xpath("//div[@id='vs60__combobox']//div[@class='vs__selected-options']//span[@class='vs__selected']");
    private By coCauToChuc = By.xpath("//input[@class='vue-treeselect__input']");
    private By luaChonCoCauToChucInPut = By.xpath("//div[@class='vue-treeselect__multi-value']//input");
    private By luaChonCoCauToChucSelected = By.xpath("//div[@class='vue-treeselect__multi-value-item-container']");
    private By luaChonCoCauToChucDropDownList = By.xpath("(//div[@class='vue-treeselect__menu']//div[@class='vue-treeselect__label-container'])[5]");
    private By nhomNguoiDung = By.xpath("//input[@placeholder='Nhóm người dùng']");
    private By nhomNguoiDungDropdownList = By.xpath("(//ul[@id='vs3__listbox'])");//muốn chọn thì thêm //li vào
    private By nhomNguoiDungSelected = By.xpath("//div[@id='vs3__combobox']//div[@class='vs__selected-options']//span[@class='vs__selected']");
    private By vaiTroNguoiDung = By.xpath("//input[@placeholder='Vai trò người dùng']");
    private By vaiTroNguoiDungDropdownList = By.xpath("//ul[@id='vs4__listbox']");//muốn chọn thì thêm //li vào
    private By vaiTroNguoiDungSelected = By.xpath("//div[@id='vs4__combobox']//div[@class='vs__selected-options']//span[@class='vs__selected']");
    private By tuNgay = By.xpath("(//div[@class='v-field__field'])[1]/input");
    private By denNgay = By.xpath("(//div[@class='v-field__field'])[2]/input");
    private By lichTuNgay = By.xpath("(//button[@class='btn btn-outline-primary btn-sm dropdown-toggle dropdown-toggle-no-caret'])[1]");
    private By lichDenNgay = By.xpath("(//button[@class='btn btn-outline-primary btn-sm dropdown-toggle dropdown-toggle-no-caret'])[2]");
    private By duocThemTu = By.xpath("//input[@placeholder='Được thêm từ']");
    private By duocThemTuDropdownList = By.xpath("//ul[@id='vs5__listbox']");
    private By duocThemTuSelected = By.xpath("//div[@id='vs5__combobox']//div[@class='vs__selected-options']//span[@class='vs__selected']");
    private By checkboxSelectAll = By.xpath("(//div[@class='v-selection-control__input'])[1]");
    private By listNguoiDung = By.xpath("//table//tbody//tr");
    private By headerTitle = By.xpath("//ul[@class='v-breadcrumbs v-breadcrumbs--density-default breadcrumb']//li//div//span");
    private By titleDuyetNguoiDung = By.xpath("//div[@class='text-medium-lg mb-6']");
    private By modalConfirmDelete = By.xpath("//div[@class='v-card v-theme--light v-card--density-default v-card--variant-elevated pa-6']");
    private By btnDongY = By.xpath("//span[@class='v-btn__content']//div[text()='Đồng ý']");
    private By btnHuyBo = By.xpath("//span[@class='v-btn__content']//div[text()='Hủy bỏ']");
    private By dropdownNguoiDung = By.xpath("(//div[@class='action-more px-2'])[1]");
    private By xemChiTiet = By.xpath("//span[contains(text(),'Xem chi tiết')]");
    private By xemBaoCao = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right show']//span[contains(text(),'Xem báo cáo')]");
    private By chinhSua = By.xpath("(//div[@title='Chỉnh sửa'])[1]");
    private By capMatKhau = By.xpath("//span[contains(text(),'Cấp mật khẩu')]");
    private By thayDoiTrangThai = By.xpath("//span[contains(text(),'Thay đổi trạng thái')]");
    private By xoa = By.xpath("(//div[@title='Xóa'])[1]");
    private By modalDoiMatKhau = By.xpath("//div[@class='v-card v-theme--light v-card--density-default v-card--variant-elevated pa-6']");
    private By modalThayDoiTrangThai = By.xpath("//div[@class='v-overlay__content cm-dialogs']");
    private By trangThaiChoDuyet = By.xpath("(//ul[@class='vs__dropdown-menu']//li)[1]");
    private By trangThaiHoatDong = By.xpath("(//ul[@class='vs__dropdown-menu']//li)[2]");
    private By trangThaiKhongHoatDong = By.xpath("(//ul[@class='vs__dropdown-menu']//li)[3]");
    private By trangThaiDaNghi = By.xpath("(//ul[@class='vs__dropdown-menu']//li)[4]");
    private By dropdownTrangThaiNguoiDung = By.xpath("//input[@placeholder='Chọn trạng thái']");
    //private By btnLuuLai = By.xpath("//button[contains(text(),'Lưu lại')]");
    //private By btnX = By.xpath("//button[normalize-space()='×']");
    private By trangThaiNguoiDung = By.xpath("(//div[@class='v-chip__content']/span)[1]");
    private By modalThemTuAPI = By.xpath("//div[@class='v-overlay__content cm-dialogs']");
    private By bangKhongCoDuLieu = By.xpath("//span[contains(text(),'Bảng không có dữ liệu')]");
    private By toast = By.xpath("//div[@class='toast-component']//div");

    public QLNguoiDungPage(WebDriver driver) {
        this.driver = driver;
        validateHepler = new ValidateHepler(this.driver);
    }

    public void locTinhTrangHoatDong(String tinhtranghoatdong, String CCTC, String nhom, String vaiTro, String batDau, String ketThuc, String themTu, int status){
        driver.navigate().to("https://kinhdoanh.cloudlms.dev/admin/organization/users?tabActive=list");
        validateHepler.waitForPageLoad();
        //validateHepler.clickElement(tinhTrangHoatDong);
        validateHepler.setTextElement(tinhTrangHoatDong,tinhtranghoatdong);
        driver.findElement(tinhTrangHoatDong).sendKeys(Keys.ENTER);
        //validateHepler.clickElement(coCauToChuc);
        validateHepler.setTextElement(coCauToChuc,CCTC);
        driver.findElement(coCauToChuc).sendKeys(Keys.ENTER);
        //validateHepler.clickElement(nhomNguoiDung);
        validateHepler.setTextElement(nhomNguoiDung,nhom);
        driver.findElement(nhomNguoiDung).sendKeys(Keys.ENTER);
        //validateHepler.clickElement(vaiTroNguoiDung);
        validateHepler.setTextElement(vaiTroNguoiDung,vaiTro);
        driver.findElement(vaiTroNguoiDung).sendKeys(Keys.ENTER);
        validateHepler.setTextElement(tuNgay,batDau);
        validateHepler.setTextElement(denNgay,ketThuc);
        validateHepler.clickElement(duocThemTu);
        validateHepler.setTextElement(duocThemTu,themTu);
        driver.findElement(duocThemTu).sendKeys(Keys.ENTER);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        switch (status){
            case 1:
                Assert.assertTrue(validateHepler.checkDisplayedElement(listNguoiDung),"Không có người dùng phù hợp");
                break;
            case 2:
                Assert.assertTrue(validateHepler.checkDisplayedElement(bangKhongCoDuLieu),"Có người dùng phù hợp");
                break;
        }
    }

    public void goToAddNguoiDung(int status){
        driver.navigate().to("https://kinhdoanh.cloudlms.dev/admin/organization/users?tabActive=list");
        validateHepler.waitForPageLoad();
        switch (status){
            case 1:
                validateHepler.clickElement(btnThemNguoiDung);
                validateHepler.waitForPageLoad();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Assert.assertEquals(driver.getCurrentUrl(),"https://kinhdoanh.cloudlms.dev/admin/organization/users/profile?tab=infor");
                Assert.assertTrue(validateHepler.verifyElementText(headerTitle,"Thêm mới"),"HeaderTitle không giống");
                break;
            case 2:
                validateHepler.clickElement(BthChonCachThemNguoiDung);
                validateHepler.clickElement(themTuTapTin);
                validateHepler.waitForPageLoad();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Assert.assertEquals(driver.getCurrentUrl(),"https://kinhdoanh.cloudlms.dev/admin/organization/users/import-file-add-user");
                Assert.assertTrue(validateHepler.verifyElementText(headerTitle,"Thêm người dùng từ tập tin"),"HeaderTitle không giống");
                break;
            case 3:
                validateHepler.clickElement(BthChonCachThemNguoiDung);
                validateHepler.clickElement(themTuAPI);
                validateHepler.waitForPageLoad();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Assert.assertTrue(validateHepler.checkDisplayedElement(modalThemTuAPI),"Không có modal thêm từ API");
                break;
        }
    }

    public void goToDuyetNguoiDung(){
        driver.navigate().to("https://kinhdoanh.cloudlms.dev/admin/organization/users?tabActive=list");
        validateHepler.waitForPageLoad();
        validateHepler.clickElement(btnDuyetNguoiDung);
        validateHepler.waitForPageLoad();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals(driver.getCurrentUrl(),"https://kinhdoanh.cloudlms.dev/admin/organization/users?tabActive=approve");
        Assert.assertTrue(validateHepler.verifyElementText(titleDuyetNguoiDung,"Duyệt người dùng"),"HeaderTitle không giống");
    }

    public void searchNguoiDung(String value, int status){
        driver.navigate().to("https://kinhdoanh.cloudlms.dev/admin/organization/users?tabActive=list");
        validateHepler.waitForPageLoad();
        validateHepler.setTextElement(timKiem,value);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        switch (status){
            case 1:
                Assert.assertTrue(validateHepler.checkDisplayedElement(listNguoiDung),"không có người dùng phù hợp");
                break;
            case 2:
                Assert.assertTrue(validateHepler.checkDisplayedElement(bangKhongCoDuLieu),"Vẫn có người dùng");
                break;
                // dang loi
        }
    }

    public void goToCapNhatThongTinChungNguoiDung(){
        driver.navigate().to("https://kinhdoanh.cloudlms.dev/admin/organization/users?tabActive=list");
        validateHepler.waitForPageLoad();
        validateHepler.clickElement(dropdownBtn);
        validateHepler.clickElement(capNhatThongTinChungNguoiDung);
        validateHepler.waitForPageLoad();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals(driver.getCurrentUrl(),"https://kinhdoanh.cloudlms.dev/admin/organization/users/import-file");
        Assert.assertTrue(validateHepler.verifyElementText(headerTitle,"Cập nhật thông tin chung người dùng"),"HeaderTitle không giống");
    }

    public void goToCapNhatChucDanhTuTapTin(){
        driver.navigate().to("https://kinhdoanh.cloudlms.dev/admin/organization/users?tabActive=list");
        validateHepler.waitForPageLoad();
        validateHepler.clickElement(dropdownBtn);
        validateHepler.clickElement(capNhatChucDanhTuTepTin);
        validateHepler.waitForPageLoad();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals(driver.getCurrentUrl(),"https://kinhdoanh.cloudlms.dev/admin/organization/users/import-file-title");
        Assert.assertTrue(validateHepler.verifyElementText(headerTitle,"Cập nhật chức danh từ file"),"HeaderTitle không giống");
    }

//    public void goToCapNhatCoCauToChucTuFile(){
//        driver.navigate().to("https://kinhdoanh.cloudlms.dev/admin/organization/users?tabActive=list");
//        validateHepler.waitForPageLoad();
//        //validateHepler.clickElement(dropdownBtn);
//        validateHepler.clickElement(capNhatCoCauToChucTuFile);
//        validateHepler.waitForPageLoad();
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        Assert.assertEquals(driver.getCurrentUrl(),"https://tester.cls.vn/users/user/update-org-from-file");
//        Assert.assertTrue(validateHepler.verifyElementText(headerTitle,"Cập nhật từ tập tin"),"HeaderTitle không giống");
//    }

    public void xoaTatCa(int status){
        driver.navigate().to("https://kinhdoanh.cloudlms.dev/admin/organization/users?tabActive=list");
        validateHepler.waitForPageLoad();
        validateHepler.clickElement(checkboxSelectAll);
        validateHepler.clickElement(xoaTatCa);
        validateHepler.waitForPageLoad();
        Assert.assertTrue(validateHepler.checkDisplayedElement(modalConfirmDelete),"Chưa có modal xác nhận xoá");
        switch (status){
            case 1:
                validateHepler.clickElement(btnDongY);
                break;
            case 2:
                validateHepler.clickElement(btnHuyBo);
                break;
        }
    }

    public void goToXemChiTiet(){
        driver.navigate().to("https://kinhdoanh.cloudlms.dev/admin/organization/users?tabActive=list");
        validateHepler.waitForPageLoad();
        validateHepler.clickElement(dropdownNguoiDung);
        validateHepler.clickElement(xemChiTiet);
        validateHepler.waitForPageLoad();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(validateHepler.verifyElementText(headerTitle,"Xem chi tiết"),"HeaderTitle không giống");
    }

//    public void goToXemBaoCao(){
//        driver.navigate().to("https://kinhdoanh.cloudlms.dev/admin/organization/users?tabActive=list");
//        validateHepler.waitForPageLoad();
//        validateHepler.clickElement(dropdownNguoiDung);
//        validateHepler.clickElement(xemBaoCao);
//        validateHepler.waitForPageLoad();
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        Assert.assertTrue(validateHepler.verifyElementText(headerTitle,"Thông tin người dùng"),"HeaderTitle không giống");
//    }

    public void goToChinhSua(){
        driver.navigate().to("https://kinhdoanh.cloudlms.dev/admin/organization/users?tabActive=list");
        validateHepler.waitForPageLoad();
        //validateHepler.clickElement(dropdownNguoiDung);
        validateHepler.clickElement(chinhSua);
        validateHepler.waitForPageLoad();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(validateHepler.verifyElementText(headerTitle,"Chỉnh sửa"),"HeaderTitle không giống");
    }

    public void capMatKhau(int status){
        //driver.navigate().to("https://kinhdoanh.cloudlms.dev/admin/organization/users?tabActive=list");
        validateHepler.waitForPageLoad();
        validateHepler.clickElement(dropdownNguoiDung);
        validateHepler.clickElement(capMatKhau);
        validateHepler.waitForPageLoad();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(validateHepler.checkDisplayedElement(modalDoiMatKhau),"Chưa có modal xác nhận đổi mật khẩu");
        switch (status){
            case 1:
                validateHepler.clickElement(btnDongY);
                break;
            case 2:
                validateHepler.clickElement(btnHuyBo);
                break;
        }
    }

    public void thayDoiTrangThai(int status){
        //driver.navigate().to("https://kinhdoanh.cloudlms.dev/admin/organization/users?tabActive=list");
        validateHepler.waitForPageLoad();
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        validateHepler.clickElement(dropdownNguoiDung);
        validateHepler.clickElement(thayDoiTrangThai);
        validateHepler.waitForPageLoad();
        Assert.assertTrue(validateHepler.checkDisplayedElement(modalThayDoiTrangThai),"Chưa có modal thay đổi trạng thái");
        switch (status){
            case 1:
                validateHepler.clickElement(dropdownTrangThaiNguoiDung);
                validateHepler.clickElement(trangThaiChoDuyet);
                validateHepler.clickElement(btnDongY);
                Assert.assertTrue( validateHepler.checkDisplayedElement(toast),"Không có toast hiển thị");
                Assert.assertEquals(driver.findElement(toast).getText(),"Thành công");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Assert.assertEquals(driver.findElement(trangThaiNguoiDung).getText(),"Đang chờ");
                break;
            case 2:
                validateHepler.clickElement(dropdownTrangThaiNguoiDung);
                validateHepler.clickElement(trangThaiHoatDong);
                validateHepler.clickElement(btnDongY);
                Assert.assertTrue( validateHepler.checkDisplayedElement(toast),"Không có toast hiển thị");
                Assert.assertEquals(driver.findElement(toast).getText(),"Thành công");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Assert.assertEquals(driver.findElement(trangThaiNguoiDung).getText(),"Hoạt động");
                break;
            case 3:
                validateHepler.clickElement(dropdownTrangThaiNguoiDung);
                validateHepler.clickElement(trangThaiKhongHoatDong);
                validateHepler.clickElement(btnDongY);
                Assert.assertTrue( validateHepler.checkDisplayedElement(toast),"Không có toast hiển thị");
                Assert.assertEquals(driver.findElement(toast).getText(),"Thành công");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Assert.assertEquals(driver.findElement(trangThaiNguoiDung).getText(),"Không hoạt động");
                break;
            case 4:
                validateHepler.clickElement(dropdownTrangThaiNguoiDung);
                validateHepler.clickElement(trangThaiDaNghi);
                validateHepler.clickElement(btnDongY);
                Assert.assertTrue( validateHepler.checkDisplayedElement(toast),"Không có toast hiển thị");
                Assert.assertEquals(driver.findElement(toast).getText(),"Thành công");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Assert.assertEquals(driver.findElement(trangThaiNguoiDung).getText(),"Đã nghỉ");
                break;
            case 5:
                validateHepler.clickElement(btnHuyBo);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                List<WebElement> modalthaydoitrangthailist = driver.findElements(By.xpath("//div[@class='v-overlay__content cm-dialogs']"));
                Assert.assertTrue(modalthaydoitrangthailist.isEmpty(),"Modal vẫn hiển thị");
                break;
        }
    }

    public void xoaNguoiDung(int status){
        driver.navigate().to("https://kinhdoanh.cloudlms.dev/admin/organization/users?tabActive=list");
        validateHepler.waitForPageLoad();
        //validateHepler.clickElement(dropdownNguoiDung);
        validateHepler.clickElement(xoa);
        validateHepler.waitForPageLoad();
        Assert.assertTrue(validateHepler.checkDisplayedElement(modalConfirmDelete),"Chưa có modal xác nhận đổi mật khẩu");
        switch (status){
            case 1:
                validateHepler.clickElement(btnDongY);
                break;
            case 2:
                validateHepler.clickElement(btnHuyBo);
                break;
        }
    }

    public void themNguoiDung(){
        driver.navigate().to("https://kinhdoanh.cloudlms.dev/admin/organization/users?tabActive=list");
        validateHepler.waitForPageLoad();
        validateHepler.clickElement(btnThemNguoiDung);
    }

    public ThemNguoiDungPage openAddNewUser(){
        validateHepler.waitForPageLoad();
        validateHepler.clickElement(btnThemNguoiDung);
        return new ThemNguoiDungPage(driver);
    }

    public CapNhatNguoiDungPage openEditUser(){
        validateHepler.waitForPageLoad();
        validateHepler.clickElement(dropdownNguoiDung);
        validateHepler.clickElement(chinhSua);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals(driver.findElement(headerTitle).getText(),"Chỉnh sửa");
        return new CapNhatNguoiDungPage(driver);
    }

}
