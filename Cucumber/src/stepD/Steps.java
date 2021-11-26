package stepD;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	@Given("^Open the Chrome driver and start the application$")
	public void open_the_chrome_driver_and_start_the_application() throws Throwable{
		System.setProperty("webdriver.chrome.driver", "/Users/User/Downloads/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com/");
	}
	@When("^Enter the information of specific product$")
	public void Enter_the_information_of_specific_product(){
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Beats3 Studio");

	}
	@Then("^User should be able to add to cart$")
	public void User_should_be_able_to_add_to_cart() throws Throwable{
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		driver.findElement(By.linkText("Add to List")).click();
	}
}
