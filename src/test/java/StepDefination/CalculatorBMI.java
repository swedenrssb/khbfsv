package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculatorBMI {
	WebDriver driver;
	@Given("Open URL for {string}")
	public void open_URL_for(String URL) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		// webdriver is interface and chromedriver is class
		
		driver.get(URL);
	}
	
@Then("Validate the Tittle of the current page")
public void validate_the_Tittle_of_the_current_page() {
 String ActualtitleOfPage = driver.getTitle();
 String ExpectedtitleOfPage = "Calorie Calculator";
 Assert.assertEquals(ExpectedtitleOfPage, ActualtitleOfPage);
 System.out.println("Expected Title :"+ExpectedtitleOfPage);
 System.out.println("Actual Title : "+ActualtitleOfPage);
}


@When("Click on BMI Calculator")
public void click_on_BMI_Calculator() {
    System.out.println("User click on BMI calculator tab");
    driver.findElement(By.xpath("//*[@id=\"menuon\"]/a")).click();
}

@When("Enter age as {string}")
public void enter_age_as(String age) {
	driver.findElement(By.id("cage")).clear();
	driver.findElement(By.id("cage")).sendKeys(age);
}

@When("Enter height as {string}")
public void enter_height_as(String height) {
	driver.findElement(By.id("cheightmeter")).clear();
	driver.findElement(By.id("cheightmeter")).sendKeys(height);
}

@When("Enter weight as {string}")
public void enter_weight_as(String weight) {
	driver.findElement(By.id("ckg")).clear();
	driver.findElement(By.id("ckg")).sendKeys(weight);
}

@When("Tap on Calulate BMI")
public void tap_on_Calulate_BMI() {
 driver.findElement(By.xpath("//*[@id=\"content\"]/div[5]/table[4]/tbody/tr[3]/td[2]/input[2]")).click();
}

@Then("Capture the BMI Result value & Print it")
public void capture_the_BMI_Result_value_Print_it_getText() {
   String MaintainWeight= driver.findElement(By.xpath("//*[@id=\"content\"]/table[1]/tbody/tr[1]/td[2]/div/b")).getText();
   String MildWeightLoss = driver.findElement(By.xpath("//*[@id=\"content\"]/table[1]/tbody/tr[2]/td[2]/div/b")).getText();
   String WeightLoss = driver.findElement(By.xpath("//*[@id=\"content\"]/table[1]/tbody/tr[3]/td[2]/div/b")).getText();
   String ExtremeWeightLoss = driver.findElement(By.xpath("//*[@id=\"content\"]/table[1]/tbody/tr[4]/td[2]/div/b")).getText();
   
   
   System.out.println("Maintain Weight :"+MaintainWeight);
   System.out.println("Mild Weight Loss :"+MildWeightLoss);
   System.out.println("Weight Loss :"+WeightLoss);
   System.out.println("Extreme Weight Loss :"+ExtremeWeightLoss);
}

@Then("Close the browser")
public void close_the_browser() {
	driver.close();
}
	
	
}
