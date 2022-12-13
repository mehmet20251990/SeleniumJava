package Day1_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_NavigationCommands {
    /*
    Invoke Chrome Browser
    Navigate to URL: https://clarusway.com/
    Navigate to URL: http://amazon.com/
    Come back to the Clarusway using the back command.
    Again go back to the amazon website using forward command
    Refresh the Browser using refresh command.
    Close the Browser.
     */
    public static void main(String[] args) {

        // Chrome Driverı uyandırdık.
        System.setProperty("webdriver.chrome.driver", "Dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Sırayla sitelere gittik. get()-> BEST PRACTİSE
        driver.navigate().to("https://clarusway.com/");
        driver.navigate().to("http://amazon.com/");

        // Geri ve ileri adımları yaptık.
        driver.navigate().back();
        driver.navigate().forward();

        // Sayfamızı yeniledik.
        driver.navigate().refresh();

        // Sayfamızı kapattık.
        driver.close();
    }
}
