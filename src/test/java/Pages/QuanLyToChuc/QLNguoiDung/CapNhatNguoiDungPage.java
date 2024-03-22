package Pages.QuanLyToChuc.QLNguoiDung;

import Commons.ValidateHepler;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.testng.Assert;

import java.util.List;

public class CapNhatNguoiDungPage {

    private WebDriver driver;
    private ValidateHepler validateHepler;
    private JavascriptExecutor jsExecutor;
    private By ho = By.xpath("//input[@name='lastName']");
    private By ten = By.xpath("//input[@name='firstName']");
    private By email = By.xpath("//input[@name='email']");
    private By tenDangNhap = By.xpath("//input[@name='userName']");
    private By sdt = By.xpath("//input[@name='tel']");
    private By vaiTroNguoiDung = By.xpath("//input[@placeholder='Vai trò người dùng']");
    private By clearVaiTroNguoiDung = By.xpath("//div[@test='vs-userTypeId']//div[@class='vs__actions']//button");
    private By valueVaiTroNguoiDung = By.xpath("//div[@test='vs-userTypeId']//span[@class='vs__selected']//span");
    private By trangThai = By.xpath("//input[@placeholder='Trạng thái']");
    private By clearTrangThai = By.xpath("//div[@test='vs-statusId']//div[@class='vs__actions']//button");
    private By kpiHocTap = By.xpath("//input[@name='kpiLearn']");
    private By kpiGiangDay = By.xpath("//input[@name='kpiTeach']");
    private By checkboxKhoaHoc = By.xpath("(//div[@class='v-selection-control__input']//input)[3]");
    private By checkboxLoTrinhDaoTao = By.xpath("(//div[@class='v-selection-control__input']//input)[4]");
    private By btnLuuLai = By.xpath("(//div[@class='ml-3']//span[@class='v-btn__content'])[1]");
    private By btnHuyBo = By.xpath("//div[@class='color-dark']");
    private By luuVaCapNhat = By.xpath("(//div[@class='ml-3']//span[@class='v-btn__content'])[2]");
    private By themMoiCCTC = By.xpath("//div[@class='footer-action-container']//button//div");
    private By inputLuaChonCCTC = By.xpath("//input[@class='vue-treeselect__input']");
    private By danhsachCCTC = By.xpath("//div[@class='vue-treeselect__control']");
    private By btnXoaCCTC = By.xpath("//*[name()='svg' and @class='v-icon notranslate v-theme--light v-icon--size-default text-error v-icon--clickable cursor-pointer iconify iconify--fe']");
    private By btnXoaTenCCTC = By.xpath("(//div[@class='cm-tree-select']//*[name()='svg'])[1]");
    private By tenCoCauToChuc = By.xpath("//div[@class='vue-treeselect__single-value']//span");
    private By inputViTriChucDanh = By.xpath("//input[@placeholder='Vị trí chức danh']");
    private By tenViTriChucDanh = By.xpath("//div[@test='vs-undefined']//span//span");
    private By btnXoaViTriChucDanh = By.xpath("//div[@test='vs-undefined']//button[@class='vs__clear']//*[name()='svg']");
    private By gtNam = By.xpath("(//div[@class='v-selection-control__input']//input[@type='radio'])[1]");
    private By gtNu = By.xpath("(//div[@class='v-selection-control__input']//input)[2]");
    private By emailCheck = By.xpath("//tbody//tr[1]/td[3]/span");
    private By toast = By.xpath("//div[@class='toast-component']//div[@class='text-semibold-sm']");
    private By tabThongTinTaiKhoan = By.xpath("//button[@value='infor']");
    private By tabHoSoCaNhan = By.xpath("//button[@value='resumer']");
    private By tabToChuc = By.xpath("//button[@value='organization']");
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
    private By btnDongYModal = By.xpath("//span[@class='v-btn__content']//div[.='Đồng ý']");
    private By btnHuyBoModal = By.xpath("(//span[@class='v-btn__content']//div[.='Hủy bỏ'])[2]");
    private By modalTitle = By.xpath("//div[@class='v-card__image']");
    private By inputTenTruong = By.xpath("//input[@placeholder='Tên trường']");
//    private By inputBangCap = By.xpath("//input[@placeholder='Bằng cấp']");
    private By nam = By.xpath("//div[@class='v-field__field']//input[@placeholder='yyyy']");
    private By inputMoTaModal = By.xpath("(//div[@class='v-field__field']//textarea[@class='v-field__input'])[2]");
    private By inputTenCongTy = By.xpath("//input[@name='companyName']");
    private By inputViTri = By.xpath("//input[@name='position']");
    private By checkboxDangLamViecTaiDay = By.xpath("//input[@test='test-isWork']");
    private By tuNam = By.xpath("//input[@test='test-from-years-input']");
    private By denNam = By.xpath("//input[@test='test-to-years-input']");
    private By btnChinhSua = By.xpath("(//div[@title='Chỉnh sửa'])[1]");
    private By headerTitle = By.xpath("//ul[@class='v-breadcrumbs v-breadcrumbs--density-default breadcrumb']//li//div//span");
    private By inputNoiCongTac = By.xpath("//input[@placeholder='Nhập nơi công tác']");
    private By inputTrinhDo = By.xpath("//input[@placeholder='Trình độ']");
    private By tenTrinhDo = By.xpath("//div[@test='vs-levelId']//span[@class='text-ellipsis selected-mul text-regular-md']");
    private By btnXoaTenTrinhDo = By.xpath("(//div[@test='vs-levelId']//*[name()='svg'])[1]");
    private By dropdownTrinhDoDaiHoc = By.xpath("//ul[@id='vs4__listbox']//li[6]");
    private By inputNgayNhanViec = By.xpath("//input[@test='employment-input-date-time']");
    private By inputNgayNghiViec = By.xpath("//input[@test='quitJobDate-input-date-time']");
    private By inputTieuSu = By.xpath("//div[@class='v-field__field']//textarea[@class='v-field__input']");
    private By timKiem = By.xpath("//input[@placeholder='Tìm kiếm']");
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



