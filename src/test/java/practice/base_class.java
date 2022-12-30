package practice;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class base_class {
	WebDriver driver;
	public data_utility du= new data_utility();
	@Test
	@BeforeClass(alwaysRun=true)
	public void LaunchBrowser() throws Exception
	{
		driver = new ChromeDriver();
		driver.get(du.getDataFromProperties("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	@BeforeMethod(alwaysRun=true)
	public void login() throws Exception
	{
		driver.findElement(By.id("username")).sendKeys(du.getDataFromProperties("USERNAME"));
		driver.findElement(By.name("password")).sendKeys(du.getDataFromProperties("PASSWORD"));
		driver.findElement(By.xpath("//button[text()='login']")).click();
	}

    @Test
	@AfterMethod(alwaysRun=true)
	public void logout()
	{
		driver.findElement(By.xpath("//a[@title='Logout']")).click();
	}

    @Test
	@AfterClass(alwaysRun=true)
	public void close_Window()
	{
		driver.close();
	}
}

