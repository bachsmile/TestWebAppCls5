package Pages.Login;

import Commons.ValidateHepler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ForgotPasswordPage {
    private WebDriver driver;
    private ValidateHepler validateHepler;
    private By emailInput = By.id("forgot-password-email");
    private By btnSubmit = By.xpath("//button[contains(text(),'Đặt lại mật khẩu')]");
    private By backLoginPage = By.xpath("//a[contains(text(),'Quay lại đăng nhập')]");
    private By textDanger = By.xpath("//small[@class='text-danger']");
    private By toast = By.xpath("//div[@class=\"toast-body\"]");

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
        validateHepler = new ValidateHepler(this.driver);
    }

    public void SubmitForgotPassword(String email,int status){
        validateHepler.waitForPageLoad();
        validateHepler.clearinputbox(emailInput);
        validateHepler.setTextElement(emailInput,email);
        switch (status){
            case 1:
                validateHepler.clickElement(btnSubmit);
                Assert.assertTrue(validateHepler.verifyElementText(textDanger, "Email là bắt buộc"));
                break;
            case 2:
                validateHepler.clickElement(btnSubmit);
                Assert.assertTrue(validateHepler.verifyElementText(textDanger, "Email không hợp lệ"));
                break;
            case 3:
                validateHepler.clickElement(btnSubmit);
                Assert.assertTrue(validateHepler.checkDisplayedElement(toast),"Không hiển thị toast");
                validateHepler.waitForPageLoad();
                System.out.println(driver.findElement(toast).getText());
                Assert.assertTrue(validateHepler.verifyElementText(toast, "Tài khoản không tồn tại."));
                break;
            case 4:
                validateHepler.clickElement(btnSubmit);
                Assert.assertTrue(validateHepler.checkDisplayedElement(toast),"Không hiển thị toast");
                validateHepler.waitForPageLoad();
                System.out.println(driver.findElement(toast).getText());
                Assert.assertTrue(validateHepler.verifyElementText(toast, "Cập nhật thành công"));
                break;
        }
    }

    public void backToLoginPage(){
        validateHepler.waitForPageLoad();
        validateHepler.clickElement(backLoginPage);
    }
}
