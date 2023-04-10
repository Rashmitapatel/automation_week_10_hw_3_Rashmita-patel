package browserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTesting {
    public static void main(String[] args) {
        // base url
        String baseUrl = "http://the-internet.herokuapp.com/login";
        //Launch the  ChromBrowser
        WebDriver driver = new ChromeDriver();
        //open the Url in Browser
         driver.get(baseUrl);
         //Maximise the Browser window
        driver.manage().window().maximize();
        //we give Iplicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Get the title of the page
        String title = driver.getTitle();
        //Get the current URL
        System.out.println("Current Url:" + driver.getCurrentUrl());
        // Get the page source
        System.out.println("Page source:"+driver.getPageSource());
        //Find the userName Field element
        WebElement userNameField = driver.findElement(By.id("username"));
        //Type the UserName to userName field element
        userNameField.sendKeys("Prime123@gmail.com");
        // Type the Password to Password field element
        driver.findElement(By.id("password")).sendKeys("Prime123");

        // Close the Browser
          driver.close();
          driver.quit();
    }
}





