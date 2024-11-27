package Tasks;
import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Automation_Script 
{
	public static void main (String[]args) throws AWTException, InterruptedException
	{
		WebDriver d=new ChromeDriver();
		d.get("https://www.opera.com");
		d.manage().window().maximize();
		d.navigate().to("https://fitpeo.com/");
		d.navigate().to("https://fitpeo.com/revenue-calculator");
		JavascriptExecutor scroll=(JavascriptExecutor)d;
		scroll.executeScript("window.scroll(0,350)","");
		WebElement drag=d.findElement(By.xpath("//*[@step=\"1\"][@type=\"range\"][@value=\"200\"]"));
		for (int i = 200; i <820; i++) 
		{
            drag.sendKeys(Keys.ARROW_RIGHT);
        }		
		WebElement slider=d.findElement(By.xpath("(//div[@class='MuiBox-root css-j7qwjs']//child::input)[2]"));	
		slider.clear();
		scroll.executeScript("arguments[0].value = '560';", slider);
		scroll.executeScript("window.scrollBy(0,580)","");
		d.findElement(By.xpath("(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[1]")).click();
		d.findElement(By.xpath("(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[2]")).click();
		d.findElement(By.xpath("(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[3]")).click();
		scroll.executeScript("window.scrollBy(0,250)","");	
		d.findElement(By.xpath("(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[8]")).click();
		
	}

}
