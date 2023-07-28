package Registration_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathexample_class {

	public static void main(String[] args) {
    
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        
        //Relative x path
        
        //WebElement Watch = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        //Watch.sendKeys("Watches for Women");
        //WebElement searchbutton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
        //searchbutton.click();
        //WebElement Womenclear = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        //Womenclear.clear();
        //WebElement Watchmen = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        //Watchmen.sendKeys("Watches for Men");
        //WebElement Search = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
        //Search.click();
        
        
        //xpath with or
        WebElement Watch = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' or @name='field-keywords']"));
        Watch.sendKeys("Watches for Women");
        WebElement searchbutton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button' or @name='nav-input nav-progressive-attribute']"));
        searchbutton.click();
        
        
        //xpath with and
        /*WebElement Watch = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @name='field-keywords']"));
        Watch.sendKeys("Watches for Women");
        WebElement searchbutton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button' and @name='nav-input nav-progressive-attribute']"));
        searchbutton.click();
        */
        
        
        
        
        //contains()
        
        /*
        WebElement Watch = driver.findElement(By.xpath("//input[contains(@id, 'twotab')]"));
        Watch.sendKeys("Watches for Women");
        WebElement searchbutton = driver.findElement(By.xpath("//input[contains(@id, 'nav-search')]"));
        searchbutton.click();
        */
        
        
        
        
        //starts with
        
       /*
        WebElement Watch = driver.findElement(By.xpath("//input[starts-with(@id, 'twotab')]"));
        Watch.sendKeys("Watches for Women");
        
        WebElement searchbutton = driver.findElement(By.xpath("//input[starts-with(@id, 'nav-search')]"));
        searchbutton.click();
        */
        
        
        
        
        //text
        //WebElement Watch = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
        //Watch.click();
        
       //chained
       /*WebElement Watch = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' // @name='field-keywords']"));
       Watch.sendKeys("Jeans for Women");
       WebElement searchbutton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button' // @name='nav-input nav-progressive-attribute']"));
       searchbutton.click();*/
        
	}

}
