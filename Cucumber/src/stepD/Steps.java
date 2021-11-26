package stepD;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
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
	@When("^User Enter beats solo in the top search inputbox$")
	public void User Enter_beats_solo_in_the_top_search_inputbox() throws Throwable{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Beats Solo");

	}
	@And("^Click search button$")
	public void Click_search_button() throws Throwable{
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		driver.findElement(By.linkText("Add to List")).click();
	}
}
