package example;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class SeleniumGridTest {

    private static final String SELENIUM_GRID_ADDRESS = "141.137.235.211";

    private RemoteWebDriver driver;

    @BeforeMethod
    public void beforeMethod() throws Exception {
        // Example test environment. NOTE: Gridlastic auto scaling requires all
        // these 3 environment variables in each request.
        String browserName = BrowserType.FIREFOX;
        String browserVersion = ""; // for Chrome leave empty

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setPlatform(Platform.LINUX);
        capabilities.setBrowserName(browserName);
        capabilities.setVersion(browserVersion);

        if (BrowserType.CHROME.equals(browserName)){
            ChromeOptions options = new ChromeOptions();
            options.addArguments(Collections.singletonList("--start-maximized"));
            capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        }

        driver = new RemoteWebDriver(
                new URL("http://" + SELENIUM_GRID_ADDRESS + ":4444/wd/hub"),
                capabilities);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void testEricssonWebSite() {
        driver.get("http://www.ericsson.com/");
        driver.findElementByLinkText("CAREERS").click();
        driver.findElementByLinkText("Search Jobs").click();
        driver.findElementById("search-keyword").sendKeys("Developer");
    }

    @Test
    public void testGoogleWebSite() {
        driver.get("http://www.google.com");
        WebElement elementById = driver.findElementById("lst-ib");
        elementById.click();
        elementById.sendKeys("Selenium");
        driver.findElementByClassName("sbico").click();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }

}
