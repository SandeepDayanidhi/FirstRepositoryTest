import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greenkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int j=0;
		
		String[] itemsNeeded = {"Cucumber","Brocolli","Beetroot","Tomato"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
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
