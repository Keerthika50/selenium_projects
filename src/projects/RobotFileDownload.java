package projects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotFileDownload {

	/**
	 * Program on to download SOAPUI...
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		//Launch google.......
		
		WebDriver obj=new FirefoxDriver();
		obj.get("http://www.google.com");
		
		//send text to search box
		obj.findElement(By.name("q")).sendKeys("soapui download");
		Thread.sleep(5000);
		
		Actions a=new Actions(obj);
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		
		obj.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[2]/div[1]/div[1]/div[2]/div/div/div")).click();
		obj.findElement(By.xpath("/html/body/div/div[5]/div[4]/div[7]/div[1]/div[3]/div/div[3]/div[2]/div/div/div/div/div[1]/div/h3/a")).click();
		
		//click on getit.....
		
		obj.findElement(By.xpath("/html/body/form/div[4]/div[1]/div[2]/div[3]/div[3]/div/div/div/div/div[2]/a[1]")).click();
		
		

	}

}
