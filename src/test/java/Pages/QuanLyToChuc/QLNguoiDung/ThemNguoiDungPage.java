package Pages.QuanLyToChuc.QLNguoiDung;

import Commons.ValidateHepler;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;

public class ThemNguoiDungPage {
    private WebDriver driver;
    private ValidateHepler validateHepler;

    private By ho = By.xpath("//input[@name='lastName']");
    private By ten = By.xpath("//input[@name='firstName']");
    private By email = By.xpath("//input[@name='email']");
    private By tenDangNhap = By.xpath("//input[@name='userName']");
    private By matKhau = By.xpath("//input[@name='password']");
    private By sdt = By.xpath("//input[@name='tel']");
    private By vaiTroNguoiDung = By.xpath("//input[@placeholder='Vai trò người dùng']");
    private By trangThai = By.xpath("//input[@placeholder='Trạng thái']");
    //private By dropdowTrangThaiHoatDong = By.xpath("//ul[@id='vs3__listbox']//li[2]");
    private By kpiHocTap = By.xpath("//input[@name='kpiLearn']");
    private By kpiGiangDay = By.xpath("//input[@name='kpiTeach']");
    private By checkboxKhoaHoc = By.xpath("(//div[@class='v-selection-control__input'])[3]");
    private By checkboxLoTrinhDaoTao = By.xpath("(//div[@class='v-selection-control__input'])[4]");
    private By btnLuuLai = By.xpath("(//div[@class='ml-3']//span[@class='v-btn__content'])[1]");
    private By btnHuyBo = By.xpath("//div[@class='color-dark']");
    //private By btnDropDowLuuLai = By.xpath("//button[@class='btn dropdown-toggle btn-primary dropdown-toggle-split']");
    private By luuVaCapNhat = By.xpath("(//div[@class='ml-3']//span[@class='v-btn__content'])[2]");
    private By anhDaiDien = By.xpath("//span[@class='custom-badge-content cursor-pointer']");
    private By themMoiCCTC = By.xpath("//div[@class='footer-action-container']//button//div");
    private By inputLuaChonCCTC = By.xpath("//input[@class='vue-treeselect__input']");
    private By inputViTriChucDanh = By.xpath("//input[@placeholder='Vị trí chức danh']");
    private By gtNam = By.xpath("(//div[@class='v-selection-control__input'])[1]");
    private By gtNu = By.xpath("(//div[@class='v-selection-control__input'])[2]");
    private By emailCheck = By.xpath("//tbody//tr[1]/td[3]/span");
    private By toast = By.xpath("//div[@class='toast-component']//div[@class='text-semibold-sm']");
    private By tabThongTinTaiKhoan = By.xpath("//button[@value='infor']");
    private By tabHoSoCaNhan = By.xpath("//button[@value='resumer']");
    //private By tabToChuc = By.xpath("(//ul[@class='nav nav-pills']//li//a)[4]");
    private By inputNgaySinh = By.xpath("(//div[@class='v-field__field']//input[@placeholder='DD/MM/YYYY'])[1]");
    private By inputCMNDHoChieu = By.xpath("//div[@class='v-field__field']//input[@name='passport']");
    private By themMoiDiaChi = By.xpath("//cmbutton[@class='cursor-pointer']//span[@class='color-primary align-center']");
    private By themMoiGiaoDuc = By.xpath("(//blink[@class='d-flex align-center cursor-pointer']//span)[1]");
    private By themMoiKinhNghiem = By.xpath("(//blink[@class='d-flex align-center cursor-pointer']//span)[2]");
    private By inputQuocGia = By.xpath("//input[@placeholder='Quốc gia']");
    private By inputTinhThanhPho = By.xpath("//input[@placeholder='Tỉnh/Thành phố']");
    private By inputQuanHuyen = By.xpath("//input[@placeholder='Quận/Huyện']");
    private By inputPhuongXa = By.xpath("//input[@placeholder='Phường/xã']");
    private By inputTenDuong = By.xpath("//input[@placeholder='Tên đường']");
    //private By btnHuyBo = By.xpath("//button[contains(text(),'Hủy bỏ')]");
    private By btnDongYModal = By.xpath("//span[@class='v-btn__content']//div[.='Đồng ý']");
    private By btnHuyBoModal = By.xpath("(//span[@class='v-btn__content']//div[.='Hủy bỏ'])[2]");
    private By modalTitle = By.xpath("//div[@class='v-card__image']");
    private By inputTenTruong = By.xpath("//input[@placeholder='Tên trường']");
    private By inputBangCap = By.xpath("//input[@placeholder='Bằng cấp']");
    private By nam = By.xpath("//div[@class='v-field__field']//input[@placeholder='yyyy']");
    private By inputMoTaModal = By.xpath("(//div[@class='v-field__field']//textarea[@class='v-field__input'])[2]");
    //private By btnLuuLaiModalGiaoDuc = By.xpath("//footer[@id='modalEducation___BV_modal_footer_']//button[@type='button'][contains(text(),'Lưu lại')]");
    //private By btnX = By.xpath("//button[normalize-space()='×']");
    private By inputTenCongTy = By.xpath("//input[@name='companyName']");
    private By inputViTri = By.xpath("//input[@name='position']");
    private By checkboxDangLamViecTaiDay = By.xpath("//input[@test='test-isWork']");
    private By tuNam = By.xpath("//input[@test='test-from-years-input']");
    private By denNam = By.xpath("//input[@test='test-to-years-input']");
    //private By inputMoTaModalMinhNghiem = By.xpath("(//textarea[@id='textarea-default'])[2]");
    //private By btnLuuLaiModalKinhNghiem = By.xpath("//footer[@id='modalExperences___BV_modal_footer_']//button[@type='button'][contains(text(),'Lưu lại')]");
    private By inputNoiCongTac = By.xpath("//input[@placeholder='Nhập nơi công tác']");
    private By inputTrinhDo = By.xpath("//input[@placeholder='Trình độ']");
    private By dropdownTrinhDoDaiHoc = By.xpath("//ul[@id='vs4__listbox']//li[6]");
    private By inputNgayNhanViec = By.xpath("//input[@test='employment-input-date-time']");
    private By inputNgayNghiViec = By.xpath("//input[@test='quitJobDate-input-date-time']");
    private By inputTieuSu = By.xpath("//div[@class='v-field__field']//textarea[@class='v-field__input']");
//    private By btnThemNhom = By.xpath("//span[normalize-space()=\'Thêm nhóm\']");
//    private By inputTimKiemTabToChucNhomnguoiDung = By.xpath("(//div[@class='input-search spaceSearch']//input)[1]");
//    private By dropdownTabTochucNhomNguoiDung = By.xpath("(//button[@class='btn dropdown-toggle btn-link dropdown-toggle-no-caret'])[1]");
//    private By xoaTatCaTabToChucNhomNguoiDung = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right show']//a[@role='menuitem']");
//    private By chonNamGiaoDuc = By.xpath("//span[@class='btn border-0 rounded-circle text-nowrap btn-outline-light text-dark font-weight-bold'][normalize-space()='1']");
    private By moDalThemMoiGiaoDuc = By.xpath("//div[@class='v-card v-theme--light v-card--density-default v-card--variant-elevated shadow-md bg-white modal-custom-divspace']");
    private By danhSachGiaoDuc = By.xpath("//div[@class='style-education']");
    private By danhSachDiaChi = By.xpath("//span[@class='text-medium-sm color-5']");
    private By danhSachKinhNghiem = By.xpath("//div[@class='style-experience']");
    private By QLNguoiDung = By.xpath("//span[contains(text(),'Người dùng')]");
//    private By btnDropDownDiaChi = By.xpath("//div[@class='content-form mb-2']/div[@class='row']/div[3]//button");
//    private By dropdownDiaChiXoa = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right show']//span[contains(text(),'Xóa')]");
//    private By dropdownDiaChiChinhSua = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right show']//span[contains(text(),'Chỉnh sửa')]");
//    private By btnDropDownGiaoDuc = By.xpath("//div[@class='style-education']//div[@class='row']//button");
//    private By dropdownGiaoDucXoa = By.xpath("//ul[@class='dropdown-menu show']//span[contains(text(),'Xóa')]");
//    private By dropdownGiaoDucChinhSua = By.xpath("//div[@class='style-education']//li[1]");
//    private By btnDropDownKinhNghiem = By.xpath("//div[@class='style-experience']//div[contains(@class,'dropdown b-dropdown table-info-action btn-group')]//button");
//    private By dropdownKinhNghiemXoa = By.xpath("//ul[@class='dropdown-menu show']//span[contains(text(),'Xóa')]");
//    private By dropdownKinhNghiemChinhSua = By.xpath("//ul[@class='dropdown-menu show']//span[contains(text(),'Chỉnh sửa')]");
//    private By diaChi = By.xpath("//div[@class='addressStyle']");
//    private By giaoDuc = By.xpath("//div[@class='style-education']//div[@class='col-7']//div[1]");
//    private By kinhNghiem = By.xpath("//span[@class='badge badge-light-warning']//div");


