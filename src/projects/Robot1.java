package projects;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Robot1 {

	/**
	 * To automate calculator using Robot class....
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		//Launch Calculator..
		
		Runtime.getRuntime().exec("calc.exe");
		Thread.sleep(5000);
		
		//Automate Calculator...
		
		Robot r=new Robot();
		
		//Put 1st Input in clip-board........
		
		StringSelection s1=new StringSelection("546");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1,null);
		
		//Paste in calculator.......
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		
		//Perform Minus...
		
		r.keyPress(KeyEvent.VK_MINUS);
		r.keyRelease(KeyEvent.VK_MINUS);
		
		//Put 2nd Input in clip-board....
		
		StringSelection s2=new StringSelection("234");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s2,null);
		
		//Paste in calculator...
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		
		//Perform equals...
		
		r.keyPress(KeyEvent.VK_EQUALS);
		r.keyRelease(KeyEvent.VK_EQUALS);
		Thread.sleep(5000);
		
		//Copy output into clip-board....
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		
		//Get Output from clip-board to Console......
		
		String x=(String)Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		System.out.println(x);
		
		//Close calculator.......
		
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_ALT);
		
	
	}

}
