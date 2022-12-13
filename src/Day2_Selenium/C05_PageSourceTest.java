package Day2_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_PageSourceTest {
    // Go to the Amazon URL: https://www.amazon.com/
    // Verify that it writes "Performance Metrics" and "MEOW" from the Source code.
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        // Page Source (kaynağı) aldık
        String pageSource = driver.getPageSource();

        System.out.println("Page Source testi yapılıyor...");
        if (pageSource.contains("Performance Metrics") && pageSource.contains("MEOW")){
            System.out.println("Page Source testi PASSED");
        }else System.out.println("Page Source testi FAILED");

        Thread.sleep(3000);
        driver.quit();

    }
}