    public CapNhatNguoiDungPage(WebDriver driver){
        this.driver = driver;
        validateHepler = new ValidateHepler(driver);
        jsExecutor = (JavascriptExecutor) driver;
    }

    public void openCapNhapnguoiDung(){
        validateHepler.waitForPageLoad();
        validateHepler.clickElement(btnChinhSua);
        validateHepler.waitForPageLoad();
        Assert.assertEquals(driver.findElement(headerTitle).getText(),"Chỉnh sửa");
    }

    public void gotoTabHoSoCaNhan() {
        validateHepler.waitForPageLoad();
        validateHepler.clickElement(tabHoSoCaNhan);
        Assert.assertEquals(driver.findElement(tabHoSoCaNhan).getAttribute("aria-selected"), "true");
    }

    public void capNhatThongTinCoBanTaiKhoan(String hond, String tennd, String emailnd, String tendangnhapnd , String sdtnd, String kpihoctapnd, String kpigiangdaynd, int status) throws InterruptedException {
        validateHepler.waitForPageLoad();
        validateHepler.clearinputbox(ho);
        validateHepler.setTextElement(ho,hond);
        validateHepler.waitForPageLoad();
        validateHepler.clearinputbox(ten);
        validateHepler.setTextElement(ten,tennd);
        validateHepler.waitForPageLoad();
        validateHepler.clearinputbox(email);
        validateHepler.setTextElement(email,emailnd);
        validateHepler.waitForPageLoad();
        validateHepler.clearinputbox(tenDangNhap);
        validateHepler.setTextElement(tenDangNhap,tendangnhapnd);
        validateHepler.waitForPageLoad();
        validateHepler.clearinputbox(sdt);
        validateHepler.setTextElement(sdt,sdtnd);
        validateHepler.waitForPageLoad();
        validateHepler.clickElement(clearVaiTroNguoiDung);
        Thread.sleep(3000);
        validateHepler.clickElement(vaiTroNguoiDung);
        validateHepler.setTextElement(vaiTroNguoiDung,"chính tạo thay thế");
        driver.findElement(vaiTroNguoiDung).sendKeys(Keys.ENTER);
        validateHepler.waitForPageLoad();
        validateHepler.clearinputbox(kpiHocTap);
        validateHepler.setTextElement(kpiHocTap,kpihoctapnd);
        validateHepler.waitForPageLoad();
        validateHepler.clearinputbox(kpiGiangDay);
        validateHepler.setTextElement(kpiGiangDay,kpigiangdaynd);
        validateHepler.waitForPageLoad();
//        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(inputLuaChonCCTC));
//        validateHepler.clickElement(inputLuaChonCCTC);
//        validateHepler.setTextElement(inputLuaChonCCTC, "test tháng 11");
//        try {
//            Thread.sleep(3000);}
//        catch (InterruptedException e)
//        {
//            throw new RuntimeException(e);
//        }
//        driver.findElement(inputLuaChonCCTC).sendKeys(Keys.ENTER);
//        validateHepler.waitForPageLoad();
//        validateHepler.clickElement(inputViTriChucDanh);
//        validateHepler.setTextElement(inputViTriChucDanh, "kimchi");
//        try {
//            Thread.sleep(3000);}
//        catch (InterruptedException e)
//        {
//            throw new RuntimeException(e);
//        }
//        driver.findElement(inputViTriChucDanh).sendKeys(Keys.ENTER);
        validateHepler.waitForPageLoad();
        switch (status) {
            case 1:
                validateHepler.clickElement(btnLuuLai);
                validateHepler.waitForPageLoad();
                Assert.assertTrue(validateHepler.checkDisplayedElement(toast), "Không hiển thị thông báo cập nhật thành công");
                Assert.assertEquals(driver.findElement(toast).getText(), "Cập nhật thành công");
                Assert.assertEquals(driver.findElement(emailCheck).getText(), emailnd);
                Thread.sleep(3000);
                validateHepler.clickElement(btnChinhSua);
                validateHepler.waitForPageLoad();
                Thread.sleep(3000);
                Assert.assertEquals(driver.findElement(ho).getAttribute("value"), hond);
                Assert.assertEquals(driver.findElement(ten).getAttribute("value"), tennd);
                Assert.assertEquals(driver.findElement(email).getAttribute("value"), emailnd);
                Assert.assertEquals(driver.findElement(tenDangNhap).getAttribute("value"), tendangnhapnd);
                Assert.assertEquals(driver.findElement(sdt).getAttribute("value"), sdtnd);
                Assert.assertEquals(driver.findElement(kpiHocTap).getAttribute("value"), kpihoctapnd);
                Assert.assertEquals(driver.findElement(kpiGiangDay).getAttribute("value"), kpigiangdaynd);
                Assert.assertEquals(driver.findElement(valueVaiTroNguoiDung).getText(), "Chính tạo thay thế");
                //Assert.assertEquals(driver.findElement(emailCheck).getAttribute("value"), emailnd);
                break;
            case 2:
                validateHepler.clickElement(btnHuyBo);
                Assert.assertEquals(driver.getCurrentUrl(), "https://kinhdoanh.cloudlms.dev/admin/organization/users?tabActive=list");
                validateHepler.waitForPageLoad();
                Assert.assertNotEquals(driver.findElement(emailCheck).getText(), emailnd);
                Thread.sleep(3000);
                validateHepler.clickElement(btnChinhSua);
                validateHepler.waitForPageLoad();
                Thread.sleep(3000);
                Assert.assertNotEquals(driver.findElement(ho).getAttribute("value"), hond);
                Assert.assertNotEquals(driver.findElement(ten).getAttribute("value"), tennd);
                Assert.assertNotEquals(driver.findElement(email).getAttribute("value"), emailnd);
                Assert.assertNotEquals(driver.findElement(tenDangNhap).getAttribute("value"), tendangnhapnd);
                Assert.assertNotEquals(driver.findElement(sdt).getAttribute("value"), sdtnd);
                Assert.assertNotEquals(driver.findElement(kpiHocTap).getAttribute("value"), kpihoctapnd);
                Assert.assertNotEquals(driver.findElement(kpiGiangDay).getAttribute("value"), kpigiangdaynd);
                Assert.assertNotEquals(driver.findElement(valueVaiTroNguoiDung).getText(), "Chính tạo thay thế");
                break;
            case 3:
                validateHepler.clearinputbox(email);
                validateHepler.setTextElement(email,"pvc005@gmail.com");
                validateHepler.clickElement(btnLuuLai);
                Assert.assertTrue(validateHepler.checkDisplayedElement(toast), "Không hiển thị thông báo lỗi");
                Assert.assertEquals(driver.findElement(toast).getText(), "Email đã tồn tại");
                break;
        }
    }
    public void capNhatGioiTinh(int status) throws InterruptedException {
        switch (status) {
            case 1:
                jsExecutor.executeScript("arguments[0].click();", driver.findElement(gtNam));
                Thread.sleep(3000);
                validateHepler.clickElement(btnLuuLai);
                validateHepler.waitForPageLoad();
                Thread.sleep(3000);
                validateHepler.setTextElement(timKiem,"PVC Test Update");
                validateHepler.waitForPageLoad();
                Thread.sleep(3000);
                validateHepler.clickElement(btnChinhSua);
                validateHepler.waitForPageLoad();
                Thread.sleep(3000);
                Assert.assertTrue(validateHepler.checkStatusCheckbox(gtNam),"giới tính Nam chưa được chọn");
                break;
            case 2:
                jsExecutor.executeScript("arguments[0].click();", driver.findElement(gtNu));
                validateHepler.clickElement(btnLuuLai);
                Thread.sleep(3000);
                validateHepler.waitForPageLoad();
                validateHepler.setTextElement(timKiem,"PVC Test Update");
                Thread.sleep(3000);
                validateHepler.waitForPageLoad();
                validateHepler.clickElement(btnChinhSua);
                validateHepler.waitForPageLoad();
                Thread.sleep(3000);
                Assert.assertTrue(validateHepler.checkStatusCheckbox(gtNu),"Checkbox giới tính Nữ chưa được chọn");
                break;
        }
    }

