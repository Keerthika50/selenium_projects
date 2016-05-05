package projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;

public class Sikuli3 {

	/**
	 * Program on dropdown list.......
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		WebDriver obj=new FirefoxDriver();
		obj.get("http://newtours.demoaut.com/");
		Thread.sleep(5000);
		obj.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(5000);
		obj.findElement(By.name("firstName")).sendKeys("apj");
		obj.findElement(By.name("lastName")).sendKeys("kalam");
		obj.findElement(By.name("phone")).sendKeys("98654433");
		obj.findElement(By.name("userName")).sendKeys("apj@gmail.com");
		obj.findElement(By.name("address1")).sendKeys("tamilnadu");
		obj.findElement(By.name("address2")).sendKeys("rameshwaram");
		obj.findElement(By.name("city")).sendKeys("tN");
		obj.findElement(By.name("state")).sendKeys("rameswaram");
		obj.findElement(By.name("postalCode")).sendKeys("506773");
		
		//Using Sikuli to automate Drop-Down list....
		
		Screen s=new Screen();
		s.click("C:\\Users\\Saanvi\\Documents\\selenium\\images.sikuli\\1461666314751.png");
		
			for(int i=1;i<=140;i++){
		s.keyDown(Key.UP);
		s.keyUp(Key.UP);
			}
			
		//s.keyDown(Key.UP);
		//s.keyUp(Key.UP);
		
			s.keyDown(Key.DOWN);
			s.keyUp(Key.UP);
		
			obj.close();
			
			s.keyDown(Key.ENTER);
			s.keyUp(Key.ENTER);
		

	}
	
	
	
	
	
	
	

}
