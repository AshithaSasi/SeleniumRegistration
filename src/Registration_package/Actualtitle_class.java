package Registration_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actualtitle_class {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\acer\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
		
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		driver.quit();

	}

}
