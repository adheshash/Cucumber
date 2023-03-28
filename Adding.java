package StepDefinition;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adding {
WebDriver driver;
	
	@Given("user search for item")
	public void user_search_for_item() {
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
			  WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
				search.sendKeys("redmi note 11");
				WebElement startsearch=driver.findElement(By.id("nav-search-submit-button"));
				startsearch.click();
			String oldwindow=	driver.getWindowHandle();
				
	}

	@Given("user item is selected")
	public void user_item_is_selected() {
		WebElement mobile=driver.findElement(By.partialLinkText("Redmi Note 11 (Starburst White, 4GB RAM, 64GB Storage"));
		mobile.click();
		Set<String> handles	=driver.getWindowHandles();
		for (String newwindow : handles) {
			driver.switchTo().window(newwindow);
		}
	}

	@When("user is adding it to draft")
	public void user_is_adding_it_to_draft() {
		WebElement cart=driver.findElement(By.id("add-to-cart-button"));
		cart.click();
	driver.navigate().to("https://www.amazon.in/gp/yourstore/home?path=%2Fgp%2Fyourstore%2Fhome&useRedirectOnSuccess=1&signIn=1&action=sign-out&ref_=nav_AccountFlyout_signout");
	WebElement idraft=driver .findElement(By.name("ADdging_to_draft"));
	idraft.click();
	
	
	
	}

	@Then("user increase the draft")
	public void user_increase_the_draft() {
		WebElement confirm=driver.findElement(By.xpath("//*[@id=\'attach-sidesheet-view-cart-button\']/span/input"));
		confirm.click();
		WebElement removeoneitemm=driver.findElement(By.id("Submit_button_in_Draft"));
		WebElement drop=driver.findElement(By.id("Drop_Down_Draft"));
		Select sel=new Select(drop);
		sel.selectByIndex(0);
		driver.close();
		
		
	}

	
	
}
