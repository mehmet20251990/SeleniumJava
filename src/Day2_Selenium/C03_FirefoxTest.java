package Day2_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C03_FirefoxTest {
//        Invoke FireFox Driver
//        Go to https://www.youtube.com/
//        Verify the page title contains the word video.
//        Close the driver.
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver","Dependencies/drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.youtube.com/");

        // Title testini gerçekleştirdik
        System.out.println("Title testi yapılıyor...");
        String pageTitle = driver.getTitle();

        if (pageTitle.contains("video")) {
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED");

        Thread.sleep(3000);
        driver.quit();

    }
}
