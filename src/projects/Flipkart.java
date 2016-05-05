package projects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
/**
 * 
 * @author Saanvi
 *This program will search any item and selects
 *first searched result.. 
 */
public class Flipkart {

	/**
	 * @param args
	 * @throws InterruptedException 
	 * 
	 * 
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver obj=new FirefoxDriver();
		obj.get("http://www.flipkart.com/");
		obj.manage().window().maximize();
		obj.findElement(By.name("q")).sendKeys(" samsung refrigerator");
		Thread.sleep(5000);
		Actions a=new Actions(obj);
		//a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		obj.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div[1]/div/div[2]/div[6]/div/div[3]/div/div[2]/div/div/div/div[1]/div[1]/div/div[1]/a[1]")).click();
		Thread.sleep(15000);
		obj.close();

	}

}
