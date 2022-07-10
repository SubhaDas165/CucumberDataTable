package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Credentials;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v101.webauthn.model.Credential;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SignInStep {
	WebDriver driver;
	String path="D:\\Java\\CucumberDatatable\\BrowserDriver\\chromedriver.exe";

	@Given("Open the application in Chrome")
	public void open_the_application_in_chrome() {
System.setProperty("webdriver.chrome.driver", path);
		
	    driver=new ChromeDriver();
	}

	@Given("Navigate to https:\\/\\/petstore.octoperf.com\\/")
	public void navigate_to_https_petstore_octoperf_com() {
		 driver.get("https://petstore.octoperf.com/");
			System.out.println("navigate");
	}

	@Given("Verify the Title of WebPage")
	public void verify_the_title_of_web_page() {
		String title= driver.getTitle();	
	}

	@Given("Checked the pages load succesfully")
	public void checked_the_pages_load_succesfully() {
		 System.out.println("Succfuly load");
	}

	@Then("Click enter the store link")
	public void click_enter_the_store_link() {
		driver.findElement(By.partialLinkText("Enter the Store")).click();;
		System.out.println("clicked the link");
	}

	@Then("Check the sign In page appears")
	public void check_the_sign_in_page_appears() {
		System.out.println("Sign in succesfully");
	}

	@Then("User click on username and Password")
	public void user_click_on_username_and_password(DataTable dataTable) {
		 driver.findElement(By.partialLinkText("Sign In")).click();
		    java.util.List<String> data=dataTable.row(0);
		    driver.findElement(By.name("username")).sendKeys(data.get(0));
		    driver.findElement(By.name("password")).clear();
		    driver.findElement(By.name("password")).sendKeys(data.get(1));
		    driver.findElement(By.name("signon")).click();
	}

}
