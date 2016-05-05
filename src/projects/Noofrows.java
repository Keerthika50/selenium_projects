package projects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/* 
 * Program on gmail site to find Number of rows 
 * in mailbox table..........
 */


public class Noofrows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver obj=new FirefoxDriver();
		obj.get("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false#identifier");
		Thread.sleep(5000);
		obj.findElement(By.name("Email")).sendKeys("anusha.vipparapelli@gmail.com");
		obj.findElement(By.id("next")).click();
		Thread.sleep(5000);
		obj.findElement(By.name("Passwd")).sendKeys("$aanvi1010");
		obj.findElement(By.id("signIn")).click();
		Thread.sleep(5000);
		
		//getting no. of rows in mailbox.
		
		List <WebElement> l=obj.findElements(By.tagName("tr"));
		System.out.println(l.size());
		obj.close();
		

	}

}
