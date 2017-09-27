package com.fourstay.pages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.fourstay.utilities.Driver;


	
	public class SearchPage {
		
		public SearchPage(){
			PageFactory.initElements(Driver.getInstance(), this);
		}
		
		@FindBy(id="iLocName")
		public WebElement schoolName;
		
		@FindBy(id="rentoutfrom2")
		public WebElement moveIn;
		
		@FindBy(id="rentoutto2")
		public WebElement moveOut;
		
		@FindBy(css=".input-group.margin-bottom10")
		public WebElement option;
		
		@FindBy(css=".intercom-borderless-dismiss-button")
		public WebElement dismiss;
		
		@FindBy(css="li>a[data-value='3']")
		public WebElement bedNumber;
		
		@FindBy(id="search")
		public WebElement search;
	}


