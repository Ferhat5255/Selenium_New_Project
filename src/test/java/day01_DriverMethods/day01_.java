package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day01_ {
    public static <WebDriver> void main(String[] args) {
        System.setProperty("wepdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        /*
   En temel haliyle otomasyon yapmak icin Class'imiza otomasyon icin gerekli olan
webdriver'in yerini gostermemiz gerekir. Bunun icin Java kutuphanesinden System.setProperty()
method'unun icine ilk olarak driver'i yazariz. Ikinci olarak driver'in fiziki yolunu kopyalariz.
 */
      //  WebDriver driver = new ChromeDriver();
       // driver.get("https://www.amazon.com");


    }
}

