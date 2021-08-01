import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		/* locators 
		driver.findElement(By.id("email")).sendKeys("Firstcode");
		driver.findElement(By.name("pass")).sendKeys("12345");
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.className("inputtext login_form_input_box")).sendKeys("pass");
		
		<input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email" placeholder="Email address or phone number" autofocus="1" aria-label="Email address or phone number">
		********************************************************
		XPATH SYNTAX: 
		//tagName[@attribute='value']
		//*[@attribute='value']
		Regular exp : //tagName[contains(@attribute,'value')]
		
		
		//input[@id='email']
		//*[@id='email'] -- skip tagname
		 
		 //*[@id='tablist1-tab']following-sibling::li[2]
		 //*[@id='tablist-tab']/parent::ul
		 //*[text()=' SoapUI ']
		
		 
		 ******************************************************
		 CSSSelector SYNATX :
		 tagName[attribute='value'] 
		 tagName#id
		 #id
		 Regular exp : tagName[(@attribute*='value')]
		 
		 
		 */
		
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("12345");
		driver.findElement(By.cssSelector("#pass")).sendKeys("123");
		driver.findElement(By.xpath("//*[@id='u_0_d_Kj']")).click();
		
	}

}
