package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01DriverMethods {
    public static void main(String[] args) {

        System.setProperty("wepdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println("Sayfa Basligi : " +  driver.getTitle());
        System.out.println("Sayfa Url'i : " + driver.getCurrentUrl());
       // System.out.println(driver.getPageSource());
        System.out.println(driver.getWindowHandle());


    }

}
