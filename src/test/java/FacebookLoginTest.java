import com.facebook.data.PostArticlePage;
import com.facebook.data.UserCredentials;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FacebookLoginTest {
    @Test
    public void loginData() throws InterruptedException {

        //Initialising Chrome Driver
        WebDriverManager.chromedriver().setup();

        //CREATING AN INSTANCE OF CHROME LEVEL CLASS TO DISABLE BROWSER LEVEL NOTIFICATIONs
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        //DRIVER OBJECT REFERENCE VARIABLE
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //LAUNCH FACEBOOK
        driver.get("https://www.facebook.com/");
        //WAIT
        Thread.sleep(4000);
        //MAXIMIZE WINDOW
        driver.manage().window().maximize();

        //CREATE OBJECT REFERENCE OF USERCREDENTIALS CLASS
        UserCredentials userCredentials = new UserCredentials(driver);
        //ENTER USER DATA USING USING REFERENCE
        userCredentials.userId("9123423829");
        //WAIT
        Thread.sleep(4000);
        userCredentials.userPass("Ashish..12345@");
        //WAIT
        Thread.sleep(4000);
        userCredentials.clickLogin();
        //WAIT
        Thread.sleep(4000);

        ////CREATE OBJECT REFERENCE OF POSTARTICLEPAGE CLASS
        PostArticlePage postArticlePage = new PostArticlePage(driver);
        //CALLING METHOD FROM OBJECT REFERENCE
        postArticlePage.statusTextArea();
        //WAIT
        Thread.sleep(4000);
        postArticlePage.textBoxArea("WELCOME FACEBOOK");
        //WAIT
        Thread.sleep(4000);
        postArticlePage.privacyOnlyForMe();//WAIT
        Thread.sleep(4000);
        postArticlePage.postButton();
        //EXIT
        driver.close();

    }
}
