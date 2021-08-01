import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerHeader= driver.findElement(By.id("gf-BIG"));
		System.out.println(footerHeader.findElements(By.tagName("a")).size());
		
		WebElement coloumnDriver = footerHeader.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coloumnDriver.findElements(By.tagName("a")).size());
		
		for(int i=1; i<coloumnDriver.findElements(By.tagName("a")).size();i++)
		{
			String clickonLinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			coloumnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonLinkTab);
			Thread.sleep(5000);
			
			Set<String> abc=driver.getWindowHandles();
			Iterator<String> it =abc.iterator();
			
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
				
				
			}
			
			
		}
		

	}

}
