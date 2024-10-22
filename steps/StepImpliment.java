package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepImpliment {
	
	public ChromeDriver driver;
	public ChromeOptions option;
	
	@Given("Launch the browser and load the url")
	public void launch_the_browser_and_load_the_url() {
		option = new ChromeOptions();
		option.addArguments("--disable-notification");			
		driver = new ChromeDriver(option);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Then("Enter the username as {string}")
	public void enter_the_username_as(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
	}
	@Then("Enter the password as {string}")
	public void enter_the_password_as(String pWord) {
		driver.findElement(By.id("password")).sendKeys(pWord);
	}
	@When("Click on the login butto")
	public void click_on_the_login_butto() {
		driver.findElement(By.id("Login")).click();
	}
	@Then("Click app launcher icon")
	public void click_app_launcher_icon() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	}
	@Then("Click on view all")
	public void click_on_view_all() {
		driver.findElement(By.xpath("//button[text()='View All']")).click();
	}
	@Then("Click on the sales option")
	public void click_on_the_sales_option() {
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
	}
	@Then("Click on the oppotunities dropdown")
	public void click_on_the_oppotunities_dropdown() {
		WebElement ele = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", ele);
	}
	@Then("Click on new option")
	public void click_on_new_option() {
		driver.findElement(By.xpath("//div[text()='New']")).click();
	}
	@Then("Enter the opportunity name {string}")
	public void enter_the_opportunity_name(String pName) {
		driver.findElement(By.xpath("//label[contains(text(),'Opportunity Name')]/following::input[@class='slds-input']")).sendKeys(pName);
	}
	@Then("Enter the amount(.*)$")
	public void enter_the_amount(String value) {
		driver.findElement(By.xpath("//div[@type='text']/input[@name='Amount']")).sendKeys(value);
	}
	@Then("Click on date option")
	public void click_on_date_option() {
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
	}
	@Then("Select a date")
	public void select_a_date() {
		driver.findElement(By.xpath("//button[text()='Today']")).click();
	}
	@Then("Click on stage option")
	public void click_on_stage_option() {
		driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input slds')]/span[@class='slds-truncate'])[2]")).click();
	}
	@Then("Select option")
	public void select_option() {
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
	}
	@When("Click on save button")
	public void click_on_save_button() {
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
	}
	@Then("creat should be verifed")
	public void creat_should_be_verifed() {
		String result = driver.findElement(By.xpath("//div[@class='slds-media__body']/h1")).getText();
		if (result.contains("Ajith")) {
			System.out.println("Opportunity created");
		}
		else
			System.out.println("Opportunity not created");

	}
}
