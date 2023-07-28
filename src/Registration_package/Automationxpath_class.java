package Registration_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automationxpath_class {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
	        
		WebElement Firstname = driver.findElement(By.xpath("//input[@id='firstName']"));
		Firstname.sendKeys("Ashitha");
		
        WebElement Lastname = driver.findElement(By.xpath("//input[@id='lastName']"));
        Lastname.sendKeys("Sasi");
        
        WebElement Email = driver.findElement(By.xpath("//input[@id='userEmail']"));
        Email.sendKeys("ashitha.sasi@gmail.com");
        
        
        WebElement Gender = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
        Gender.click();
        
        //WebElement Hobbies = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']"));
	    //Hobbies.click();
        
        //WebElement Mobile = driver.findElement(By.xpath("//input[@id='userNumber']"));
        //Mobile.sendKeys("7878987876");
        
	    
        //Date picker
        WebElement date = driver.findElement(By.xpath("//*[@id='dateOfBirthInput']"));
        date.click();
        WebElement Month = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
        Select Monthdrop = new Select(Month);
        Monthdrop.selectByVisibleText("November");
        
        WebElement Year = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
        Select Yeardrop = new Select(Year);
        Yeardrop.selectByVisibleText("1995");
         
        WebElement Day = driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__day')]"));
        Select Datdrop = new Select(Day);
        Datdrop.selectByVisibleText("26");
        Day.click();
        
        //image upload
        WebElement fileInput = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
        fileInput.sendKeys("C:\\Users\\acer\\Desktop\\photozz\\Camera\\image1.jpg");
        try
        {
          Thread.sleep(5000);
        }
          catch(InterruptedException e)
        {
        	  e.printStackTrace();
        }
       
        WebElement Currentaddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        Currentaddress.sendKeys("Puliyanmackal house,Thodupuzha");
        
        WebElement Subject = driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']"));
        Subject.sendKeys("Malayalam");
        
	}

}
