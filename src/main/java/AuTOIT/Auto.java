package AuTOIT;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Auto {
public static void main(String[] args) throws AWTException {
	 WebDriver driver = new EdgeDriver();
	 driver.get("https://pdf2doc.com/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
	 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/label/span")).click();
	 
	 
     Robot  rb = new Robot();
	 

StringSelection str = new StringSelection("C:\\Users\\kbjagadeesh\\Downloads\\fgh");
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str,null);

rb.keyPress(KeyEvent.VK_CONTROL);
rb.keyPress(KeyEvent.VK_V);

rb.keyRelease(KeyEvent.VK_CONTROL);
rb.keyRelease(KeyEvent.VK_V);

rb.keyPress(KeyEvent.VK_ENTER);
rb.keyRelease(KeyEvent.VK_ENTER);

}
}
