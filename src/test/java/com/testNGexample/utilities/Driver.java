package com.testNGexample.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {
    static WebDriver driver;

    //static methot örneği
    public static WebDriver getDriver(){
       if(driver == null){
           //properties dosyasından "browser" değerini getirecek
           String browser = ConfigurationReader.getProperty("browser");

           switch (browser) {
               case "chrome":
                   WebDriverManager.chromedriver().setup();
                   driver = new ChromeDriver();
                   break;

               case "firefox":
                   WebDriverManager.firefoxdriver().setup();
                   driver= new FirefoxDriver();
                   break;
               case "ie":
                   WebDriverManager.iedriver().setup();
                   driver=new InternetExplorerDriver();
                   break;
           }
       }
       return driver;
    }

    //işimiz bitince driver'ı hafızadan sil
    public static void closeDriver(){
        if(driver != null){
            driver.quit();
            driver =null;
        }
    }



}
