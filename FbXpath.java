import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");
		//// xpath :    tagName[@attribute='value')]
		//driver.findElement(By.xpath("//input[@id ='email']")).sendKeys("username");
		//driver.findElement(By.xpath("//input[@name = 'pass']")).sendKeys("password");
		//driver.findElement(By.xpath("//*[@name = 'login']")).click();
		
		
	//// xpath :    tagName[attribute='value')]  / tagName#id / tagname.classname
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("myownxpath");
		//driver.findElement(By.cssSelector("[name='pass']")).sendKeys("bypasstagname");
		//driver.findElement(By.cssSelector("input#pass")).sendKeys("anotherway");
		driver.findElement(By.cssSelector("#pass")).sendKeys("bypasstagname");
		
		
		
	}

}
