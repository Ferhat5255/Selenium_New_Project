package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XXX_Facebook {
    public static void main(String[] args) {

        System.setProperty("wepdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       //https://www.facebook.com/ adresine gidin
        driver.get("https://www.facebook.com/");

        //cookies cikarsa kabul et butonuna basin
        //e-posta adresine rastgele bir mail girin
        WebElement epostaKutusu = driver.findElement(By.xpath("//input[@name='email']"));
        epostaKutusu.sendKeys("ferhat@gmail.com");

        //sifre kismina rastgele bir sifre girin
      WebElement sifreKutusu = driver.findElement(By.xpath("//input[@type='password']"));
      sifreKutusu.sendKeys("12345567");

      //giris yap butonuna basin
        driver.findElement(By.xpath("//button[@name='login']")).click();

        //Uyari olarak"Girdiğin e-posta bir hesaba bağlı değil. Hesabını bul ve giriş yap." mesajinin ciktigini test edin
        WebElement sonucYaziElementi = driver.findElement(By.xpath("//div[@class='_9ay7']"));
        String expectedResault = "Girdiğin e-posta bir hesaba bağlı değil. Hesabını bul ve giriş yap.";
        String actualResault =sonucYaziElementi.getText();
            if (expectedResault.equals(actualResault)){
                System.out.println("Test passed");
            }else System.out.println("Test failed");

            //sayfayi kapatin
        driver.close();

    }
}
