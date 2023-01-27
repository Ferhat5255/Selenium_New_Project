package day01_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_Odev {
    public static void main(String[] args) throws InterruptedException {
        //Amazon soyfasina gidelim. https://www.amazon.com/
        //Sayfanin konumunu ve boyutlarini yazdirin
        //Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        //Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        //Sayfayi kapatin

        System.setProperty("wepdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanin boyutlari : " + driver.manage().window().getSize());
        System.out.println("Sayfanin konumu : " + driver.manage().window().getPosition());

        //Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setSize(new Dimension(800,600));
        driver.manage().window().setPosition(new Point(80,0));

        //Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        System.out.println("Sayfanin yeni boyutlari : " + driver.manage().window().getSize());
        System.out.println("Sayfanin yeni konumu: " +driver.manage().window().getPosition());

        //Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();

    }
}
