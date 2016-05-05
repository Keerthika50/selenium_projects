package projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Button;
import org.sikuli.script.Screen;

public class Sikuli1 {

	/**
	 * Automate register page in millionclouds site using Sikuli........
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		WebDriver obj=new FirefoxDriver();
		obj.get("http://www.millionclouds.com");
		
		//Click Register
		
		Screen s=new Screen();
		s.click("C:\\Users\\Saanvi\\Documents\\selenium\\images.sikuli\\1461589157115.png");
		Thread.sleep(5000);
		
		//Enter fields
		
		s.type("C:\\Users\\Saanvi\\Documents\\selenium\\images.sikuli\\1461589172991.png","anusha.vipparapelli@gmail.com");
		s.type("C:\\Users\\Saanvi\\Documents\\selenium\\images.sikuli\\1461589364635.png","anusha.vipparapelli@gmail.com");
		s.type("C:\\Users\\Saanvi\\Documents\\selenium\\images.sikuli\\1461589376048.png","saanvi");
		s.type("C:\\Users\\Saanvi\\Documents\\selenium\\images.sikuli\\1461589386989.png","saanvi");
		
		s.click("C:\\Users\\Saanvi\\Documents\\selenium\\images.sikuli\\1461589396332.png");
		
		//scroll mouse to bottom
		
		s.wheel(Button.WHEEL_DOWN, 5);
		
		s.click("C:\\Users\\Saanvi\\Documents\\selenium\\images.sikuli\\1461589406093.png");
		
		
		obj.close();
		
	}

}
