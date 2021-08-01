import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//seleniumcode- 
		//create Driver object for chrome browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		driver.get("https://yahoo.com");
		driver.navigate().back();
		driver.close();//closes current browser
		//driver.quit(); // closes all broswer
		
		
	}

}
