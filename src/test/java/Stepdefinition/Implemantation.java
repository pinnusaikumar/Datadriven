package Stepdefinition;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Implemantation 
{
	
	
	static WebDriver driver;
	static Properties prop;
	@Given("Open the Browser")
	//@Before
	public void open_the_browser() throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Testwc\\WorkSpace\\AutomationTestingUsingBBDMethodelogy\\src\\test\\resources\\Configuration\\objectrepo.properties");
		prop=new Properties();
		prop.load(fis);
		ChromeOptions chrome=new ChromeOptions();
		chrome.addArguments("--start-maximized");
		driver=new ChromeDriver(chrome);
		//driver.manage().window().maximize();
	}
	@Given("Navigate to the URL {string}")
	public void navigate_to_the_url(String url) 
	{
	 driver.get(url);   
	}
	@When("Enter Username {string}")
	public void enter_username(String username) 
	{
	  WebElement un=driver.findElement(By.xpath(prop.getProperty("username"))); 
	  un.sendKeys(username);
	}
	@When("Enter Password {string}")
	public void enter_password(String password) 
	{
		WebElement pwd=driver.findElement(By.xpath(prop.getProperty("password")));
		pwd.sendKeys(password);
	    
	}
	
	@When("Click on login button")
	public void click_on_login_button()
	{
	   WebElement login=driver.findElement(By.xpath(prop.getProperty("login")));
	   login.click();
	}
	@Then("Verify wheater login is successful")
	public void verify_wheater_login_is_successful() 
	{
	   if(driver.findElement(By.xpath(prop.getProperty("logout"))).isDisplayed())
	   {
		   System.out.println("login is success");
	   }
	   else
	   {
		   System.out.println("Login is Failed");
	   }
	}
	@When("Click on orders menu")
	public void click_on_orders_menu() 
	{
	    WebElement order=driver.findElement(By.xpath(prop.getProperty("orders")));
	    order.click();
	}
	@When("Select product dropdown")
	public void select_product_dropdown() 
	{
	WebElement product=driver.findElement(By.xpath(prop.getProperty("product")));
	Select sc=new Select(product);
	sc.selectByVisibleText("FamilyAlbum");
}
	@When("Enter Quantity {string}")
	public void enter_quantity(String Quantity) 
	{
	  WebElement quantity=driver.findElement(By.xpath(prop.getProperty("quantity")));
	quantity.sendKeys(Quantity);
	}
	@When("Enter the Customer name  {string}")
	public void enter_the_customer_name(String customername) 
	{
		WebElement custname=driver.findElement(By.cssSelector(prop.getProperty("customername")));
		custname.sendKeys(customername);
	   
	}
	@When("Enter the Street      {string}")
	public void enter_the_street(String street) 
	{
	    WebElement str=driver.findElement(By.xpath(prop.getProperty("street")));
	    str.sendKeys(street);
	    
	}
	@When("Enter the city    {string}")
	public void enter_the_city(String city) 
	{
	    WebElement cit=driver.findElement(By.xpath(prop.getProperty("city")));
	    cit.sendKeys(city);
	}
	@When("select the State  {string}")
	public void select_the_state(String State) 
	{
	  WebElement stat=driver.findElement(By.xpath(prop.getProperty("state")));
	  stat.sendKeys(State);
	}
	@When("select the zip {string}")
	public void select_the_zip(String zip) 
	{
		WebElement zip1=driver.findElement(By.xpath(prop.getProperty("zip")));
		zip1.sendKeys(zip);
	}
	@When("Select card")
	public void select_card() 
	{
		WebElement card=driver.findElement(By.xpath(prop.getProperty("card"))) ;
		card.click();
		System.out.println(card.isDisplayed());
	}
	@When("Enter card no {string}")
	public void enter_card_no(String cardno) 
	{
	    WebElement cardno1=driver.findElement(By.xpath(prop.getProperty("cardno")));
	    cardno1.sendKeys(cardno);
	}
	@When("Expirydate    {string}")
	public void expirydate(String expirydate) 
	{
	   WebElement expdate=driver.findElement(By.xpath(prop.getProperty("Expirydate")));
	   expdate.sendKeys(expirydate);
	}
	@When("click on process button")
	public void click_on_process_button() 
	{
	   WebElement process=driver.findElement(By.xpath(prop.getProperty("process")));
	   process.click();
	}
	@Then("verify order is sucessful added.")
	public void verify_order_is_sucessful_added() 
	{
	   if(driver.findElement(By.xpath(prop.getProperty("Maincontent"))).isDisplayed())
	   {
		   System.out.println("order is sucessfully added");
	   }
	   else
	   {
		   System.out.println("order is not completed");
	   }
	}
	@When("click on register button")
	public void click_on_register_button() 
	{
	  WebElement register=driver.findElement(By.xpath(prop.getProperty("register")));
	  register.click();
	}
	@When("wait for sometime to load the page")
	public void wait_for_sometime_to_load_the_page() throws InterruptedException 
	{
	    Thread.sleep(10000);
	}
	@When("Enter username {string}")
	public void enter_username1(String irctcusername) 
	{
		WebElement un=driver.findElement(By.xpath(prop.getProperty("irctcusername")));
		un.sendKeys(irctcusername);   
	}
	@When("Enter password {string}")
	public void enter_password1(String irctcpassword)
	{
	 WebElement irctcpwd=driver.findElement(By.xpath(prop.getProperty("irctcpassword")));
	 irctcpwd.sendKeys(irctcpassword);
	}
	@When("Enter Confirmpassword {string}")
	public void enter_confirmpassword(String confirmpassword) 
	{
	   WebElement confirmpwd=driver.findElement(By.xpath(prop.getProperty("confirmpassword")));
	   confirmpwd.sendKeys(confirmpassword);
	}
	@When("Select language")
	public void select_language() throws InterruptedException
	{
	    driver.findElement(By.xpath(prop.getProperty("language"))).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[text()='English']")).click();
	  //  driver.findElement(By.cssSelector(".ng-tns-c65-14:nth-child(1) > .ui-dropdown-item")).click();
	   
	}
	@When("Select securityquestion")
	public void select_securityquestion() 
	{
		 driver.findElement(By.xpath(prop.getProperty("securityquestion"))).click(); 
		 driver.findElement(By.xpath(prop.getProperty("sqdata"))).click();
	}
	@When("Enter securityAnswer {string}")
	public void enter_security_answer(String securityAnswer) 
	{
	 driver.findElement(By.xpath(prop.getProperty("sqAnswer"))).sendKeys(securityAnswer);
	  
	}
	@When("Click on continue")
	public void click_on_continue() 
	{
	    WebElement cont=driver.findElement(By.xpath(prop.getProperty("continue")));
	    cont.click();
	}
	@When("click on contactus")
	public void click_on_contactus() 
	{
	  WebElement contactus=driver.findElement(By.xpath(prop.getProperty("contactus")));
	  contactus.click();
      WebElement close=driver.findElement(By.cssSelector(prop.getProperty("close")));
      close.click();
	}
	@When("Enter firstname {string}")
	public void enter_firstname(String firstname) 
	{
	    WebElement fstname=driver.findElement(By.xpath(prop.getProperty("firstname")));
	    fstname.sendKeys(firstname);
	}
	@When("Enter middlename {string}")
	public void enter_middlename(String middlename) 
	{
	    WebElement midname=driver.findElement(By.xpath(prop.getProperty("middlename"))) ;
	    midname.sendKeys(middlename);
	}
	@When("Enter lastname {string}")
	public void enter_lastname(String lastname) 
	{
		WebElement  lstname=driver.findElement(By.xpath(prop.getProperty("lastname")));
		lstname.sendKeys(lastname);
	    
	}
	@When("Select occupation")
	public void select_occupation() 
	{
	    WebElement occupation=driver.findElement(By.xpath(prop.getProperty("occupation")));
	    occupation.click();
	    WebElement data=driver.findElement(By.xpath(prop.getProperty("occdata")));
	    data.click();
	}
	
	@Then("verify login is succesfull")
	public void verify_login_is_succesfull() 
	{
	   
	}
	@Given("Navigate to the URL")
	public void navigate_to_the_url(io.cucumber.datatable.DataTable dataTable) 
	{
		List<List<String>> data=dataTable.asLists();
		String url=data.get(0).get(0);
		driver.get(url);
	}
	@When("dologin")
	public void dologin(io.cucumber.datatable.DataTable dataTable) 
	{
		List<List<String>> data=dataTable.asLists();
	   String username= data.get(2).get(0);//row.column
	   String password=data.get(2).get(1);
	   
	   
	   
		WebElement un=driver.findElement(By.xpath(prop.getProperty("username"))); 
		un.sendKeys(username);
		WebElement pwd=driver.findElement(By.xpath(prop.getProperty("password")));
		pwd.sendKeys(password);
		WebElement login=driver.findElement(By.xpath(prop.getProperty("login")));
		login.click();
	    
	}


	/*@Before
	public void opentheBrowser()
	{
		
	}
	@After("@irctccontactus")
	public void closetheBrowser()
	{
		driver.close();
	}*/
	









}



	