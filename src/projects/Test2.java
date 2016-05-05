package projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 {

	
	public static void main(String[] args) throws InterruptedException {
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
		Select s=new Select(obj.findElement(By.name("country")));
		s.selectByVisibleText("INDIA");
		obj.findElement(By.name("email")).sendKeys("apjkalam");
		obj.findElement(By.name("password")).sendKeys("indian");
		obj.findElement(By.name("confirmPassword")).sendKeys("indian");
		obj.findElement(By.name("register")).click();
		obj.close();
		

	}

}
