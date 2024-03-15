package testClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;



public class Testsdet {
	
	@Test
	public void loginTestMethod() throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver(option);
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("seluhkhjdjljfljkjkdlklkljchjhkjkjkjkjjgbhjhjhhhhjhjhffnbnbnbjb");
		
		Thread.sleep(2000);
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']//li"));
		
		for(WebElement  element : list) {
			System.out.println(element);
		}
		
		
	}

}
