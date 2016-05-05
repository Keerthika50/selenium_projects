package projects;

import java.util.ArrayList;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchToAlert {

	/**
	 * Program on alert using way2sms site.......
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		WebDriver obj=new FirefoxDriver();
		obj.get("http://site21.way2sms.com/content/index.html");
		Thread.sleep(5000);
		
		ArrayList<String> a=new ArrayList<String>(obj.getWindowHandles());
		
		//close add site
		
		obj.switchTo().window(a.get(1));
		obj.close();
		
		//switch to  way2sms site
		
		obj.switchTo().window(a.get(0));
		
		//Login...
		
		obj.findElement(By.name("username")).sendKeys("9642845540");
		obj.findElement(By.name("password")).sendKeys("saanvi1010");
		obj.findElement(By.id("loginBTN")).click();
		
		//skip email verfication.....
		
		obj.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[3]/div/input[3]")).click();
		
		//click send free sms...
		
		obj.findElement(By.xpath("/html/body/div[2]/div/form/div[2]/div[1]/input")).click();
		
		//Send sms....
	
		obj.findElement(By.xpath("/html/body/div[7]/div[1]/ul/li[2]/a")).click();
		
		//fill fields and send...
		
		obj.switchTo().frame("frame");
		
		obj.findElement(By.name("mobile")).sendKeys("9989301575");
		obj.findElement(By.name("message")).sendKeys("hi");
		obj.findElement(By.name("Send")).click();
		
		//Get output and display
		
		String s=obj.findElement(By.xpath("/html/body/form/div[3]/div/p/span")).getText();
		System.out.println(s);
		
		//Do Logout
		
		obj.switchTo().defaultContent();
		obj.findElement(By.xpath("/html/body/div[5]/div/ul/li[7]/i")).click();
		
		obj.close();
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
