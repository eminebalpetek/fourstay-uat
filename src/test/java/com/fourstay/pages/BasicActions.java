package com.fourstay.pages;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicActions {

	WebDriver driver;
	String url;
	@Before
	public void setUp() throws Exception {
		driver=new ChromeDriver();
		url="http://letskodeit.teachable.com/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Test
	public void test() {
		driver.get(url);
	}
	
	@After
	public void tearDown() throws Exception {
	}

}
