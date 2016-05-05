package projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/* Program on getAttribute, getCssValue.........
 * 
 */
public class GetattributCssvaluegetText {
	public static void main(String[] args) throws InterruptedException {
		WebDriver obj=new FirefoxDriver();
		obj.get("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false#identifier");
		Thread.sleep(5000);
		
		//getAttribute......
		
		String x=obj.findElement(By.name("Email")).getAttribute("id");
		System.out.println(x);
		
		//getcssValue......
		
		String y=obj.findElement(By.name("Email")).getCssValue("height");
		System.out.println(y);
		
		
		
		
		obj.close();
		
				

	}

}
