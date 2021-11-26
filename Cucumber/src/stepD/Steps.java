package stepD;

import java.io.FileInputStream;
import java.sql.Driver;
import java.util.Properties;

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
		
		FileInputStream file =  new FileInputStream("C:/Users/User/Documents/MyFirstProject/Cucumber/src/Config.properties");
		Properties prop =  new Properties();
		prop.load(file);
		String driverpath= prop.getProperty("driverpath");
		String url = prop.getProperty("url");
		System.setProperty("webdriver.chrome.driver", "drivepath");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("url");
	}
	@When("^User Enter beats solo in the top search inputbox$")
	public void UserEnter_beats_solo_in_the_top_search_inputbox() throws Throwable{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Beats Solo");

	}
	@And("^Click search button$")
	public void Click_search_button() throws Throwable{
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		driver.findElement(By.linkText("Add to List")).click();
	}
}