    public ThemNguoiDungPage(WebDriver driver) {
        this.driver = driver;
        validateHepler = new ValidateHepler(driver);
    }

    public void themNguoiDung(int gioitinh, String hond, String tennd, String emailnd, String tendangnhapnd, String matkhaund, String sdtnd, String kpihoctapnd, String kpigiangdaynd, int status) {
        validateHepler.waitForPageLoad();
        validateHepler.setTextElement(ho, hond);
        validateHepler.setTextElement(ten, tennd);
        validateHepler.setTextElement(email, emailnd);
        validateHepler.setTextElement(tenDangNhap, tendangnhapnd);
        validateHepler.setTextElement(matKhau, matkhaund);
        validateHepler.setTextElement(sdt, sdtnd);
        validateHepler.setTextElement(kpiHocTap, kpihoctapnd);
        validateHepler.setTextElement(kpiGiangDay, kpigiangdaynd);
        validateHepler.clickElement(vaiTroNguoiDung);
        validateHepler.setTextElement(vaiTroNguoiDung, "chính test auto");
        driver.findElement(vaiTroNguoiDung).sendKeys(Keys.ENTER);
        validateHepler.clickElement(trangThai);
        validateHepler.setTextElement(trangThai, "hoạt động");
        driver.findElement(trangThai).sendKeys(Keys.ENTER);
        validateHepler.clickElement(themMoiCCTC);
        validateHepler.clickElement(inputLuaChonCCTC);
        validateHepler.setTextElement(inputLuaChonCCTC, "chính tạo test Auto");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(inputLuaChonCCTC).sendKeys(Keys.ENTER);
        validateHepler.clickElement(inputViTriChucDanh);
        validateHepler.setTextElement(inputViTriChucDanh, "chức danh test");
        driver.findElement(inputViTriChucDanh).sendKeys(Keys.ENTER);
        switch (status) {
            case 1:
                validateHepler.clickElement(btnLuuLai);
                validateHepler.waitForPageLoad();
                Assert.assertTrue(validateHepler.checkDisplayedElement(toast), "Không hiển thị thông báo tạo mới thành công");
                Assert.assertEquals(driver.findElement(toast).getText(), "Tạo mới thành công");
                Assert.assertEquals(driver.findElement(emailCheck).getText(), emailnd);
                break;
            case 2:
                validateHepler.clickElement(luuVaCapNhat);
                Assert.assertTrue(validateHepler.checkDisplayedElement(toast), "Không hiển thị thông báo tạo mới thành công");
                Assert.assertEquals(driver.findElement(toast).getText(), "Tạo mới thành công");
                validateHepler.waitForPageLoad();
                Actions actions = new Actions(driver);
                actions.doubleClick(driver.findElement(QLNguoiDung)).perform();
                validateHepler.waitForPageLoad();
                Assert.assertEquals(driver.findElement(emailCheck).getText(), emailnd);
                break;
//            case 3:
//                validateHepler.clickElement(luuVaThemMoi);
//                Assert.assertTrue(validateHepler.checkDisplayedElement(toastSuccess), "Không hiển thị thông báo tạo mới thành công");
//                Assert.assertEquals(driver.findElement(toastSuccess).getText(), "Tạo mới thành công");
//                break;
            case 4:
                validateHepler.clickElement(btnHuyBo);
                Assert.assertEquals(driver.getCurrentUrl(), "https://kinhdoanh.cloudlms.dev/admin/organization/users?tabActive=list");
                break;
            case 5:
                validateHepler.clearinputbox(email);
                validateHepler.setTextElement(email,"pvc005@gmail.com");
                validateHepler.clickElement(btnLuuLai);
                Assert.assertTrue(validateHepler.checkDisplayedElement(toast), "Không hiển thị thông báo lỗi");
                Assert.assertEquals(driver.findElement(toast).getText(), "Email đã tồn tại");
                break;
        }
    }

