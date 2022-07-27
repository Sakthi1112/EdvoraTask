package edvoraAssig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001 {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sakth\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testing-assessment-foh15kew9-edvora.vercel.app/");
		
		WebElement user_name = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div/div[1]/div/input"));
		user_name.sendKeys("test1");
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div/div[2]/div/input"));
		password.sendKeys("test1");
		
		WebElement btn = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div/button"));
		
		btn.click();
		

		
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}
}
