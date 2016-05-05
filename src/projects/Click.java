package projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {

	/**
	 *Click an Element in page.....
	 *Indirect Automation.....
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver obj=new FirefoxDriver();
		obj.get("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false#identifier");
		Thread.sleep(5000);
		obj.findElement(By.name("Email")).sendKeys("anusha.vipparapelli@gmail.com");
		Actions a=new Actions(obj);
		a.click(obj.findElement(By.name("signIn"))).build().perform();
		
		
		//on Active Element
		
		//a.click().build().perform();
		obj.close();
		


	}

}
