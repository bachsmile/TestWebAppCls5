package Pages.Login;

import Commons.ValidateHepler;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RegisterPage {

    private WebDriver driver;
    private ValidateHepler validateHepler;
    private By lastNameInput = By.id("register-last-name");
    private By firstNameInput = By.id("register-first-name");
    private By emailInput = By.id("register-email");
    private By phoneNumberInput = By.id("register-phone-number");
    private By userNameInput = By.id("register-username");
    private By passwordInput = By.id("register-password");
    private By confirmPasswordInput = By.id("register-confirm-password");
    private By checkBoxRegister = By.id("register-privacy-policy");
    private By checkBoxRegister1 = By.xpath("//label[@for='register-privacy-policy']");
    private By bthRegister = By.xpath("//button[contains(text(),'Đăng ký')]");
    private By linkLoginPage = By.xpath("//a[@href='/login']");
    private By lastNameDanger = By.xpath("//small[contains(text(),'Họ là bắt buộc')]");
    private By firstNameDanger = By.xpath("//small[contains(text(),'Tên là bắt buộc')]");
    private By emailDanger = By.xpath("//small[contains(text(),'Email là bắt buộc')]");
    private By userNameDanger = By.xpath("//small[contains(text(),'Tên đăng nhập là bắt buộc')]");
    private By passwordDanger = By.xpath("//small[contains(text(),'Mật khẩu là bắt buộc')]");
    private By confirmPasswordDanger = By.xpath("//small[contains(text(),'Nhập lại mật khẩu là bắt buộc')]");
    private By toastRegister = By.xpath("//div[@class=\"toast-body\"]");

    public RegisterPage(WebDriver driver){
        this.driver = driver;
        validateHepler = new ValidateHepler(this.driver);
    }

    public void register(String lastName, String firstName, String email, String phoneNumber, String userName, String password, String confirmPassword, int status){
        validateHepler.waitForPageLoad();
        validateHepler.clearinputbox(lastNameInput);
        validateHepler.clearinputbox(firstNameInput);
        validateHepler.clearinputbox(emailInput);
        validateHepler.clearinputbox(phoneNumberInput);
        validateHepler.clearinputbox(userNameInput);
        validateHepler.clearinputbox(passwordInput);
        validateHepler.clearinputbox(confirmPasswordInput);
        validateHepler.setTextElement(lastNameInput,lastName);
        validateHepler.setTextElement(firstNameInput,firstName);
        validateHepler.setTextElement(emailInput,email);
        validateHepler.setTextElement(phoneNumberInput,phoneNumber);
        validateHepler.setTextElement(userNameInput,userName);
        validateHepler.setTextElement(passwordInput,password);
        validateHepler.setTextElement(confirmPasswordInput,confirmPassword);
        validateHepler.clickElement(checkBoxRegister1);
        validateHepler.clickElement(bthRegister);
        switch (status){
            case 1:
                Assert.assertEquals(driver.getCurrentUrl(),"https://tester.cls.vn/register");
                break;
            case 2:
                Assert.assertTrue(validateHepler.checkDisplayedElement(toastRegister),"Không có thông báo đăng ký tài khoản thành công");
                Assert.assertTrue(validateHepler.verifyElementText(toastRegister, "Tạo mới tài khoản thành công! Vui lòng liên hệ quản trị viên của bạn để được đuyệt tài khoản."));
                break;
        }
    }

    public SiginPage backToLogin(){
        validateHepler.waitForPageLoad();
        driver.findElement(linkLoginPage).sendKeys(Keys.ENTER);
        validateHepler.waitForPageLoad();
        return new SiginPage(driver);
    }
}
