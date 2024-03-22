package Pages.QuanLyToChuc.QLKieuNguoiDung;

import Commons.ValidateHepler;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class QLKieuNguoiDungPage {

    private WebDriver driver;
    private ValidateHepler validateHepler;
    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
    private By searchInput = By.xpath("//input[@placeholder='Tìm kiếm']");
    private By addNew = By.xpath("//button[@test='permistion-btn-add']");
    //private By dropdown = By.xpath("//div[@class='dropdown b-dropdown position-static btn-group']");
    private By edit = By.xpath("(//div[@test='action-1'])[1]");
    private By delete = By.xpath("(//div[@test='action-2'])[1]");
    private By contentHeader = By.xpath("//ul[@class='v-breadcrumbs v-breadcrumbs--density-default breadcrumb']//li//div//span");
    private By deleteModal = By.xpath("//div[@class='v-overlay__content cm-dialogs']");
    private By inputTenKieuNguoiDung = By.xpath("(//input[@placeholder='Tên kiểu người dùng']");
    private By kieuNguoiDung = By.xpath("//input[@placeholder='Vai trò mặc định']");
    private By dropdowKieuNguoiDung = By.xpath("//ul[@id='vs9__listbox']");
    private By checkboxQTV = By.xpath("((//div[@class='cm-checkbox checkbox-tree-view'])[1]");
    private By checkboxGV = By.xpath("((//div[@class='cm-checkbox checkbox-tree-view'])[47]");
    private By checkboxHV = By.xpath("((//div[@class='cm-checkbox checkbox-tree-view'])[78]");
    private By btnSave = By.xpath("//span[contains(text(),'Lưu lại')]");
    private By btnReset = By.xpath("//span[contains(text(),'Cài lại')]");
    //private By btnClose = By.xpath("//a[contains(text(),'Đóng')]");
    private By toastSuccess = By.className("toast-body");
    //private By btnSaveEdit = By.xpath("(//div[@class='buton-group']//button)[1]");
    //private By btnResetEdit = By.xpath("(//div[@class='buton-group']//button)[2]");
    //private By btnCloseEdit = By.xpath("(//div[@class='buton-group']//button)[3]");
    private By btnBack = By.xpath("//span[contains(text(),'Quay lại')]");
    //private By checkPage = By.xpath("//ul[@class='v-breadcrumbs v-breadcrumbs--density-default breadcrumb']//li//div//span");


    public QLKieuNguoiDungPage(WebDriver driver){
        this.driver = driver;
        validateHepler = new ValidateHepler(this.driver);
    }

    public void searchQLKND(String value, int status){
        driver.navigate().to("https://kinhdoanh.cloudlms.dev/admin/organization/permission");
        validateHepler.waitForPageLoad();
        validateHepler.clearinputbox(searchInput);
        validateHepler.setTextElement(searchInput,value);
        driver.findElement(searchInput).sendKeys(Keys.ENTER);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        switch (status){
            case 1:
                List<WebElement> row = driver.findElements(By.xpath("//table//tbody//tr"));
                Assert.assertTrue(row.size()>0,"Không có giá trị tìm kiếm ở trong danh sách");
                break;
            case 2:
                List<WebElement> row1 = driver.findElements(By.xpath("//table//tbody//tr"));
                Assert.assertTrue(row1.size() == 0,"Có giá trị tìm kiếm ở trong danh sách");
                break;
        }
    }

    public void gotoAddNewPage (){
        validateHepler.waitForPageLoad();
        validateHepler.clickElement(addNew);
        validateHepler.waitForPageLoad();
        Assert.assertEquals(driver.getCurrentUrl(),"https://kinhdoanh.cloudlms.dev/admin/organization/permission/add");
    }

    public void edit (){
        driver.navigate().to("https://kinhdoanh.cloudlms.dev/admin/organization/permission");
        validateHepler.waitForPageLoad();
        validateHepler.clickElement(edit);
        validateHepler.waitForPageLoad();
        Assert.assertEquals(driver.findElement(contentHeader).getText(),"Chỉnh sửa");
        // đang chưa có design chỗ này
    }

    public void delete (){
        driver.navigate().to("https://kinhdoanh.cloudlms.dev/admin/organization/permission");
        validateHepler.waitForPageLoad();
        validateHepler.clickElement(delete);
        validateHepler.waitForPageLoad();
        Assert.assertTrue(validateHepler.checkDisplayedElement(deleteModal),"Không có modal xoá kiểu người dùng xuất hiện");
    }

    public void addNewKieuNguoiDung(String value,int status){
        validateHepler.waitForPageLoad();
        driver.navigate().to("https://kinhdoanh.cloudlms.dev/admin/organization/permission");
        validateHepler.clickElement(addNew);
        validateHepler.waitForPageLoad();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        validateHepler.setTextElement(inputTenKieuNguoiDung,value);
        validateHepler.clickElement(kieuNguoiDung);
        Select dropdownKND = new Select(driver.findElement(dropdowKieuNguoiDung));
        dropdownKND.selectByIndex(0);
        switch (status){
            case 1:
                validateHepler.clickElement(checkboxQTV);
                validateHepler.clickElement(btnSave);
                validateHepler.waitForPageLoad();
                Assert.assertTrue(validateHepler.checkDisplayedElement(toastSuccess),"Không hiển thị thông báo tạo mới thành công");
                Assert.assertEquals(driver.findElement(toastSuccess).getText(),"Tạo mới thành công");
                break;
            case 2:
                validateHepler.clickElement(btnSave);
                validateHepler.waitForPageLoad();
                Assert.assertTrue(validateHepler.checkDisplayedElement(toastSuccess),"Không hiển thị thông báo lỗi");
                Assert.assertEquals(driver.findElement(toastSuccess).getText(),"Vui lòng thêm quyền ở vai trò mặc định");
                break;
        }

    }

    public void addNewBackToList(){
        driver.navigate().to("https://kinhdoanh.cloudlms.dev/admin/organization/permission");
        validateHepler.waitForPageLoad();
        validateHepler.clickElement(addNew);
        validateHepler.clickElement(btnBack);
        Assert.assertEquals(driver.getCurrentUrl(),"https://kinhdoanh.cloudlms.dev/admin/organization/permission");
    }

    public void addNewReset(){
        driver.navigate().to("https://kinhdoanh.cloudlms.dev/admin/organization/permission");
        validateHepler.waitForPageLoad();
        validateHepler.clickElement(addNew);
        validateHepler.clickElement(checkboxQTV);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(btnReset));
        validateHepler.clickElement(btnReset);
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(checkboxQTV));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String statuscheckboxQTV = driver.findElement(checkboxQTV).getAttribute("class");
        String statuscheckboxGV = driver.findElement(checkboxGV).getAttribute("class");
        String statuscheckboxHV = driver.findElement(checkboxHV).getAttribute("class");
        Assert.assertFalse(statuscheckboxQTV.equals("tree-checkbox checked") != statuscheckboxQTV.equals("tree-checkbox indeterminate"),"Checkbox vẫn đang được chọn");
        Assert.assertFalse(statuscheckboxGV.equals("tree-checkbox checked") != statuscheckboxGV.equals("tree-checkbox indeterminate"),"Checkbox vẫn đang được chọn");
        Assert.assertFalse(statuscheckboxHV.equals("tree-checkbox checked") != statuscheckboxHV.equals("tree-checkbox indeterminate"),"Checkbox vẫn đang được chọn");
    }

    public void editReset(){
        validateHepler.clickElement(edit);
        validateHepler.waitForPageLoad();
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        validateHepler.clickElement(checkboxQTV);
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(btnReset));
        validateHepler.clickElement(btnReset);
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(checkboxQTV));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String statuscheckboxQTV = driver.findElement(checkboxQTV).getAttribute("class");
        Assert.assertFalse(statuscheckboxQTV.equals("tree-checkbox checked") != statuscheckboxQTV.equals("tree-checkbox indeterminate"),"Checkbox vẫn đang được chọn");
    }

    public void editBackToList(){
        validateHepler.waitForPageLoad();
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(btnBack));
        validateHepler.clickElement(btnBack);
        validateHepler.waitForPageLoad();
        Assert.assertEquals(driver.getCurrentUrl(),"https://kinhdoanh.cloudlms.dev/admin/organization/permission");
    }

    public void editKND(int status){
        validateHepler.clickElement(edit);
        validateHepler.waitForPageLoad();
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        String statuscheckboxQTV = driver.findElement(checkboxQTV).getAttribute("class");
        String statuscheckboxGV = driver.findElement(checkboxQTV).getAttribute("class");
        String statuscheckboxHV = driver.findElement(checkboxQTV).getAttribute("class");
        switch (status){
            case 1:
                if(statuscheckboxQTV.equals("tree-checkbox checked") != statuscheckboxQTV.equals("tree-checkbox indeterminate")){
                    System.out.println("true");
                    jsExecutor.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(btnSave));
                    validateHepler.clickElement(btnSave);
                }else{
                    System.out.println("fail");
                    validateHepler.clickElement(checkboxQTV);
                    jsExecutor.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(btnSave));
                    validateHepler.clickElement(btnSave);
                }
                Assert.assertTrue(validateHepler.checkDisplayedElement(toastSuccess),"Không hiển thị thông báo tạo chỉnh sửa thành công");
                Assert.assertEquals(driver.findElement(toastSuccess).getText(),"Cập nhật thành công");
                break;
            case 2:
                if(statuscheckboxQTV.equals("tree-checkbox checked") != statuscheckboxQTV.equals("tree-checkbox indeterminate")){
                    validateHepler.clickElement(checkboxQTV);
                }
                if(statuscheckboxGV.equals("tree-checkbox checked") != statuscheckboxGV.equals("tree-checkbox indeterminate")){
                    validateHepler.clickElement(checkboxGV);
                }
                if(statuscheckboxHV.equals("tree-checkbox checked") != statuscheckboxHV.equals("tree-checkbox indeterminate")){
                    validateHepler.clickElement(checkboxHV);
                }
                jsExecutor.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(btnSave));
                validateHepler.clickElement(btnSave);
                Assert.assertTrue(validateHepler.checkDisplayedElement(toastSuccess),"Không hiển thị thông báo lỗi");
                Assert.assertEquals(driver.findElement(toastSuccess).getText(),"Vui lòng thêm quyền ở vai trò mặc định");
                break;
        }
    }

    public void testchecked(){
        validateHepler.clickElement(edit);
        validateHepler.waitForPageLoad();
        String status = driver.findElement(checkboxQTV).getAttribute("class");
        if(status.equals("tree-checkbox checked") != status.equals("tree-checkbox indeterminate")){
            System.out.println("đã được chọn");
        }else {
            System.out.println("chưa được chọn");
        }
    }
}
