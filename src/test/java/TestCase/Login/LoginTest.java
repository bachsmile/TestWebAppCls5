package TestCase.Login;

import Commons.CommonSetup;
import Commons.ReportListener;
import Pages.Login.DashboardPage;
import Pages.Login.ForgotPasswordPage;
import Pages.Login.SiginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ReportListener.class)
public class LoginTest extends CommonSetup {
    private WebDriver driver;
    private  static SiginPage siginPage;
    private static DashboardPage dashboardPage;
    private static ForgotPasswordPage forgotPasswordPage;

    @BeforeClass
    public void Setup(){
        driver = getDriver();
    }

    @Test(priority = 6)
    public void login(){
        siginPage = new SiginPage(driver);
        dashboardPage = siginPage.login("pvcadm", "123456", 1);
        Assert.assertEquals(driver.getCurrentUrl(),"https://kinhdoanh.cloudlms.dev/admin/dashboard");
    }
//
//    @Test(priority = 1)
//    public void wrongpassword(){
//        siginPage = new SiginPage(driver);
//        dashboardPage = siginPage.login("pvcadm", "1234566", 3);
//        Assert.assertEquals(driver.getCurrentUrl(),"https://tester.cls.vn/login");
//    }
//
//    @Test(priority = 2)
//    public void accountdnotexist(){
//        siginPage = new SiginPage(driver);
//        dashboardPage = siginPage.login("pvcnotexist", "123456", 2);
//        Assert.assertEquals(driver.getCurrentUrl(),"https://tester.cls.vn/login");
//    }
//
//    @Test(priority = 3)
//    public void accountnull(){
//        siginPage = new SiginPage(driver);
//        dashboardPage = siginPage.login("", "123456", 4);
//        Assert.assertEquals(driver.getCurrentUrl(),"https://tester.cls.vn/login");
//    }
//
//    @Test(priority = 4)
//    public void passwordnull(){
//        siginPage = new SiginPage(driver);
//        dashboardPage = siginPage.login("pvcnotexist", "", 5);
//        Assert.assertEquals(driver.getCurrentUrl(),"https://tester.cls.vn/login");
//    }
//
//    @Test(priority = 5)
//    public void nullall(){
//        siginPage = new SiginPage(driver);
//        dashboardPage = siginPage.login("", "", 6);
//        Assert.assertEquals(driver.getCurrentUrl(),"https://tester.cls.vn/login");
//    }
//
//    @Test(priority = 7)
//    public void openForgotpasswordPage(){
//        siginPage = new SiginPage(driver);
//        forgotPasswordPage = siginPage.forgotpassword();
//        Assert.assertEquals(driver.getCurrentUrl(),"https://tester.cls.vn/forgot-password");
//    }

    @AfterClass
    public void closeBrowser(){
        driver.close();
    }
}
