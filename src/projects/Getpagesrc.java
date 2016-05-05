package projects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/* 
 * Program to getPageSource().............
 */

public class Getpagesrc {

	public static void main(String[] args) throws InterruptedException {
		WebDriver obj=new FirefoxDriver();
		obj.get("http://www.gmail.com");
		Thread.sleep(5000);
		
		String x=obj.getPageSource();
		System.out.println(x);
		
		obj.close();

	}

}
