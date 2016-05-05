package projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickandHold {

	/**
	 * Mouse Click Holding an Element........
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver obj=new FirefoxDriver();
		obj.get("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false#identifier");
		Actions a=new Actions(obj);
		a.clickAndHold(obj.findElement(By.name("signIn"))).build().perform();
		Thread.sleep(5000);
		a.release().build().perform();
		
		
		//Click and Hold on active Element.....
		
		/*a.clickAndHold().build().perform();
		Thread.sleep(5000);
		a.release().build().perform()*/
		
		obj.close();
	
	
	
	}
}