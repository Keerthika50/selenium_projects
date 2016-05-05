package projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	/**
	 * Drag and Drop Elements Automation............
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver obj=new FirefoxDriver();
		obj.get("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		obj.switchTo().frame(0);
		Actions a=new Actions(obj);
		a.dragAndDrop(obj.findElement(By.id("draggable")), obj.findElement(By.id("droppable"))).build().perform();
		
		
		//By using positions (x and y) coordinates.........
		
		/*int x=obj.findElement(By.id("draggable")).getLocation().getX();
		int y=obj.findElement(By.id("draggable")).getLocation().getY();
		a.dragAndDropBy(obj.findElement(By.id("droppable")),x,y).build().perform();*/
		  
		 
		
		obj.close();
		

	}

}
