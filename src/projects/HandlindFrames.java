package projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlindFrames {

	/**
	 * Handling Multiple frames....
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		WebDriver obj=new FirefoxDriver();
		obj.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		Thread.sleep(5000);
		
		obj.switchTo().frame(0);
		obj.findElement(By.linkText("com.thoughtworks.selenium")).click();
		
		obj.switchTo().defaultContent();
		
		obj.switchTo().frame(1);
		obj.findElement(By.xpath("/html/body/div/ul/li[1]/a")).click();
		
		obj.switchTo().defaultContent();
		
		obj.switchTo().frame(2);
		obj.findElement(By.xpath("/html/body/div[3]/table/tbody[2]/tr[1]/td[1]/a")).click();
		
		

	}

}