    public void gotoTabThongTinTaiKhoan() {
        validateHepler.waitForPageLoad();
        validateHepler.clickElement(tabThongTinTaiKhoan);
        Assert.assertEquals(driver.findElement(tabThongTinTaiKhoan).getAttribute("aria-selected"), "true");
    }

    public void gotoTabHoSoCaNhan() {
        validateHepler.waitForPageLoad();
        validateHepler.clickElement(tabHoSoCaNhan);
        Assert.assertEquals(driver.findElement(tabHoSoCaNhan).getAttribute("aria-selected"), "true");
    }

//    public void gotoTabToChuc() {
//        validateHepler.waitForPageLoad();
//        validateHepler.clickElement(tabToChuc);
//        Assert.assertEquals(driver.findElement(tabToChuc).getAttribute("aria-selected"), "true");
//    }

    public void diaChiTabHoSoCaNhan(int status) {
        Assert.assertEquals(driver.findElement(tabHoSoCaNhan).getAttribute("aria-selected"), "true");
        validateHepler.waitForPageLoad();
        validateHepler.clickElement(themMoiDiaChi);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        validateHepler.clickElement(inputQuocGia);
        validateHepler.setTextElement(inputQuocGia, "Việt Nam");
        driver.findElement(inputQuocGia).sendKeys(Keys.ENTER);
        validateHepler.clickElement(inputTinhThanhPho);
        validateHepler.setTextElement(inputTinhThanhPho, "Đà Nẵng");
        driver.findElement(inputTinhThanhPho).sendKeys(Keys.ENTER);
        validateHepler.clickElement(inputQuanHuyen);
        validateHepler.setTextElement(inputQuanHuyen, "Hải Châu");
        driver.findElement(inputQuanHuyen).sendKeys(Keys.ENTER);
        validateHepler.clickElement(inputPhuongXa);
        validateHepler.setTextElement(inputPhuongXa, "Thạch Thang");
        driver.findElement(inputPhuongXa).sendKeys(Keys.ENTER);
        validateHepler.setTextElement(inputTenDuong, "Quang Trung");
        switch (status) {
            case 1:
                validateHepler.clickElement(btnHuyBoModal);
                validateHepler.waitForPageLoad();
                List<WebElement> listDiaChi = driver.findElements(danhSachDiaChi);
                Assert.assertTrue(listDiaChi.isEmpty(), "Địa chỉ vẫn được thêm vào");
                break;
            case 2:
                validateHepler.clickElement(btnDongYModal);
                Assert.assertTrue(validateHepler.checkDisplayedElement(danhSachDiaChi), "Địa chỉ không được thêm vào");
                break;
        }
    }

