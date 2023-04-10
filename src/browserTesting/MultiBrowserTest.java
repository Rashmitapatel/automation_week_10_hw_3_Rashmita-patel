package browserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {
    static String baseUrl =  "= http://the-internet.herokuapp.com/login ";
    static String browser = "Chrome";
    static WebDriver driver ;

    public static void main(String[] args)
    {  if (browser.equalsIgnoreCase("Chrome")){
        driver = new ChromeDriver();
    }else if (browser.equalsIgnoreCase("FireFox")){
        driver = new FirefoxDriver();
    }else if (browser.equalsIgnoreCase("Edge")){
        driver = new EdgeDriver();
    }else {
        System.out.println("Wrong Browser name");
    }
         // maximise the browser
         driver.manage().window().maximize();
        //we give Iplicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Get the title of the page
        String title = driver.getTitle();
        //Get the current URL
        System.out.println("Current Url:" + driver.getCurrentUrl());
        // Get the page source
        System.out.println("Page source:"+driver.getPageSource());
        //Find the UserName Field Element
        WebElement UserNameField = driver.findElement(By.id("username"));
        // Type the Email address to UserName field element
        UserNameField.sendKeys("prime123@gmail.com");

       // Type the Password to Password field element
        driver.findElement(By.name("Password")).sendKeys("Prime123");

      // close the browser
        driver.close();
        driver.quit();
    }
}


