package projects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JsfillData {

	/**
	 * To Fill an Element With Data using JavascriptExecutor.............
	 * @throws InterruptedException 
	 * 	 
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver obj=new FirefoxDriver();
		obj.get("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false#identifier");
		Thread.sleep(5000);
	    JavascriptExecutor js=(JavascriptExecutor)obj;
	    js.executeScript("arguments[0].value='anusha.vipparapelli@gmail.com';", obj.findElement(By.name("Email")));
	    
	    							//[OR]
	    			
	   // js.executeScript("document.getElementsByName('Email')[0].value='anusha.vipparapelli@gmail.com';");
	    
	    		
	    obj.close();
	    

	}

}