    public void giaoDucTabHoSoCaNhan(int status) {
        Assert.assertEquals(driver.findElement(tabHoSoCaNhan).getAttribute("aria-selected"), "true");
        validateHepler.waitForPageLoad();
        validateHepler.clickElement(themMoiGiaoDuc);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        validateHepler.clickElement(inputTenTruong);
        validateHepler.setTextElement(inputTenTruong, "Bách Khoa");
        driver.findElement(inputTenTruong).sendKeys(Keys.ENTER);
        validateHepler.clickElement(inputBangCap);
        validateHepler.setTextElement(inputBangCap, "Đại Học");
        driver.findElement(inputBangCap).sendKeys(Keys.ENTER);
        validateHepler.setTextElement(inputMoTaModal, "Đây là mô tả test");
        switch (status) {
            case 1:
                validateHepler.clickElement(nam);
                //validateHepler.clickElement(chonNamGiaoDuc);
                validateHepler.setTextElement(nam,"2020");
                validateHepler.clickElement(btnDongYModal);
                validateHepler.waitForPageLoad();
                Assert.assertTrue(validateHepler.checkDisplayedElement(danhSachGiaoDuc), "không có danh sách giáo dục");
                break;
            case 2:
                validateHepler.clickElement(btnDongYModal);
                Assert.assertTrue(validateHepler.checkDisplayedElement(moDalThemMoiGiaoDuc), "Modal thêm mới giáo dục không còn hiển thị");
                break;
            case 3:
                validateHepler.clickElement(btnHuyBoModal);
                List<WebElement> listGiaoDuc = driver.findElements(danhSachGiaoDuc);
                Assert.assertTrue(listGiaoDuc.isEmpty(), "Vẫn thêm mới giáo duục thành công");
                break;
        }
    }

