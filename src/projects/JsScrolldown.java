package projects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JsScrolldown {

	/**
	 * To Scroll Down, Scroll top, Scroll left, Scroll right, 
	 * Scroll to specific Element of a Page using JavascriptExecutor.................
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver obj=new FirefoxDriver();
		obj.get("http://www.flipkart.com/");
		JavascriptExecutor js=(JavascriptExecutor)obj;
		
		// Scroll Down
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(5000);
		
		//Scroll Top
		
		js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
		Thread.sleep(5000);
		
		//Scroll Right
		
		js.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(5000);
		
		//Scroll Left
		
		js.executeScript("window.scrollBy(-1000,0);");
		Thread.sleep(5000);
		
		//Scroll to specific Element
		
		js.executeScript("document.getElementsByClassName('gAhwrJ')[1].scrollIntoView();");
		Thread.sleep(5000);
		
		obj.close();
		

	}

}
