package google.cicddemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googleautomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver =new FirefoxDriver();
		driver.get("https://iteamsgcp-pwa.hulcd.com/login");
		driver.manage().window().maximize();
		
	}

}
