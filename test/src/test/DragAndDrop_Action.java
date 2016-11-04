package test;

import java.util.Random;

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
	
		    Random r = new Random();
		    int rintOneX = r.nextInt((4-1))+1;		
		    System.out.println(rintOneX);
		    int rintTwoX = r.nextInt((4-1))+1;		
		    System.out.println(rintTwoX);
		    int rintThreeX = r.nextInt((4-1))+1;		
		    System.out.println(rintThreeX);
		    int rintOneY = r.nextInt((4-1))+1;		
		    System.out.println(rintOneY);
		    int rintTwoY = r.nextInt((4-1))+1;		
		    System.out.println(rintTwoY);
		    int rintThreeY = r.nextInt((4-1))+1;		
		    System.out.println(rintThreeY);
		    
		    
		
		// //*[@id="i1"]
		// //*[@id="box1"]
		// //*[@id="timeline"]
		
		//driver.findElement(By.xpath(".//*[@id='box1']")).click();
		
		driver.findElement(By.xpath(".//*[@id='i1']")).click();

		
		//WebElement dragme = driver.findElement(By.xpath(".//*[@id='box1']"));
		
		WebElement dragme = driver.findElement(By.xpath(".//*[@id='i1']"));

		
		//WebElement dropme = driver.findElement(By.xpath(".//*[@id='box101']"));
		
		WebElement dropme = driver.findElement(By.xpath(".//*[@id='timeline']"));
		//Thread.sleep(2000);
		
		Actions builder = new Actions(driver);
		System.out.println("About to Click and Hold");
		builder.clickAndHold(dragme);
		System.out.println("About to move to offset");

		builder.moveByOffset(40, 75);
		builder.pause(25);
		System.out.println("About to move to offset");

		builder.moveByOffset(rintOneX, rintOneY);
		builder.pause(25);
		System.out.println("About to move to offset");

		builder.moveByOffset(rintTwoX, rintTwoY);
		builder.pause(25);
		System.out.println("About to move to offset");

		builder.moveByOffset(rintThreeX, rintThreeY);


		//Thread.sleep(5000);
		System.out.println("About to move to element");

		builder.moveToElement(dropme);
		//builder.dragAndDrop(dragme, dropme).perform();
		System.out.println("About to release");

		builder.release().perform();
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		DragAndDrop_Action test = new DragAndDrop_Action();
		test.open_url();
		//Thread.sleep(5000);
		test.action_1();
	}

}
