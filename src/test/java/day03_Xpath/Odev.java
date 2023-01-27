package day03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Odev {

    public static void main(String[] args) {

        System.setProperty("wepdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1. Amazon sayfasina gidiniz
        driver.get("https://www.amazon.com");

        //2. Arama kutusunu locate ediniz
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

        //3. Arama kutusunun tagName'inin input oldugunu test ediniz

        String actualTagName = aramaKutusu.getTagName();

        String expectedTagName = "input";


        if (expectedTagName.equals(actualTagName)) {
            System.out.println("Test Passed");
        } else System.out.println("Test Failed");

        //4. Arama kutusunun name atributu'nun degerinin field-keywords oldugun test ediniz
        String actualAttributeName = aramaKutusu.getAttribute("name");
        String expectedAttributeName = "field-keywords";

        if (actualAttributeName.equals(expectedAttributeName)) {
            System.out.println("Test Passed");
        } else System.out.println("Test Failed");

        //5. Sayfayi kapatiniz
        driver.close();

    }
}
