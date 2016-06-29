package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSite {
		
	public static void main(String[] args) throws InterruptedException {
		System.out.println("testing with firefox");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.wikipedia.org");
		WebElement link;
		link = driver.findElement(By.linkText("English"));
		link.click();
		Thread.sleep(5000);
		WebElement searchBox;
		searchBox = driver.findElement(By.id("searchInput"));
		searchBox.sendKeys("Fitts's Law");
		searchBox.submit();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
