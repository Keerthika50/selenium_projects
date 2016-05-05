package projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousemove {

	/**
	 * Move Mouse Pointer to an element...
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver obj=new FirefoxDriver();
		obj.get("http://www.flipkart.com");
		Actions a=new Actions(obj);
	a.moveToElement(obj.findElement(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[3]/a"))).build().perform();
	
		// By using x and Y coordinates...
		
		/*int x=obj.findElement(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[3]/a")).getLocation().getX();
		int y=obj.findElement(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[3]/a")).getLocation().getY();
		 a.moveByOffset(x, y); */
		 Thread.sleep(5000);
		 obj.close();

	}

}
