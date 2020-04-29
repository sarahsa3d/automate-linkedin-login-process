package linkedloginpackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linkedinclass {

    public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\K I N G\\Downloads\\Compressed\\geckodriver-v0.26.0-win64");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.linkedin.com/login");   // lunch linkedin login page
	   

	   //locate web elements by id and xpath
	  
	  WebElement username=driver.findElement(By.id("username"));  
	  WebElement password=driver.findElement(By.id("password"));   
	  WebElement login=driver.findElement(By.xpath("//button[text()='Sign in']")); 

	  
	  //Actions and validating 
	  
	  username.sendKeys("example@gmail.com"); 
	  password.sendKeys("password"); 
	  login.click(); 
    }

}
