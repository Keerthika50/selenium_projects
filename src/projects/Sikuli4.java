package projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Button;
import org.sikuli.script.Screen;

public class Sikuli4 {

	/**
	 * Sikuli program to scroll left and scroll right..........
	 * @throws Exception 
	 * 
	 */
	public static void main(String[] args) throws Exception {
		WebDriver obj=new FirefoxDriver();
		obj.get("http://www.flipkart.com");
		
		Screen s=new Screen();
		s.wheel(Button.WHEEL_DOWN,10);
		Thread.sleep(5000);
		
		
		obj.close();
		
		

	}

}
