package day01_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class Exxxxxxx {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("wepdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //driver.get()
//        driver.get("https://www.amazon.com");
//        System.out.println(driver.getTitle());
//        System.out.println(driver.getWindowHandle());
//        System.out.println(driver.getCurrentUrl());
//        Thread.sleep(3000);
//        driver.close();

        //driver.navigate() METHODS
//        driver.navigate().to("http://www.amazon.com");
//        driver.navigate().to("https://tr-tr.facebook.com/");
//        Thread.sleep(3000);
//        driver.navigate().back();
//        Thread.sleep(3000);
//        driver.navigate().forward();
//        Thread.sleep(3000);
//        driver.navigate().refresh();
//        driver.close();

        //driver.manage() METHODS
//        driver.get("https://www.amazon.com");
//        System.out.println(driver.manage().window().getSize());
//        System.out.println(driver.manage().window().getPosition());
//        Thread.sleep(3000);
//        driver.manage().window().maximize();
//        Thread.sleep(3000);
//        driver.manage().window().minimize();
//        Thread.sleep(3000);
//        driver.manage().window().fullscreen();
//        Thread.sleep(3000);
//        driver.manage().window().maximize();
//        Thread.sleep(3000);
//        System.out.println(driver.manage().window().getSize());
//        System.out.println(driver.manage().window().getPosition());
//        driver.manage().window().setSize(new Dimension(800,600));
//        Thread.sleep(3000);
//        driver.manage().window().setPosition(new Point(80,0));
//        Thread.sleep(3000);
//        driver.manage().window().maximize();
//        driver.close();
//        driver.quit();

//        driver.get("https://www.amazon.com");
//        System.out.println(driver.getTitle());
//        String actualtitle = driver.getTitle();
//      if(actualtitle.contains("Amazon")){
//            System.out.println("Tittle testi PASSED");
//        }else{
//          System.out.println("Tittle testi FAILED");
//      }
//
//        System.out.println(driver.getCurrentUrl());
//
//      String url = driver.getCurrentUrl();
//      if(url.contains("amazon")){
//          System.out.println(" url testi PASSED");
//      }else{
//          System.out.println(" url testi FAILED");
//      }
//
//        System.out.println(driver.getWindowHandle());
//
//       String htmlKOD =driver.getPageSource();
//       if (htmlKOD.contains("Gateway")){
//           System.out.println(" htm testi PASSED");
//       }else{
//           System.out.println(" hml url testi FAILED");
//       }
//
//       driver.close();
//       driver.quit();

//        driver.navigate().to("https://www.amazon.com");
//        driver.navigate().to("https://tr-tr.facebook.com/");
//        Thread.sleep(3000);
//        driver.navigate().back();
//        Thread.sleep(3000);
//        driver.navigate().forward();
//        Thread.sleep(3000);
//        driver.navigate().refresh();
//        driver.close();

        driver.get("https://www.amazon.com");
        System.out.println("Sayfanin konumu " +driver.manage().window().getPosition());
        System.out.println("Sayfanin boyutu " +driver.manage().window().getSize());
driver.manage().window().minimize();
Thread.sleep(3000);
driver.manage().window().maximize();
        System.out.println("Sayfanin konumu " +driver.manage().window().getPosition());
        System.out.println("Sayfanin boyutu " +driver.manage().window().getSize());

        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        System.out.println("Sayfanin konumu " +driver.manage().window().getPosition());
        System.out.println("Sayfanin boyutu " +driver.manage().window().getSize());
        Thread.sleep(3000);
        driver.close();
    }
}
