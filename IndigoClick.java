import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class IndigoClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goindigo.in/");
		
		driver.findElement(By.name("passenger")).click();
		
		/*
		 int i=1;
		 while(i<10)
		{
		driver.findElement(By.xpath("//*[@id=\'bookFlightTab\']/form/div[5]/div[1]/div[2]/ul/li[1]/div/button[2]")).click();
		i++;
		}
		*/
		
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.xpath("//*[@id=\'bookFlightTab\']/form/div[5]/div[1]/div[2]/ul/li[1]/div/button[2]")).click();
		}
				
		//driver.findElement(By.name("pax-plus btn btn-info")).click();
		//driver.findElement(By.name("icon-plus")).click();
		//System.out.println(driver.findElement(By.xpath("//div[@id='bookFlightTab']/form/div[3]/div[2]/div[1]/div/input")).getText());
		
		
		

	}

}
