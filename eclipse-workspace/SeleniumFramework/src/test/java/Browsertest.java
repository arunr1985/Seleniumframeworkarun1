import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browsertest 
{
	@Test
	void add()
	{
		
	}
	
public static void main(String[] args) 
{  
	
	//String directory=System.getProperty("user.dir");
	//System.out.println("Project Home Directory is "+directory);
	//System.setProperty("webdriver.gecko.driver",directory+ "/Driver/geckodriver.exe");
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\arunr\\eclipse-workspace\\SeleniumFramework\\Driver\\chromedriver.exe");
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.selenium.dev/downloads/");
	
} 
	
}
