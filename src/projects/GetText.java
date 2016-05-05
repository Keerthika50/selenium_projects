package projects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/*
 * Gmail Program to get o/p msg and display  getText................
 */

public class GetText {


	public static void main(String[] args) throws InterruptedException {
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
		Thread.sleep(5000);
		obj.findElement(By.name("to")).sendKeys("anusha.vipparapelli@gmail.com");
		obj.findElement(By.name("subjectbox")).sendKeys("hi");
		obj.findElement(By.xpath("/html/body/div[13]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[1]/td/div/div[1]/div[2]/div[1]/div/table/tbody/tr/td[2]/div[2]/div")).sendKeys("hi","\n", "hw ru..?", "\n", "bye");
		obj.findElement(By.xpath("/html/body/div[13]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/div[4]/table/tbody/tr/td[1]/div/div[2]")).click();
		
		//getText..........
		
		String s=obj.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[1]/div[5]/div[1]/div[2]/div[3]/div/div/div[2]")).getText();
		System.out.println(s);
		
		
		Thread.sleep(5000);
		obj.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		obj.findElement(By.linkText("Sign out")).click();
		obj.close();
	}

}
