package projects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JsEnableDisable {

	/**
	 * Disable Enabled Element and Enable Disabled Element using JavascriptExecutor................
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver obj=new FirefoxDriver();
		obj.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default");
		JavascriptExecutor js=(JavascriptExecutor)obj;
		
		//Disable Element
		
		//js.executeScript("arguments[0].setAttribute('disabled', '')",obj.findElement(By.name("RecoveryPhoneNumber")));
		
					//[OR]
		
		js.executeScript("document.getElementsByName('RecoveryPhoneNumber')[0].setAttribute('disabled','');"); 
		Thread.sleep(5000);
		
		//Enable Element
		
		js.executeScript("arguments[0].removeAttribute('disabled')", obj.findElement(By.name("RecoveryPhoneNumber")));
		
								//[OR]
		
		//js.executeScript("document.getElementsByName('RecoveryPhoneNumber')[0].removeAttribute('disabled');");
		Thread.sleep(5000);
	
		
		obj.close();
		

	}

}
