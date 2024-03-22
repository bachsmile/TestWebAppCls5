package Pages.Login;

import Commons.ValidateHepler;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SiginPage {

    private WebDriver driver;
    private ValidateHepler validateHepler;
    private By headerPageText = By.xpath("");
    private By emailInput = By.xpath("//input[@test='lg-us']");
    private By passwordInput = By.xpath("//input[@test='lg-pw']");
    private By signinBtn = By.xpath("//span[contains(text(),'Đăng nhập')]");
    private By toast = By.xpath("//div[@class=\"toast-body\"]");
    private By forgotPassword = By.xpath("//a[@class='text-primary ms-2 mb-1']");
    private By registerlink = By.xpath("");
    private By titleForgotPassword = By.xpath("");
    private By statusPassword = By.xpath("");
    private By passwordnull = By.xpath("");
    private By emailinputnull = By.xpath("");
    private By checkBoxRemember = By.id("checkbox-4");

    public SiginPage(WebDriver driver){
        this.driver = driver;
        validateHepler = new ValidateHepler(this.driver);
    }

    public DashboardPage login(String username, String pass, int status){
        validateHepler.waitForPageLoad();
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", driver.findElement(emailInput));
        validateHepler.setTextElement(emailInput,username);
        jsExecutor.executeScript("arguments[0].click();", driver.findElement(passwordInput));
        validateHepler.setTextElement(passwordInput, pass);

        switch (status){
            case 1:
                validateHepler.clickElement(signinBtn);
                break;
            case 2:
                validateHepler.clickElement(signinBtn);
                Assert.assertTrue(validateHepler.checkDisplayedElement(toast),"Không hiển thị toast");
                Assert.assertTrue(validateHepler.verifyElementText(toast, "Tài khoản không tồn tại"),"Không phải lỗi tài khoản không tồn tại");
                break;
            case 3:
                validateHepler.clickElement(signinBtn);
                Assert.assertTrue(validateHepler.verifyElementText(statusPassword,"Mật khẩu bạn chưa đúng"));
                break;
            case 4:
                Assert.assertTrue(validateHepler.verifyElementText(emailinputnull, "Tên đăng nhập là bắt buộc"));
                Assert.assertFalse(validateHepler.checkenableclickbutton(signinBtn),"Có thể click vào button login");
                break;
            case 5:
                Assert.assertTrue(validateHepler.verifyElementText(passwordnull, "Mật khẩu là bắt buộc"));
                Assert.assertFalse(validateHepler.checkenableclickbutton(signinBtn),"Có thể click vào button login");
                break;
            case 6:
                Assert.assertTrue(validateHepler.verifyElementText(emailinputnull, "Tên đăng nhập là bắt buộc"));
                Assert.assertFalse(validateHepler.checkenableclickbutton(signinBtn),"Có thể click vào button login");
                break;
        }
        validateHepler.waitForPageLoad();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new DashboardPage(driver);
    }

//    public ForgotPasswordPage forgotpassword(){
//        driver.navigate().to("https://tester.cls.vn/login");
//        validateHepler.waitForPageLoad();
//        validateHepler.clickElement(forgotPassword);
//        validateHepler.waitForPageLoad();
//        return new ForgotPasswordPage(driver);
//    }
//
//    public RegisterPage register(){
//        driver.navigate().to("https://tester.cls.vn/login");
//        validateHepler.waitForPageLoad();
//        //validateHepler.clickElement(registerlink);
//        driver.findElement(registerlink).sendKeys(Keys.ENTER);
//        validateHepler.waitForPageLoad();
//        Assert.assertTrue(validateHepler.verifyElementText(titleForgotPassword,"Đăng ký tài khoản mới"),"Chưa đúng trang đăng ký mới tài khoản");
//        Assert.assertTrue(validateHepler.verifyUrl("https://tester.cls.vn/register"),"Chưa đúng trang đăng ký mới tài khoản");
//        return new RegisterPage(driver);
//    }

}
