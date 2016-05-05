package projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebElementClass {

	/**
	 * Program on WebElement Class
	 * @throws InterruptedException 
	 * 	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver obj=new FirefoxDriver();
		obj.get("http://www.gmail.com");
		Thread.sleep(5000);
		WebElement w=obj.findElement(By.name("Email"));
		String x=w.getAttribute("placeholder");
		String y=w.getCssValue("font-size");
		System.out.println(x+" "+y);
		obj.close();
		
		
		

	}

}
