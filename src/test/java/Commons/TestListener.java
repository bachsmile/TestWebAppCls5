package Commons;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    @Override
    public void onFinish(ITestContext result) {
        // TODO Auto-generated method stub
        System.out.println("Kết thúc auto test");
    }

    @Override
    public void onStart(ITestContext result) {
        // TODO Auto-generated method stub
        System.out.println("Đây là đoạn khởi động auto test");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestFailure(ITestResult result) {
        // TODO Auto-generated method stub
        System.out.println("Test case fail: "+result.getName());
        try {
            CaptureHelper.captureScreenshot(CommonSetup.getDriver(), result.getName());
        } catch (Exception e) {
            System.out.println("Exception while taking screenshot " + e.getMessage());
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub
        System.out.println("Test case skip: "+result.getName());
    }

    @Override
    public void onTestStart(ITestResult result) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // TODO Auto-generated method stub
        System.out.println("Test case thành công: "+result.getName());
    }
}
