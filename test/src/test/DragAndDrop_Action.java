package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_Action {

	/**
	 * @param args
	 */
	
	public static WebDriver driver = new FirefoxDriver();
	
	//public String baseurl = "http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html";
	
	public String baseurl = "http://127.0.0.1/~oscarmarin/fitts-law/drag-collide/index.html";

	
	public void open_url()
	{
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	
	public void action_1() throws InterruptedException
	{
		// //*[@id="i1"]
		// //*[@id="box1"]
		// //*[@id="timeline"]
		
		//driver.findElement(By.xpath(".//*[@id='box1']")).click();
		
		driver.findElement(By.xpath(".//*[@id='i1']")).click();

		
		//WebElement dragme = driver.findElement(By.xpath(".//*[@id='box1']"));
		
		WebElement dragme = driver.findElement(By.xpath(".//*[@id='i1']"));

		
		//WebElement dropme = driver.findElement(By.xpath(".//*[@id='box101']"));
		
		WebElement dropme = driver.findElement(By.xpath(".//*[@id='timeline']"));
		Thread.sleep(2000);
		
		Actions builder = new Actions(driver);
		builder.dragAndDrop(dragme, dropme).perform();
		
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		DragAndDrop_Action test = new DragAndDrop_Action();
		test.open_url();
		//Thread.sleep(5000);
		test.action_1();
	}

}
