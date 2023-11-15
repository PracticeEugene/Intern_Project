package rozetka_project.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.time.Duration;

import static rozetka_project.configuration.Configuration.PLATFORM_AND_BROWSER;
import static rozetka_project.configuration.Constants.TimeoutVariable.IMPLICIT_WAIT;

public class CreateDriver {
    public static WebDriver createDriver() {
        WebDriver driver = null;

        switch (PLATFORM_AND_BROWSER) {
            case "windows_chrome":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setBinary("C:/Program Files (x86)/chrome-for-testing-win64/chrome.exe");
                driver = new ChromeDriver(chromeOptions);
                break;
            default:
                Assert.fail("Incorrect platform or browser name: " + PLATFORM_AND_BROWSER);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
        return driver;
    }
}