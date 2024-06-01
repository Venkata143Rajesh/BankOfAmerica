package Exam;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	public WebDriver driver;
	
  
  @Test(priority=1)
  public void Course() throws Exception {
	  
	//Write a script to check the search box in courses page
	  
	  driver.findElement(By.linkText("Courses")).click();
	  Thread.sleep(3000);
	  
	  driver.findElement(By.name("searchbykeyword")).sendKeys("1-Hour Illinois Sexual Harassment Training");
	  driver.findElement(By.id("searchbykeyword")).click();
	  Thread.sleep(3000);
	    
  }
  @Test(priority=2)
  public void FreeTrailPage() throws Exception {
	
	  //Write a script to check Free Trial page
	  		
	  		driver.findElement(By.xpath("//div[contains(@class,'navbar-nav d-lg-inline-block')]//a[1]")).click();
	  		Thread.sleep(3000);
	  
		    //FirstName
			driver.findElement(By.id("firstName")).sendKeys("Ganesh");	
			Thread.sleep(3000);
			
			//LastName
			driver.findElement(By.id("lastName")).sendKeys("Naidu");
			Thread.sleep(3000);
			
			//Email Id
			driver.findElement(By.id("inputEmail")).sendKeys("ganesh123@gmail.com");
			Thread.sleep(3000);
			
			//Phone
			driver.findElement(By.id("Phone")).sendKeys("1234567890");
			Thread.sleep(3000);
			
			//Password
			driver.findElement(By.id("inputpassword")).sendKeys("Ganesh123@");
			Thread.sleep(3000);
			
			//Confirmation Password
			driver.findElement(By.id("password_confirmation")).sendKeys("Ganesh123@");
			Thread.sleep(3000);
			
			//Check box (terms and conditions)
			driver.findElement(By.id("agree_terms_of_service")).click();
			Thread.sleep(3000);
			
			//Sign Up
			driver.findElement(By.xpath("//button[normalize-space()='Sign Up']")).click();
			Thread.sleep(3000);
  }
  
  @Test(priority=3)
  public void LoginPage() throws Exception {
	  
	  //Write a script to validate Login page
	  
	  		//Login
			driver.findElement(By.linkText("Login")).click();
			Thread.sleep(3000);
			
			//Email Address
			driver.findElement(By.id("exampleInputEmail1")).sendKeys("ganesh123@gmail.com");
			Thread.sleep(3000);
			
			//Password
			driver.findElement(By.id("inputPassword5")).sendKeys("Ganesh123@");
			Thread.sleep(3000);
			
			//Login button
			driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
			Thread.sleep(3000);
	 
  }
  

  @BeforeTest
  public void beforeTest() throws Exception {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://hshceu.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
  }

  @AfterTest
  public void afterTest() {
  }

}
