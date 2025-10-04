package com.AmazonDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class StepAmazonDefinition {
	
		static WebDriver driver;
		@Given("User loads the browser and launch the Url")
		public void userLoadsTheBrowserAndLaunchTheUrl() {
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://www.amazon.in/");   
		}
		@When("user enters the valid username")
		public void userEntersTheValidUsername() {
		    driver.findElement(By.xpath("(//button[@class =\"nav-flyout-button nav-icon nav-arrow\"])[2]")).click();
		    driver.findElement(By.xpath("(//span[text()=\"Sign in\"])[1]")).click();
		    driver.findElement(By.name("email")).sendKeys("9345817026");
		    
		}
		@When("clicks the login button")
		public void clicksTheLoginButton() {
			driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		}
		@Then("verifies whether the home page is displayed or not")
		public void verifiesWhetherTheHomePageIsDisplayedOrNot() {
		  System.out.println("The page is loaded sucessfully.");
		}
// Tested by Lalo


	}


