import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesForceLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hello");
		driver.findElement(By.name("pw")).sendKeys("passss");
		//driver.findElement(By.className("button r4 wide primary")).click();//error : compoundclasses not permitted
		//driver.findElement(By.xpath("//*[@id='Login']")).click();
		driver.findElement(By.cssSelector("#Login")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error")).getText());

	}

}
