package projects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * Program to getTitle() and getCurrentUrl()...............
 */

public class Gettitle {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver obj=new FirefoxDriver();
		obj.get("http://www.google.com");
		Thread.sleep(5000);
		
		//getTitle();
		
		String x=obj.getTitle();
		System.out.println(x);
		
		//getcurrentUrl();
		
		String y=obj.getCurrentUrl();
		if(y.contains("https"))
		{
		System.out.println("securable");
		}
		else
		{
			System.out.println("non securable");
			
		}
		
		obj.close();
	}

}
