import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
		
		driver.findElement(By.cssSelector("[class='fsw_inputBox dates inactiveWidget ']")).click();
		Boolean flag = (driver.findElement(By.cssSelector(" [class*='DayPicker-Caption']")).getText().contains("November 2021"));
		System.out.println(flag);
		while(!flag)
				{
					Thread.sleep(2000);
					 driver.findElement(By.cssSelector("span[class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		
				}
		
		
		List<WebElement> days = driver.findElements(By.cssSelector("[class*='DayPicker-Day'] div[class='dateInnerCell'] p:nth-child(1)"));
		int count = days.size();
		//System.out.println(count);
		
		for(int i=0; i<count; i++)
		{
			String day = days.get(i).getText();
			//System.out.println(day);
			if (day.equalsIgnoreCase("27"))
			{
				driver.findElements(By.cssSelector("[class*='DayPicker-Day'] div[class='dateInnerCell'] p:nth-child(1)")).get(i).click();
				break;
			}
		}
	}
		
		
		
		
		
		
	}

