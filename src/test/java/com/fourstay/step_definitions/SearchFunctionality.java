package com.fourstay.step_definitions;

	import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.fourstay.pages.SearchPage;
import com.fourstay.utilities.ConfigurationReader;
import com.fourstay.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


	public class SearchFunctionality {
		
		SearchPage searchPage=new SearchPage();
		
		private static WebDriver driver;
		@Given("^The user on the fourstay homepage$")
		public void the_user_on_the_fourstay_homepage() throws Throwable {
		    driver=Driver.getInstance();
		    driver.get(ConfigurationReader.getProperty("url"));
		    
		}

		@When("^The user types the school name$")
		public void the_user_types_the_school_name() throws Throwable {
		    searchPage.schoolName.sendKeys("20151");
		    
		}

		@When("^The user enters move in date$")
		public void the_user_enters_move_in_date() throws Throwable {
		  searchPage.moveIn.sendKeys(ConfigurationReader.getProperty("moveindate"));
		 
		}

		@When("^The user enters move out date$")
		public void the_user_enters_move_out_date() throws Throwable {
		  searchPage.moveOut.sendKeys(ConfigurationReader.getProperty("moveoutdate"));
		   
		}

		@When("^The user select bed number$")
		public void the_user_select_bed_number() throws Throwable {
			searchPage.option.click();
			WebDriverWait wait=new WebDriverWait(driver, 60);
			
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".intercom-launcher-frame"))));
			driver.switchTo().frame(4);
			
			Actions actions=new Actions(driver);
			actions.moveToElement(driver.findElement(By.cssSelector("div.intercom-chat-card-author"))).perform();
			Thread.sleep(2000);
			
			searchPage.dismiss.click();
		    searchPage.bedNumber.click();
		}

		@When("^The user click search button$")
		public void the_user_click_search_button() throws Throwable {
		   searchPage.search.click();
		    
		}

		@Then("^The user verify the search url$")
		public void the_user_verify_the_search_url() throws Throwable {
			String currentUrl=driver.getCurrentUrl();
			for (String windowHandle : driver.getWindowHandles()) {
	            driver.switchTo().window(windowHandle);
	            if(currentUrl.equals(ConfigurationReader.getProperty("url"))){
	                break;
	            }
			

			}
		}

	}