    public void kinhNghiemTabHoSoCaNhan(int status) {
        Assert.assertEquals(driver.findElement(tabHoSoCaNhan).getAttribute("aria-selected"), "true");
        validateHepler.waitForPageLoad();
        validateHepler.clickElement(themMoiKinhNghiem);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        validateHepler.setTextElement(inputTenCongTy, "Hương Việt");
        validateHepler.setTextElement(inputViTri, "Tester");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", driver.findElement(checkboxDangLamViecTaiDay));
        //validateHepler.clickElement(checkboxDangLamViecTaiDay);
        validateHepler.clickElement(tuNam);
        validateHepler.setTextElement(tuNam,"2021");
        //validateHepler.clickElement(chonNamGiaoDuc);
        validateHepler.clickElement(denNam);
        validateHepler.setTextElement(denNam,"2024");
        //validateHepler.clickElement(chonNamGiaoDuc);
        validateHepler.setTextElement(inputMoTaModal, "Đây là mô tả test");
        switch (status) {
            case 1:
                validateHepler.clickElement(btnHuyBoModal);
                validateHepler.waitForPageLoad();
                List<WebElement> listKinhNghiem = driver.findElements(danhSachKinhNghiem);
                Assert.assertTrue(listKinhNghiem.isEmpty(), "kinh nghiệm vẫn được thêm vào");
                break;
            case 2:
                validateHepler.clickElement(btnDongYModal);
                Assert.assertTrue(validateHepler.checkDisplayedElement(danhSachKinhNghiem), "Kinh nghiem không được thêm vào");
                break;
            case 3:
                validateHepler.clearinputbox(inputTenCongTy);
                validateHepler.clickElement(btnDongYModal);
                Assert.assertTrue(validateHepler.checkDisplayedElement(moDalThemMoiGiaoDuc), "Modal thêm mới kinh nghiệm không còn hiển thị");
                break;
        }
    }
//
//    public void xoaDiaChi() {
//        validateHepler.waitForPageLoad();
//        validateHepler.clickElement(btnDropDownDiaChi);
//        validateHepler.clickElement(dropdownDiaChiXoa);
//        List<WebElement> listDiaChiXoa = driver.findElements(danhSachDiaChi);
//        Assert.assertTrue(listDiaChiXoa.isEmpty(), "Địa chỉ chua được xoá");
//    }
//
//    public void capNhatDiaChi(int status) {
//        validateHepler.waitForPageLoad();
//        validateHepler.clickElement(btnDropDownDiaChi);
//        validateHepler.clickElement(dropdownDiaChiChinhSua);
//        validateHepler.clearinputbox(inputTenDuong);
//        validateHepler.setTextElement(inputTenDuong,"Update");
//        switch (status) {
//            case 1:
//                validateHepler.clickElement(btnluuLaiModalDiaChi);
//                Assert.assertEquals(driver.findElement(diaChi).getText(), "Update-Hải Châu-Đà Nẵng-Việt Nam");
//                break;
//            case 2:
//                validateHepler.clickElement(btnX);
//                Assert.assertNotEquals(driver.findElement(diaChi).getText(), "Update");
//                break;
//        }
//    }
//
//    public void xoaGiaoDuc() {
//        validateHepler.waitForPageLoad();
//        validateHepler.clickElement(btnDropDownGiaoDuc);
//        validateHepler.clickElement(dropdownGiaoDucXoa);
//        List<WebElement> listGiaoDucXoa = driver.findElements(danhSachGiaoDuc);
//        Assert.assertTrue(listGiaoDucXoa.isEmpty(), "Giáo dục chưa được xoá");
//    }
//
//    public void capNhatGiaoDuc(int status) {
//        validateHepler.waitForPageLoad();
//        validateHepler.clickElement(btnDropDownGiaoDuc);
//        validateHepler.clickElement(dropdownGiaoDucChinhSua);
//        validateHepler.clickElement(inputTenTruong);
//        validateHepler.setTextElement(inputTenTruong,"Duy Tân");
//        driver.findElement(inputTenTruong).sendKeys(Keys.ENTER);
//        switch (status) {
//            case 1:
//                validateHepler.clickElement(btnLuuLaiModalGiaoDuc);
//                Assert.assertEquals(driver.findElement(giaoDuc).getText(), "Duy Tân");
//                break;
//            case 2:
//                validateHepler.clickElement(btnX);
//                Assert.assertNotEquals(driver.findElement(giaoDuc).getText(), "Duy Tân");
//                break;
//        }
//    }
//
//    public void xoaKinhNghiem() {
//        validateHepler.waitForPageLoad();
//        validateHepler.clickElement(btnDropDownKinhNghiem);
//        validateHepler.clickElement(dropdownKinhNghiemXoa);
//        List<WebElement> listDiaChiXoa = driver.findElements(danhSachKinhNghiem);
//        Assert.assertTrue(listDiaChiXoa.isEmpty(), "Kinh nghiệm chưa được xoá");
//    }
//
//    public void capNhatKinhNghiem(int status) {
//        validateHepler.waitForPageLoad();
//        validateHepler.clickElement(btnDropDownKinhNghiem);
//        validateHepler.clickElement(dropdownKinhNghiemChinhSua);
//        validateHepler.clearinputbox(inputViTri);
//        validateHepler.setTextElement(inputViTri,"Update");
//        switch (status) {
//            case 1:
//                validateHepler.clickElement(btnLuuLaiModalKinhNghiem);
//                Assert.assertEquals(driver.findElement(kinhNghiem).getText(), "Update");
//                break;
//            case 2:
//                validateHepler.clickElement(btnX);
//                Assert.assertNotEquals(driver.findElement(kinhNghiem).getText(), "Update");
//                break;
//        }
//        validateHepler.clickElement(btnLuuLaiModalKinhNghiem);
//
//    }
//
    public void themMoiHoSoCaNhan(){
        validateHepler.waitForPageLoad();
        validateHepler.setTextElement(inputNgaySinh,"21/10/2000");
        validateHepler.setTextElement(inputCMNDHoChieu,"123456789");
        validateHepler.setTextElement(inputNoiCongTac,"Đà Nẵng");
        validateHepler.clickElement(inputTrinhDo);
        validateHepler.setTextElement(inputTrinhDo,"đại học");
        driver.findElement(inputTrinhDo).sendKeys(Keys.ENTER);
        validateHepler.setTextElement(inputNgayNhanViec,"10/10/2023");
        validateHepler.setTextElement(inputNgayNghiViec,"10/10/2024");
        validateHepler.setTextElement(inputTieuSu,"Tiểu sử được nhập tự động");
    }
}

