package projects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JsCreateAlert {

	/**
	 * To Create Alert in Automation by using JavascriptExecutor..............
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver obj=new FirefoxDriver();
		obj.manage().deleteAllCookies();
		obj.get("http://www.google.com");
		JavascriptExecutor js=(JavascriptExecutor)obj;
		if(obj.manage().getCookies().size()!=0)
		{
			js.executeScript("alert('cookies were loaded');");
			
		}
		else
		{
			js.executeScript("alert('cookies not loaded');");
		}
		Thread.sleep(5000);
		
		//To continue to testing on browser..
		
		obj.switchTo().alert().accept();
		
		obj.close();
		

	}

}
