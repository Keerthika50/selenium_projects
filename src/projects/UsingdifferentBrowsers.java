package projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class UsingdifferentBrowsers {

	/**
	 * WebDriver Class Object Creation Using Different Browsers.............
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		//Using Firefox
		
		WebDriver obj=new FirefoxDriver();
		obj.get("http://www.google.com");
		Thread.sleep(5000);
		obj.close();
		
		//Using Chrome
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saanvi\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver obj1=new ChromeDriver();
		obj1.get("http://www.gmail.com");
		Thread.sleep(5000);
		obj1.close();
		
		//Using Opera
		
		System.setProperty("webdriver.opera.driver", "C:\\Users\\Saanvi\\Documents\\selenium\\operadriver_win32\\operadriver.exe");
		WebDriver obj2=new OperaDriver();
		obj2.get("http://www.gmail.com");
		Thread.sleep(5000);
		obj2.quit();
		
		//Using InternetExplorer
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Saanvi\\Documents\\selenium\\IEDriverServer_Win32_2.53.0\\iedriverserver.exe");
		WebDriver obj3=new InternetExplorerDriver();
		obj3.get("http://www.google.com");
		Thread.sleep(5000);
		obj3.close();
		
		//Using Safari
		
		WebDriver obj4=new SafariDriver();
		obj4.get("http://www.google.com");
		Thread.sleep(5000);
		obj4.close();
		
		
	
		


	
	}

}
