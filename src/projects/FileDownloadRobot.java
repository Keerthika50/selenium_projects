package projects;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FileDownloadRobot {

	/**
	 *File download using Robot 
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		WebDriver obj=new FirefoxDriver();
		obj.get("http://www.google.com");

		obj.findElement(By.name("q")).sendKeys("Selenium download");
		Thread.sleep(5000);
		
		Actions a=new Actions(obj);
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		
		obj.findElement(By.linkText("Downloads - Selenium")).click();
		
		obj.findElement(By.linkText("/html/body/div/div[1]/ul/li[4]/a")).click();
		obj.findElement(By.linkText("2.53.0")).click();
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		
	}

	}


