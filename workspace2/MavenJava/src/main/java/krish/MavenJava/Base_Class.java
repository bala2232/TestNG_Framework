package krish.MavenJava;

import javax.lang.model.element.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base_Class {
	
	public static WebDriver driver;
	
	public static WebDriver getBrowser(String browserName) {
		try {
			if(browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + ("\\Updated Driver\\chromedriver.exe") );
			driver = new ChromeDriver();
			
			}
			else if(browserName.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + ("\\Updated Driver\\msedgedriver.exe") );
				driver = new EdgeDriver();
			}
			else {
				System.out.println("UnIdentified Browser");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		driver.manage().window().maximize();
		
		return driver;
	}
	
	public static void getUrl(String url) {
		driver.get(url);

	}
	
	public static void userLogIn(WebElement element, String values) {
		element.sendKeys(values);

	}

}
