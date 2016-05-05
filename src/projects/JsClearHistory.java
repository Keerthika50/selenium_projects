package projects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JsClearHistory {

	/**
	 *Clear Browser History using JavascriptExecutor..............
	 */
	public static void main(String[] args) {
		WebDriver obj=new FirefoxDriver();
		obj.get("http://www.google.com");
		JavascriptExecutor js=(JavascriptExecutor)obj;
		js.executeScript("history.go(0);");
		obj.close();

	}

}
