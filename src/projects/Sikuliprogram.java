package projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Screen;

public class Sikuliprogram {

	/**
	 * @throws Exception 
	 * @
	 */
	public static void main(String[] args) throws Exception {
		WebDriver obj=new FirefoxDriver();
		obj.get("http://www.millionclouds.com/");
		Thread.sleep(10000);
		
		Screen s=new Screen();
		s.click("C:\\Users\\Saanvi\\Documents\\selenium\\images.sikuli\\1461325936004.png");
		
		obj.close();

	}

}
