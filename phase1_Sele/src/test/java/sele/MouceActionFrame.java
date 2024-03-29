package sele;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MouceActionFrame {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
   
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		WebElement e1 = driver.findElement(By.id("draggable"));
		
		WebElement e2 = driver.findElement(By.id("droppable"));
		
		Actions a = new Actions(driver);
		
		a.clickAndHold(e1).moveToElement(e2).release().perform();
	}
}
