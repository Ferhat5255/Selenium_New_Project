package day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;

import java.time.Duration;

public class C01_Examples {

    static WebDriver driver;
    public static void main(String[] args) {

        /*
        ilk once browser'i maximize yapalim sonra tum sayfa icin max bekleme surei 15 saniye belirt
        Sirasiyla amazon, facebook, youtube sayfslarina gidelim
        Amazon sayfasiba tekrar donelim.
        Amazon sayfasininUrl'ini https://amazon.com/ adresine esit oldugunu test eelim
        Sayfanin konumunu ve size'ini yazdiralim
        Sayfanin konumunu ve size'ini istedigimiz sekilde ayarlayalim
        Istedgimiz sekilde oldugunu test edelim
        Sayfayi  kapatalim
         */

        System.setProperty("wepdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //ilk once browser'i maximize yapalim sonra tum sayfa icin max bekleme surei 15 saniye belirt
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Sirasiyla amazon, facebook, youtube sayfslarina gidelim
        driver.get("http://www.amazon.com");
        driver.get("http://www.facebook.com");
        driver.get("http://www.youtube.com");

        //Amazon sayfasina tekrar donelim.
        driver.navigate().back();
        driver.navigate().back();

        // Amazon sayfasininUrl'ini  adresine esit oldugunu test edelim
       String actualUrl = driver.getCurrentUrl();
       String expectedUrl = "http://www.amazon.com";
       if(actualUrl.equals(expectedUrl)){
           System.out.println("Url testi PASSED");
       }else System.out.println("Url testi FAILED");

        //        Sayfanin konumunu ve size'ini yazdiralim
        System.out.println("Sayfanin size'i : " + driver.manage().window().getSize());
        System.out.println("Sayfanin konumu : " + driver.manage().window().getPosition());

        //        Sayfanin konumunu ve size'ini istedigimiz sekilde ayarlayalim
        driver.manage().window().setSize(new Dimension(600,600));
        driver.manage().window().setPosition(new Point(50,50));
        System.out.println("Sayfanin yeni size'i : " + driver.manage().window().getSize());
        System.out.println("Sayfanin yeni konumu : " + driver.manage().window().getPosition());

        //        Istedgimiz sekilde oldugunu test edelim
        Dimension actualYeniSize = driver.manage().window().getSize();
        if (actualYeniSize.getWidth()==600 && actualYeniSize.getHeight()==600){
            System.out.println("Size testi PASSED");
        }else System.out.println("Size testi FAILED");

         Point actualYeniKonum = driver.manage().window().getPosition();
         if (actualYeniKonum.getX()==50 && actualYeniKonum.getY()==50 ) {
             System.out.println("Konum testi PASSED");
         }else System.out.println("Konum testi FAILED");

        //        Sayfayi  kapatalim
driver.close();








    }
}
