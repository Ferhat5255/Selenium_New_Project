package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class XXX_Best {
    public static void main(String[] args) {
        System.setProperty("wepdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //https://www.bestbuy.com  adresine gidin
        driver.get("https://www.bestbuy.com ");

        //cookies cikarsa kabul et butonuna bas

        //sayfada kac adet button bulundugunu yazdirin
       List<WebElement> buttonListesi = driver.findElements(By.tagName("button"));
        System.out.println(buttonListesi.size());
        
        //Sayfadaki herbir button uzerindeki yaziyi getirin
        for (WebElement button : buttonListesi) {
            System.out.println(button.getText());
            
        }


    }
}
