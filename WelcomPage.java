package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WelcomPage {
WebDriver driver;
	@When("user enter into the HomePage")
	public void user_enter_into_the_home_page() {
	   
	    System.setProperty("WebDriver.Chrome.Driver", "D:\\driver\\Chrome\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt);
		driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Damazon%2Bsign%26i%3Delectronics%26adgrpid%3D59527504272%26ext_vrnc%3Dhi%26hvadid%3D597352931660%26hvdev%3Dc%26hvlocphy%3D9061929%26hvnetw%3Dg%26hvqmt%3Db%26hvrand%3D8509678709815997355%26hvtargid%3Dkwd-365111317397%26hydadcr%3D19941_2255885%26tag%3Dgooginhydr1-21%26ref%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		WebElement email=driver.findElement(By.name("email"));
	    email.sendKeys("9677146326");
	    WebElement conbutton=driver.findElement(By.xpath("//*[@type='submit']"));
	    conbutton.click();
	    WebElement pass=driver.findElement(By.name("password"));
	    pass.sendKeys("adhesh@123");
	    WebElement signinbutton=driver.findElement(By.xpath("//*[@type='submit']"));
		  signinbutton.click();
	}

	@And("user checks for the Amazon logo")
	public void user_checks_for_the_amazon_logo() {
		WebElement title=driver.findElement(By.id("nav-logo-sprites"));
		
			   boolean status=title.isDisplayed();
			   System.out.println("Valid user");
		
	}

	@And("user checks  for tht Title of Amazon")
	public void user_checks_for_tht_title_of_amazon() {
	   String title= driver.getTitle();
	   System.out.println("Title of amazon :"+ title);
	}

	@And("user verfiys Welcome MsgID")
	public void user_verfiys_welcome_msg_id() {
	  WebElement sel=  driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	 String selmsg= sel.getAttribute("value");
	 System.out.println(selmsg);
	}

	@Then("check whether user able to serach item")
	public void check_whether_user_able_to_serach_item() {
	    System.out.println("Wek");
	}
	
	
	
}
