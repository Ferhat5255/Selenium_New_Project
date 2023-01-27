package day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XXXX_A1_Get {
    public static void main(String[] args) {
        System.setProperty("wepdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



        driver.get("https://www.amazon.com");

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());
        System.out.println("===============================================================");
        System.out.println(driver.getPageSource());
        System.out.println("===================================================================");

        System.out.println(driver.getWindowHandle());

        System.out.println(driver.getWindowHandles());

    }
}
