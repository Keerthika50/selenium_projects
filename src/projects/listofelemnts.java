package projects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/* 
 * Program to collect list of images in website
 * using List class.....
 */

public class listofelemnts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver obj=new FirefoxDriver();
		obj.get("https://www.mercurytravels.co.in/ontramercury/faces/jsp/flightSearch.jsp");
		Thread.sleep(5000);
		List <WebElement> l=obj.findElements(By.tagName("img"));
		System.out.println(l.size());
		obj.close();

	}

}
