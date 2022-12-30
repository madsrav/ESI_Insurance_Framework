package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_001_CreateClient {
	WebDriver driver;
	public void login()
	{
		driver = new ChromeDriver();
		driver.get("http://rmgtestingserver/domain/Life_Insurance_Management_System/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("555");
		driver.findElement(By.name("password")).sendKeys("666");
		driver.findElement(By.xpath("//button[text()='login']")).click();
	}
	
	public void logout()
	{
		driver.findElement(By.xpath("//div[@class='header-right']")).click();//logout
		driver.close();
	}
	@Test
	public void createclient()
	{
		driver.findElement(By.xpath("//a[text()='CLIENTS']")).click();
		driver.findElement(By.xpath("//button[@align='center']")).click();
		driver.findElement(By.xpath("//input[@name='client_id']"));
		driver.findElement(By.xpath("//input[@name='client_password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("murthy");
		driver.findElement(By.xpath("//input[@class='img']")).sendKeys("C:\\Users\\Sravan Kumar\\OneDrive\\Pictures\\Screenshots\\Screenshot (30).png");
		driver.findElement(By.xpath("//input[@name='sex']")).sendKeys("male");
		driver.findElement(By.xpath("//input[@name='birth_date']")).sendKeys("04/08/1990");
		driver.findElement(By.xpath("//input[@name='maritial_status']")).sendKeys("unmarried");
		driver.findElement(By.xpath("//input[@name='nid']")).sendKeys("12544666666");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9865896889");
		driver.findElement(By.xpath("//input[@name='address']")).sendKeys("kphb");
		driver.findElement(By.xpath("//input[@name='policy_id']")).sendKeys("569874");
		driver.findElement(By.xpath("//input[@name='agent_id']"));
		driver.findElement(By.xpath("//input[@name='nominee_id']"));
		driver.findElement(By.xpath("//input[@name='nominee_name']")).sendKeys("rajesh");
		driver.findElement(By.xpath("//input[@name='nominee_sex']")).sendKeys("male");
		driver.findElement(By.xpath("//input[@name='nominee_birth_date']")).sendKeys("05/07/1989");
		driver.findElement(By.xpath("//input[@name='nominee_nid']")).sendKeys("66666556665566");
		driver.findElement(By.xpath("//input[@name='nominee_relationship']")).sendKeys("sister");
		driver.findElement(By.xpath("//input[@name='priority']")).sendKeys("1st");
		driver.findElement(By.xpath("//input[@name='nominee_phone']")).sendKeys("9856741258");

		driver.findElement(By.xpath("//input[@type='submit']")).click();//for saving

		driver.findElement(By.xpath("//a[text()='CLIENTS']")).click();
		String clientid =  driver.findElement(By.xpath("//td[.='1671606923']")).getText();
		if(clientid.equalsIgnoreCase("1671606923"))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}
		
	}

}
