package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XXX_Amazon {
    public static void main(String[] args) {



        System.setProperty("wepdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://amazon.com");

       WebElement arKutusu = driver.findElement(By.id("twotabsearchtextbox"));

       arKutusu.sendKeys("Nutella");

       arKutusu.submit();

       WebElement sonucYaziElementi = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

        System.out.println(sonucYaziElementi.getText());

        driver.close();















    }
}