    public void chinhSuaCCTC(String tennguoidung,String tenCCTC,String tenChucDanh,int status) throws InterruptedException {
        switch (status) {
            case 1:
                validateHepler.clickElement(themMoiCCTC);
                validateHepler.clickElement(inputLuaChonCCTC);
                validateHepler.setTextElement(inputLuaChonCCTC, tenCCTC);
                Thread.sleep(2000);
                driver.findElement(inputLuaChonCCTC).sendKeys(Keys.ENTER);
                validateHepler.clickElement(btnLuuLai);
                validateHepler.waitForPageLoad();
                Thread.sleep(2000);
                validateHepler.setTextElement(timKiem, tennguoidung);
                Thread.sleep(2000);
                validateHepler.waitForPageLoad();
                validateHepler.clickElement(btnChinhSua);
                Thread.sleep(2000);
                Assert.assertEquals(tenCCTC,driver.findElement(tenCoCauToChuc).getText());
                List listvitrichucdanh = driver.findElements(tenViTriChucDanh);
                Assert.assertTrue(listvitrichucdanh.isEmpty(),"vẫn còn vị trí chức danh");
                break;
            case 2:
                validateHepler.clickElement(themMoiCCTC);
                validateHepler.clickElement(inputLuaChonCCTC);
                validateHepler.setTextElement(inputLuaChonCCTC, tenCCTC);
                Thread.sleep(2000);
                driver.findElement(inputLuaChonCCTC).sendKeys(Keys.ENTER);
                Thread.sleep(2000);
                validateHepler.clickElement(inputViTriChucDanh);
                validateHepler.setTextElement(inputViTriChucDanh, tenChucDanh);
                driver.findElement(inputViTriChucDanh).sendKeys(Keys.ENTER);
                validateHepler.clickElement(btnLuuLai);
                validateHepler.waitForPageLoad();
                Thread.sleep(2000);
                validateHepler.setTextElement(timKiem, tennguoidung);
                Thread.sleep(2000);
                validateHepler.waitForPageLoad();
                validateHepler.clickElement(btnChinhSua);
                Thread.sleep(2000);
                Assert.assertEquals(tenCCTC,driver.findElement(tenCoCauToChuc).getText());
                Assert.assertEquals(tenChucDanh,driver.findElement(tenViTriChucDanh).getText());
                break;
            case 4:
                validateHepler.clickElement(btnXoaTenCCTC);
                Thread.sleep(1000);
//                validateHepler.clickElement(themMoiCCTC);
                validateHepler.clickElement(inputLuaChonCCTC);
                validateHepler.setTextElement(inputLuaChonCCTC, tenCCTC);
                Thread.sleep(2000);
                driver.findElement(inputLuaChonCCTC).sendKeys(Keys.ENTER);
                Thread.sleep(2000);
                validateHepler.clickElement(btnLuuLai);
                validateHepler.waitForPageLoad();
                Thread.sleep(2000);
                validateHepler.setTextElement(timKiem, tennguoidung);
                Thread.sleep(2000);
                validateHepler.waitForPageLoad();
                validateHepler.clickElement(btnChinhSua);
                Thread.sleep(2000);
                Assert.assertEquals(tenCCTC,driver.findElement(tenCoCauToChuc).getText());
                List listvitrichucdanh1 = driver.findElements(tenViTriChucDanh);
                Assert.assertTrue(listvitrichucdanh1.isEmpty(),"vẫn còn vị trí chức danh");
                break;
            case 5:
                validateHepler.clickElement(btnXoaTenCCTC);
                Thread.sleep(1000);
//                validateHepler.clickElement(themMoiCCTC);
                validateHepler.clickElement(inputLuaChonCCTC);
                validateHepler.setTextElement(inputLuaChonCCTC, tenCCTC);
                Thread.sleep(2000);
                driver.findElement(inputLuaChonCCTC).sendKeys(Keys.ENTER);
                Thread.sleep(2000);
                validateHepler.clickElement(inputViTriChucDanh);
                validateHepler.setTextElement(inputViTriChucDanh, tenChucDanh);
                driver.findElement(inputViTriChucDanh).sendKeys(Keys.ENTER);
                validateHepler.clickElement(btnLuuLai);
                validateHepler.waitForPageLoad();
                Thread.sleep(2000);
                validateHepler.setTextElement(timKiem, tennguoidung);
                Thread.sleep(2000);
                validateHepler.waitForPageLoad();
                validateHepler.clickElement(btnChinhSua);
                Thread.sleep(2000);
                Assert.assertEquals(tenCCTC,driver.findElement(tenCoCauToChuc).getText());
                Assert.assertEquals(tenChucDanh,driver.findElement(tenViTriChucDanh).getText());
                break;
            case 6:
                validateHepler.clickElement(btnXoaTenCCTC);
                Thread.sleep(1000);
                validateHepler.clickElement(btnLuuLai);
                validateHepler.waitForPageLoad();
                Assert.assertTrue(validateHepler.checkDisplayedElement(toast), "Không hiển thị thông báo lỗi");
                Assert.assertEquals(driver.findElement(toast).getText(), "Cơ cấu tổ chức không được để trống và không được phép trùng");
                validateHepler.clickElement(btnHuyBo);
                break;
            case 7:
                validateHepler.clickElement(btnXoaViTriChucDanh);
                Thread.sleep(1000);
                validateHepler.clickElement(btnLuuLai);
                validateHepler.waitForPageLoad();
                Thread.sleep(2000);
                validateHepler.setTextElement(timKiem, tennguoidung);
                Thread.sleep(2000);
                validateHepler.waitForPageLoad();
                validateHepler.clickElement(btnChinhSua);
                Thread.sleep(2000);
                Assert.assertEquals(tenCCTC,driver.findElement(tenCoCauToChuc).getText());
                List listvitrichucdanh2 = driver.findElements(tenViTriChucDanh);
                Assert.assertTrue(listvitrichucdanh2.isEmpty(),"vẫn còn vị trí chức danh");
                break;
            case 8:
//                validateHepler.clickElement(btnXoaViTriChucDanh);
                Thread.sleep(1000);
                validateHepler.clickElement(inputViTriChucDanh);
                validateHepler.setTextElement(inputViTriChucDanh, tenChucDanh);
                driver.findElement(inputViTriChucDanh).sendKeys(Keys.ENTER);
                validateHepler.clickElement(btnLuuLai);
                validateHepler.waitForPageLoad();
                Thread.sleep(2000);
                validateHepler.setTextElement(timKiem, tennguoidung);
                Thread.sleep(2000);
                validateHepler.waitForPageLoad();
                validateHepler.clickElement(btnChinhSua);
                Thread.sleep(2000);
                Assert.assertEquals(tenCCTC,driver.findElement(tenCoCauToChuc).getText());
                Assert.assertEquals(tenChucDanh,driver.findElement(tenViTriChucDanh).getText());
                break;
            case 9:
                validateHepler.clickElement(btnXoaViTriChucDanh);
                Thread.sleep(1000);
                validateHepler.clickElement(inputViTriChucDanh);
                validateHepler.setTextElement(inputViTriChucDanh, tenChucDanh);
                driver.findElement(inputViTriChucDanh).sendKeys(Keys.ENTER);
                validateHepler.clickElement(btnLuuLai);
                validateHepler.waitForPageLoad();
                Thread.sleep(2000);
                validateHepler.setTextElement(timKiem, tennguoidung);
                Thread.sleep(2000);
                validateHepler.waitForPageLoad();
                validateHepler.clickElement(btnChinhSua);
                Thread.sleep(2000);
                Assert.assertEquals(tenCCTC,driver.findElement(tenCoCauToChuc).getText());
                Assert.assertEquals(tenChucDanh,driver.findElement(tenViTriChucDanh).getText());
                break;
            case 3:
                List<WebElement> listCCTC = driver.findElements(danhsachCCTC);
                if(listCCTC.size()>0){
                    jsExecutor.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(danhsachCCTC));
                }
                int slcctc = listCCTC.size();
                while(slcctc > 0){
                    System.out.print(slcctc);
                    validateHepler.clickElement(btnXoaCCTC);
                    Thread.sleep(2000);
                    slcctc--;
                }
                validateHepler.clickElement(btnLuuLai);
                Thread.sleep(3000);
                validateHepler.setTextElement(timKiem, tennguoidung);
                Thread.sleep(3000);
                validateHepler.waitForPageLoad();
                validateHepler.clickElement(btnChinhSua);
                Thread.sleep(3000);
                jsExecutor.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(btnLuuLai));
                List<WebElement> listCCTCCheck2 = driver.findElements(danhsachCCTC);
                Assert.assertTrue(listCCTCCheck2.isEmpty(), "CCTC chưa được xoá hết");
                break;
        }
    }

    public void capNhatThongTinCoBanHoSoCaNhan(String tennguoidung,String ngaysinh,String cccd,String noicongtac,String trinhdo,String ngaynhanviec,String ngaynghiviec,String tieusu,int status) throws InterruptedException {
        Thread.sleep(2000);
        //validateHepler.clearinputbox(inputNgaySinh);
        jsExecutor.executeScript("arguments[0].value = '';", driver.findElement(inputNgaySinh));
        Thread.sleep(500);
        validateHepler.clearinputbox(inputCMNDHoChieu);
        //jsExecutor.executeScript("arguments[0].value = '';", driver.findElement(inputCMNDHoChieu));
        Thread.sleep(500);
//        validateHepler.clearinputbox(inputNoiCongTac);
        jsExecutor.executeScript("arguments[0].value = '';", driver.findElement(inputNoiCongTac));
        Thread.sleep(500);
//        validateHepler.clearinputbox(inputNgayNhanViec);
        jsExecutor.executeScript("arguments[0].value = '';", driver.findElement(inputNgayNhanViec));
        Thread.sleep(500);
//        validateHepler.clearinputbox(inputNgayNghiViec);
        jsExecutor.executeScript("arguments[0].value = '';", driver.findElement(inputNgayNghiViec));
        Thread.sleep(500);
        validateHepler.clearinputbox(inputTieuSu);
        Thread.sleep(500);
        switch (status) {
            case 1:
                List checktrinhdo = driver.findElements(tenTrinhDo);
                if(checktrinhdo.size()>0){
                    validateHepler.clickElement(btnXoaTenTrinhDo);
                }
                Thread.sleep(3000);
//                validateHepler.setTextElement(inputNgaySinh, "");
                validateHepler.clickElement(inputCMNDHoChieu);
                jsExecutor.executeScript("arguments[0].value = null;", driver.findElement(inputCMNDHoChieu));
//                validateHepler.setTextElement(inputCMNDHoChieu, "");
//                validateHepler.clickElement(inputNoiCongTac);
//                validateHepler.setTextElement(inputNoiCongTac, "Nơi công tác update");
//                validateHepler.setTextElement(inputNgayNhanViec, "");
//                validateHepler.setTextElement(inputNgayNghiViec, "");
//                validateHepler.setTextElement(inputTieuSu, "Tiểu sử update");
                validateHepler.clickElement(inputTieuSu);
                Thread.sleep(2000);
                validateHepler.clickElement(btnLuuLai);
//                DevTools devTools = ((ChromeDriver) driver).getDevTools();
//                devTools.createSession();
//                LogEntries logs = driver.manage().logs().get(LogType.PERFORMANCE);
//                for (LogEntry entry : logs) {
//                    System.out.println(entry.getMessage());
//                }
//                System.out.println(logs.toJson());
                validateHepler.waitForPageLoad();
                Thread.sleep(2000);
                validateHepler.setTextElement(timKiem, tennguoidung);
                Thread.sleep(2000);
                validateHepler.waitForPageLoad();
                validateHepler.clickElement(btnChinhSua);
                Thread.sleep(2000);
                validateHepler.clickElement(tabHoSoCaNhan);
                Thread.sleep(7000);
                Assert.assertEquals("",driver.findElement(inputNgaySinh).getAttribute("value"));
                Assert.assertEquals("",driver.findElement(inputCMNDHoChieu).getAttribute("value"));
                Assert.assertEquals("",driver.findElement(inputNoiCongTac).getAttribute("value"));
                List checktrinhdo1 = driver.findElements(tenTrinhDo);
                Assert.assertTrue(checktrinhdo1.isEmpty(),"Vẫn còn trình độ");
                Assert.assertEquals("",driver.findElement(inputNgayNhanViec).getAttribute("value"));
                Assert.assertEquals("",driver.findElement(inputNgayNghiViec).getAttribute("value"));
                Assert.assertEquals("",driver.findElement(inputTieuSu).getAttribute("value"));
                break;
            case 2:
                validateHepler.setTextElement(inputNgaySinh, ngaysinh);
                validateHepler.setTextElement(inputCMNDHoChieu, cccd);
                validateHepler.setTextElement(inputNoiCongTac, noicongtac);
                validateHepler.setTextElement(inputNgayNhanViec, ngaynhanviec);
                validateHepler.setTextElement(inputNgayNghiViec, ngaynghiviec);
                validateHepler.setTextElement(inputTieuSu, tieusu);
                List checktrinhdo2 = driver.findElements(tenTrinhDo);
                if(checktrinhdo2.size()>0){
                    validateHepler.clickElement(btnXoaTenTrinhDo);
                }
                Thread.sleep(2000);
                validateHepler.clickElement(inputTrinhDo);
                validateHepler.setTextElement(inputTrinhDo,trinhdo);
                driver.findElement(inputTrinhDo).sendKeys(Keys.ENTER);
                Thread.sleep(2000);
                validateHepler.clickElement(btnLuuLai);
                validateHepler.waitForPageLoad();
                Thread.sleep(2000);
                validateHepler.setTextElement(timKiem, tennguoidung);
                Thread.sleep(2000);
                validateHepler.waitForPageLoad();
                validateHepler.clickElement(btnChinhSua);
                Thread.sleep(2000);
                validateHepler.clickElement(tabHoSoCaNhan);
                Assert.assertEquals(cccd,driver.findElement(inputCMNDHoChieu).getAttribute("value"));
                Assert.assertEquals(noicongtac,driver.findElement(inputNoiCongTac).getAttribute("value"));
                Assert.assertEquals(trinhdo,driver.findElement(tenTrinhDo).getText());
                Assert.assertEquals(ngaynhanviec,driver.findElement(inputNgayNhanViec).getAttribute("value"));
                Assert.assertEquals(ngaynghiviec,driver.findElement(inputNgayNghiViec).getAttribute("value"));
                Assert.assertEquals(tieusu,driver.findElement(inputTieuSu).getAttribute("value"));
                break;
            }
    }
}
