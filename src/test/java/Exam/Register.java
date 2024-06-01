package Exam;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Register {
	
	public WebDriver driver;
	
  @Test
  public void function() throws Exception {
	  //Full Name: First Name
	  driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Venkata Rajesh");
	  Thread.sleep(3000);
	  //Last Name
	  driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Chappa");
	  Thread.sleep(3000);
	  //Address
	  driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("Vizag is Beautifull");
	  Thread.sleep(3000);
	  //Email address
	  driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rajesh@gmail.com");
	  Thread.sleep(3000);
	  //Phone
	  driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9123456689");
	  Thread.sleep(3000);
	  //Here we noticed that for Gender locator name value is same for both the male and female. 
	  //If we take locator as name it always displays only male that is issue here.
	  //So we can preffer Xpath is better here.
	  //Gender:Male
	 //  driver.findElement(By.name("radiooptions")).click();
	 // Thread.sleep(3000);
	  //Gender: Female
	   //  driver.findElement(By.name("radiooptions")).click();
	  //   Thread.sleep(3000);
	  //Gender: Male: xpath
	  driver.findElement(By.xpath("//input[@value='Male']")).click();
	  Thread.sleep(3000);
	  //Hobbies:Cricket
	  driver.findElement(By.id("checkbox1")).click();
	  Thread.sleep(3000);
	  //Hobbies:Movies
	  driver.findElement(By.id("checkbox2")).click();
	  Thread.sleep(3000);
	  //Hobbies:Hockey
	  driver.findElement(By.id("checkbox3")).click();
	  Thread.sleep(3000);
	  //Language
	  driver.findElement(By.id("msdd")).click();
	  Thread.sleep(3000);
	  //Selecting Language as English
	  driver.findElement(By.xpath("//section[@id='section']//li[8]")).click();
	  Thread.sleep(3000);
	  //Skill
	new Select(driver.findElement(By.xpath("//select[@id='Skills']"))).selectByVisibleText("Java");
	Thread.sleep(3000);
	//Country
	//new Select(driver.findElement(By.id("countries"))).selectByVisibleText("India");
	driver.findElement(By.id("countries")).click();
	Thread.sleep(3000);
    //Select Country
	driver.findElement(By.xpath("//span[@role='combobox']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//li[normalize-space()='India']")).click();
	/*
	 * driver.switchTo().activeElement().sendKeys("India");
	 * driver.switchTo().activeElement().sendKeys(Keys.ENTER);
	 */
	Thread.sleep(3000);
	//Date Of Birth:Year
	new Select(driver.findElement(By.id("yearbox"))).selectByVisibleText("2006");
	Thread.sleep(3000);
	//Month
	new Select(driver.findElement(By.xpath("//select[@placeholder='Month']"))).selectByVisibleText("July");
	Thread.sleep(3000);
	//Date
	new Select(driver.findElement(By.id("daybox"))).selectByVisibleText("6");
	Thread.sleep(3000);
	//Password
	driver.findElement(By.id("firstpassword")).sendKeys("ABC@123");
	Thread.sleep(3000);
	//Confirmation Password
	driver.findElement(By.id("secondpassword")).sendKeys("ABC@123");
	Thread.sleep(3000);
	//Refresh 
	//driver.findElement(By.id("Button1")).click();
	//Thread.sleep(3000);
	//Submit
	driver.findElement(By.id("submitbtn")).click();
	Thread.sleep(3000);
}
  
  @BeforeTest
  public void Openurl() throws Exception {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demo.automationtesting.in/Register.html");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
