import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//implicit wait globally
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		String[] itemsNeeded = {"Cucumber","Brocolli","Beetroot","Tomato"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		addItems(driver,itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		WebDriverWait w = new WebDriverWait(driver,15);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoinfo")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoinfo")).getText());
		
		
		/*Base b = new Base();
		b.addItems(driver, itemsNeeded);*/
		
	}

		
	public static void addItems(WebDriver driver,String[] itemsNeeded)
	{
		int j=0;
		
		List<WebElement> products= driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<products.size();i++)
		{
			//Brocolli - 1 Kg : split - 
			//String name = products.get(i).getText();
			String[] name = products.get(i).getText().split("-");
			String formattedName=name[0].trim();
			
			//convert array into array list for easy search
			//check whether name you extracted is present in arraylist or not ?
			
			List itemNeededList = Arrays.asList(itemsNeeded);
			//System.out.println(itemNeededList);
			
			
			//if(name.contains("itemsNeeded"))
			//if (itemNeededList.contains(name))
			if (itemNeededList.contains(formattedName))
				
			{
				j++;
				//click on cart
				//driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==itemsNeeded.length)
				{
				break;
				}
			}
			
		}
	}
}
