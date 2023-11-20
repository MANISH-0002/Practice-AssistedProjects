package com.app.TestNGScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTest {

	@Test
	public void wikiPage() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%25253ASign+up");
		driver.close();
		
	}
	@Test	
public void wikiPage2() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%25253ASign+up");
		driver.close();
		
	}
	@Test
public void ninjapage() {
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://tutorialsninja.com/demo/");
	driver.close();
	
}
	@Test
public void ninjapage2() {
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://tutorialsninja.com/demo/");
	driver.close();
}
	
}
