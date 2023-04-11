package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {
    static String browser = "Chrome";
    static WebDriver driver;
    static String baseUrl = "http://the-internet.herokuapp.com/login";


    public static void main(String[] args) {
        //set up browser
        if(browser.equalsIgnoreCase("Chrome")){
            driver= new ChromeDriver();
        }else if(browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }else if (browser.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
        }else{
            System.out.println("Wrong browser entered");
        }
        //open Url
        driver.get(baseUrl);
        //print title page
        System.out.println(driver.getTitle());
        //print current URl
        System.out.println(driver.getCurrentUrl());
        //print page source
        System.out.println(driver.getPageSource());
        //get username to username field
        driver.findElement(By.name("username")).sendKeys("Admin");
        //get password to password field
        driver.findElement(By.name("password")).sendKeys("admin123");
        //close browser
        driver.close();


    }

}
