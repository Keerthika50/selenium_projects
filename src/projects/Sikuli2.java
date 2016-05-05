package projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Button;
import org.sikuli.script.Location;
import org.sikuli.script.Screen;

public class Sikuli2 {

	/**
	 * Automate youtube site with Sikuli...........
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		WebDriver obj=new FirefoxDriver();
		obj.get("http://www.youtube.com");
		
		obj.findElement(By.name("search_query")).sendKeys("infobells");
		obj.findElement(By.id("search-btn")).click();
		
		obj.findElement(By.linkText("Top 25 Hindi Rhymes for Children Infobells")).click();
		
		Thread.sleep(5000);
		
		Screen s=new Screen();
		
		//Skip add
		
		if(s.exists("C:\\Users\\Saanvi\\Documents\\selenium\\images.sikuli\\1461663309864.png")!=null)
		{
			s.click("C:\\Users\\Saanvi\\Documents\\selenium\\images.sikuli\\1461663309864.png");
		}
		
		//move mouse pointer to video to display icons.......
		
		Location l=new Location(100,300);
		s.wheel(l, Button.LEFT, 0);
		
		//stop video
		
		s.click("C:\\Users\\Saanvi\\Documents\\selenium\\images.sikuli\\1461665202481.png");
		
		Thread.sleep(5000);
		
		//Play Video
		
		s.click("C:\\Users\\Saanvi\\Documents\\selenium\\images.sikuli\\1461665364833.png");
		
		//move mouse to specified icon...
		
		s.mouseMove("C:\\Users\\Saanvi\\Documents\\selenium\\images.sikuli\\1461665526508.png");
		
		//increase or decrease volume......
		//Decrease volume.
		
		s.dragDrop("C:\\Users\\Saanvi\\Documents\\selenium\\images.sikuli\\1461665639650.png", "C:\\Users\\Saanvi\\Documents\\selenium\\images.sikuli\\1461665688544.png");
		
		//Increase Volume.........
		
		s.dragDrop("C:\\Users\\Saanvi\\Documents\\selenium\\images.sikuli\\1461665688544.png", "C:\\Users\\Saanvi\\Documents\\selenium\\images.sikuli\\1461665639650.png");
		
		//automate settings also.......
		
		
		
		
		
		
		
		
		
		
		
	}

}
