package projects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	/**
	 *Right Click on an Element.........
	 **/
	public static void main(String[] args) {
		WebDriver obj=new FirefoxDriver();
		obj.get("http://www.flipkart.com");
		Actions a=new Actions(obj);
		a.contextClick(obj.findElement(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[3]/a"))).build().perform();
		
		//Right Click on Active Element....
		
		
		//a.contextClick().build().perform();
		
		obj.close();
	}

}
