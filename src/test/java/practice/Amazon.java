package practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon {
	@Test
	public void Launch()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("poco m2 pro");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//span[text()='(Renewed) MI Poco M2 Pro (Two Shades of Black, 6GB RAM, 64GB Storage)']")).click();
		driver.findElement(By.xpath("(//span[text()='(Renewed) MI Poco M2 Pro (Two Shades of Black, 6GB RAM, 64GB Storage)']/../../../following-sibling::div/div/div/div/div/a/span/span/span)[2]")).click();

		String s= driver.getWindowHandle();
		Set<String> s1= driver.getWindowHandles();

		for(String value : s1)
		{
			driver.switchTo().window(value);
		}

		driver.findElement(By.xpath("//span[@id='submit.add-to-cart']")).click();
		driver.findElement(By.xpath("(//a[@class='a-button-text'])[3]")).click();
		String price=	driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap']")).getText();
		System.out.println(price);
	}
}
