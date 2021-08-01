import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MutipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create");
		driver.findElement(By.xpath("//*[@id=\"regform\"]/p[1]/a[1]")).click();
		System.out.println("Before switching");
		System.out.println(driver.getTitle());
		Set<String> ids= driver.getWindowHandles();
		Iterator<String>it=ids.iterator();
		String parentId= it.next();
		String childId= it.next();
		driver.switchTo().window(childId);
		System.out.println("After switching");
		System.out.println(driver.getTitle());
		System.out.println("switching back to parent");
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());
		
		
		
	}

}
