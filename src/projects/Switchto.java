package projects;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/* 
 * Program on Switching windows using Way2sms Site using ArrayList........
 */

public class Switchto {

	
	public static void main(String[] args) throws Exception {
	WebDriver obj=new FirefoxDriver();
	obj.get("http://site21.way2sms.com/content/prehome.html");
	Thread.sleep(5000);
	
	ArrayList <String> a=new ArrayList <String>(obj.getWindowHandles());
	
	//Switch to advertisment site and close
	
	obj.switchTo().window(a.get(1));
	obj.close();
	
	//switch to way2sms site
	
	obj.switchTo().window(a.get(0));
	obj.close();
	
	}

}
