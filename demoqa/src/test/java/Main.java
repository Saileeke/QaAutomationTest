

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.demo.BaseTest;
import com.automation.demo.Enterkeys;
import com.automation.demo.Login;

public class Main extends BaseTest { 

    @Test
    public void testGoogleLogin() {
        Login a = new Login(driver);
        Enterkeys n = new Enterkeys(driver);
        Assert.assertEquals(a.Google(), true);
        Assert.assertEquals(n.keys(),true);
    }
}