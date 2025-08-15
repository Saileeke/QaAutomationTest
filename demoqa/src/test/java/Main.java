

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.demo.BaseTest;
import com.automation.demo.Login;

public class Main extends BaseTest { 

    @Test
    public void testGoogleLogin() {
        Login a = new Login(driver);
        Assert.assertEquals(a.Google(), true);
    }
}
