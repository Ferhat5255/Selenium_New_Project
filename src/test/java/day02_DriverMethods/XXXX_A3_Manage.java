package day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XXXX_A3_Manage {
    public static void main(String[] args) {

        System.setProperty("wepdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        System.out.println(driver.manage().window().getSize());

        System.out.println(driver.manage().window().getPosition());

        driver.manage().window().setPosition(new Point(15,15));

        driver.manage().window().setSize(new Dimension(900,600));

        System.out.println("Yeni pencere olculeri "+driver.manage().window().getSize());
        System.out.println("Yeni pencere konumu "+driver.manage().window().getPosition());

        driver.manage().window().maximize();
        System.out.println("Yeni max olculeri "+driver.manage().window().getSize());
        System.out.println("Yeni maxkonumu "+driver.manage().window().getPosition());

        driver.manage().window().fullscreen();
        System.out.println("Yeni full olculeri "+driver.manage().window().getSize());
        System.out.println("Yeni full konumu "+driver.manage().window().getPosition());

        driver.manage().window().minimize();



        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));




    }
}
