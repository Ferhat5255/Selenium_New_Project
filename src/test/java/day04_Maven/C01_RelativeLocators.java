package day04_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C01_RelativeLocators {
    public static void main(String[] args) {
        System.setProperty("wepdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html adresine gidin
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        //2) Sayfadaki Berlin WE'INI relative locator ile tiklayalim
       WebElement NYCWebElement =  driver.findElement(By.xpath("//*[@ID='pid3_thumb']"));
       WebElement bAYareaWebElement = driver.findElement(By.xpath("//*[@id='pid8_thumb']"));
       WebElement BerlinWE = driver.findElement(with(By.tagName("li")).below(NYCWebElement).toLeftOf(bAYareaWebElement));
       BerlinWE.click();








    }
}
