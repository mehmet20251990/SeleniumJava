package Day2_Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class C01_ManageWindowCommands {
//        Invoke Chrome Browser
//        Open URL: https://www.google.com/
//        Maximize the window.
//        Print the position and size of the page.
//        Minimize the page.
//        Wait 5 seconds in the icon state and maximize the page.
//                Print the position and dimensions of the page in maximized state.
//        Make the page fullscreen.
//        Close the Browser.
public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "Dependencies/drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.com/");

    Thread.sleep(3000);
    driver.manage().window().maximize();

    // Browser ımızın su anki pozisyonunu verir
    Point point = driver.manage().window().getPosition();

    // Pozisyonumuzun koordinat değerlerini değişkenlerimize atadık
    int posX = point.getX();
    int posY = point.getY();

    System.out.println("Sayfamızın x koordinatı= "+posX);
    System.out.println("Sayfamızın y koordinatı= "+posY);

    Thread.sleep(3000);
    driver.manage().window().minimize();

    // 5 sn bekliyoruz-> 1 sn = 5000 ms
    Thread.sleep(5000);

    // Browserimizin size'ını verir
    Dimension dimension = driver.manage().window().getSize();

    // Browserimizin genişlik ve yükseklik değerlerini değişkenlerde tutacağız.
    int h = dimension.getHeight();
    int w = dimension.getWidth();

    System.out.println("Browserimizin yüksekliği= "+h);
    System.out.println("Browserimizin genişliği= "+w);

    driver.manage().window().fullscreen();

    Thread.sleep(3000);
    driver.close();
    // driver.quit();
}
}
