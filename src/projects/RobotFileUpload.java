package projects;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotFileUpload {

	/**
	 * fileupload window / Pop-up window....
	 * upload a file in gmail site...
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		WebDriver obj=new FirefoxDriver();
		obj.get("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false#identifier");
		Thread.sleep(5000);
		obj.findElement(By.name("Email")).sendKeys("anusha.vipparapelli@gmail.com");
		obj.findElement(By.id("next")).click();
		Thread.sleep(5000);
		obj.findElement(By.name("Passwd")).sendKeys("$aanvi1010");
		obj.findElement(By.id("signIn")).click();
		Thread.sleep(5000);
		obj.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div[1]/div/div")).click();
		obj.findElement(By.name("to")).sendKeys("kishorekumar.vanam@gmail.com");
		obj.findElement(By.name("subjectbox")).sendKeys("photo");
		Actions a=new Actions(obj);
		a.sendKeys(Keys.TAB).build().perform();
		a.sendKeys("Automation").build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		a.sendKeys("to").build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		a.sendKeys("upload file").build().perform();
		Thread.sleep(5000);
		
		//file upload
		
		a.sendKeys(Keys.TAB,Keys.TAB,Keys.ENTER).build().perform();
		
		StringSelection s=new StringSelection("F:\\Saanvi\\8_8_2015\\Picture 024.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		Thread.sleep(10000);
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		//TO move focus to ok..
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		//Press enter...
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(15000);
		
		//send mail
		
		obj.findElement(By.xpath("/html/body/div[13]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/div[4]/table/tbody/tr/td[1]/div/div[2]")).click();
		
		//logout
		
		obj.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		obj.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div[3]/div[2]/a")).click();
		
		obj.close();
		
		
		
		
		
		
		

	}

}
