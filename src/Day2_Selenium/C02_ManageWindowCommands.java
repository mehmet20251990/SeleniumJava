package Day2_Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ManageWindowCommands {
// Go to the Amazon URL : https://www.amazon.com/
// Print the position and size of the page.
// Adjust the position and size of the page as desired.
// Test that the page is in the position and size you want.
// Close the page.
public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "Dependencies/drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.com/");

    Thread.sleep(3000);
    // Browserimizin pozisyonunu ve boyutunu yazdırdık
    System.out.println("Browserimizin pozisyonu= "+driver.manage().window().getPosition());
    System.out.println("Browserimizin boyutu= "+driver.manage().window().getSize());

    // Browserimizin pozisyonunu ve boyutunu set ettik
    driver.manage().window().setPosition(new Point(150,75));
    Thread.sleep(3000);
    driver.manage().window().setSize(new Dimension(300,500));

    // Browserimizin pozisyonunu ve boyutunu doğruluyoruz
    int height = driver.manage().window().getSize().getHeight();
    int width = driver.manage().window().getSize().getWidth();

    System.out.println("Browserimizin pozisyonu= "+driver.manage().window().getPosition());
    System.out.println("Browserimizin boyutu= "+driver.manage().window().getSize());

    System.out.println("Browserimizin boyutu test ediliyor...");
    if (height==300 && width==500){//Height en düşük 516 alabildiği için FAILED verir. Çözünürlüğe göre değerler değişebilir
        System.out.println("Boyut testi PASSED");
    }else System.out.println("Boyut testi FAILED");

    int x = driver.manage().window().getPosition().getX();
    int y = driver.manage().window().getPosition().getY();

    System.out.println("Browserimizin pozisyonu test ediliyor...");
    if (x==150 && y==75){
        System.out.println("Pozisyon testi PASSED");
    }else System.out.println("Pozisyon testi FAILED");

    Thread.sleep(3000);
    driver.quit();

}
}
