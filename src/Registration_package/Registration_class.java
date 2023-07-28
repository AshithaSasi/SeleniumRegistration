package Registration_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration_class {

	public static void main(String[] args) {
		
	//set the path to the ChromeDriver executable.	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");
	
	//create a new instance of the ChromeDriver.
	WebDriver driver = new ChromeDriver();
	
	//navigate to the automation demo site  page using GET method.
	driver.get("https://demo.automationtesting.in/Register.html");
	
	//maximize the window
	driver.manage().window().maximize();
	
	//find the first name input field and enter your first name
	WebElement Firstname = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
	Firstname.sendKeys("Ashitha");
	  
	//find the last name input field and enter your last name
	WebElement Lastname = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
	Lastname.sendKeys("Sasi");
	
	//find the address input field and enter your address
	WebElement Address = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
	Address.sendKeys("Puliyanmackal house, Thodupuzha");
	
	//find the email address input field and enter your email address
	WebElement Email = driver.findElement(By.xpath("//*[@id=\"eid\"]/input"));
	Email.sendKeys("ashitha.sasi@gmail.com");
	
	//find phone number input field and enter your phone number
	WebElement Phone = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
	Phone.sendKeys("8756765676");
	
	//option button
    WebElement Female = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input"));
    Female.click();
	
    //check box
    WebElement Hobbies = driver.findElement(By.id("checkbox2"));
    Hobbies.click();
    
    //Languages
    //Select Languages = new Select(driver.findElement(By.id("msdd")));
    // Languages.selectByIndex(3);
    
    
    //select skills
  	Select dropskills = new Select(driver.findElement(By.id("Skills")));
  	dropskills.selectByIndex(10);
  	
	//select value from visible text)
	//dropskills.selectByVisibleText("C++");
	
	//select value using index
	//dropskills.selectByIndex(3);
	
	//select value using by value
	//dropskills.selectByValue("C++");
	
  	
  	
  	
   //select country
   // Select dropcountry = new Select(driver.findElement(By.id("countries")));
   //dropcountry.selectByVisibleText("India");	
   
	
	 
	//select select country
	//Select selectcountry = new Select(driver.findElement(By.id("select2-country-container")));
	//selectcountry.selectByValue("Hong Kong");
  	
  	
  	
    //date of birth
  	Select dropdate = new Select(driver.findElement(By.id("daybox")));
  	dropdate.selectByIndex(3);
  	Select dropmonth = new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")));
  	dropmonth.selectByIndex(3);
  	Select dropyear = new Select(driver.findElement(By.id("yearbox")));
  	dropyear.selectByIndex(3);
  	
    //find the password input field and enter your password.
  	WebElement password = driver.findElement(By.xpath("//*[@id=\"firstpassword\"]"));
  	password.sendKeys("automationtest123");
  
  	
  	
	//find the confirm password input field and enter your confirm password.
	WebElement Confirmpassword = driver.findElement(By.xpath("//*[@id=\"secondpassword\"]"));
	Confirmpassword.sendKeys("automationtest123");
		
  		
	 
	//find the submit button and click it
	WebElement submit = driver.findElement(By.name("signup"));
	submit.click();
	
	//find the refresh button and click it
	//WebElement Refresh = driver.findElement(By.id("Button1"));
	//Refresh.click();
	
	//driver.close();
	
	}

}
