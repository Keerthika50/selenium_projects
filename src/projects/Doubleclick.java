package projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	/**
	 * Perform Double Click on an Element..........
	 */
	public static void main(String[] args) {
		WebDriver obj=new FirefoxDriver();
		obj.get("http://www.flipkart.com");
		Actions a=new Actions(obj);
a.doubleClick(obj.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div/a[1]"))).build().perform();
obj.close();


	}

}
