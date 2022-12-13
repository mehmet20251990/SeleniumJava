package Day2_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_FacebookURLTest {
// Invoke Chrome Driver
// Navigate to Facebook homepage URL: https://www.facebook.com/
// Verify expected equals actual URL.
// Verify expected contains Facebook Word.
public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "Dependencies/drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");

    // URL testimizi yaptık.
    System.out.println("URL testi yapılıyor...");
    String expectedURL = "https://www.facebook.com/";
    String actualURL = driver.getCurrentUrl();

    if (expectedURL.equals(actualURL)) {
        System.out.println("URL testi PASSED");
    }else System.out.println("URL testi FAILED");

    // Title testimizi yaptık
    System.out.println("Title testi yapılıyor...");
    String pageTitle = driver.getTitle();

    if (pageTitle.contains("Facebook")) {
        System.out.println("Title testi PASSED");
    }else System.out.println("Title testi FAILED");

    Thread.sleep(3000);
    driver.quit();

}
}
