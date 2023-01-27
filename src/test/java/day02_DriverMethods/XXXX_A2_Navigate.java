package day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XXXX_A2_Navigate {
    public static void main(String[] args) {
        System.setProperty("wepdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.get("https://www.amazon.com");
        driver.navigate().to("https://www.facebook.com");

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();

        driver.close();

        driver.quit();






    }
}
