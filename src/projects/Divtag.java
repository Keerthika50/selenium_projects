package projects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Divtag {

	/**
	 * Drop-down developed using <div> tag...
	 * */
	public static void main(String[] args) throws InterruptedException {
		WebDriver obj=new FirefoxDriver();
		obj.get("http://www.gmail.com");
		obj.findElement(By.partialLinkText("Create account")).click();
		obj.findElement(By.name("FirstName")).sendKeys("saanvi");
		obj.findElement(By.name("LastName")).sendKeys("v");
		obj.findElement(By.name("GmailAddress")).sendKeys("saanviv");
		obj.findElement(By.name("Passwd")).sendKeys("saanvi1010");
		obj.findElement(By.name("PasswdAgain")).sendKeys("saanvi1010");
		obj.findElement(By.name("PasswdAgain")).click();
		Actions a=new Actions(obj);
		
		//Get focus to drop-down from previous element
		
		a.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(5000);
		
		//open drop-down
		
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(5000);
		
		//select item starts with "o".
		
		a.sendKeys("Jan").build().perform();
		Thread.sleep(5000);
		
		//Finalize selected item
		
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
		
		obj.findElement(By.name("BirthDay")).sendKeys("22");
		obj.findElement(By.name("BirthYear")).sendKeys("1990");
		
		obj.findElement(By.name("BirthYear")).click();
		a.sendKeys(Keys.TAB).build().perform();
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys("F").build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		
		obj.findElement(By.name("RecoveryPhoneNumber")).sendKeys("2278789098");
		obj.findElement(By.name("RecoveryEmailAddress")).sendKeys("saanu@gmail.com");
		obj.findElement(By.name("SkipCaptcha")).click();
		
		a.sendKeys(Keys.TAB, Keys.DOWN).build().perform();
		a.sendKeys("India").build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		
		obj.findElement(By.name("TermsOfService")).click();
		obj.findElement(By.name("submitbutton")).click();
		Thread.sleep(5000);
		
		
		obj.close();
		
		
		
		
				
		
		

	}

}
