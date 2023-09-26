package com.stepDefinition;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.testRunner.Test_Runner;

import io.cucumber.java.en.Given;

public class Step_Definition {
	
	WebDriver driver = Test_Runner.driver;
	
	@Given("user launch the application url")
	public void user_launch_the_application_url() {
		driver.get("https://www.amazon.in/");
	}
	@Given("user select the product from the dropdown")
	public void user_select_the_product_from_the_dropdown() {
		String expected = "Music";
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		
		Select s = new Select(dropdown);
		
		List<WebElement> options = s.getOptions();
		
		ListIterator<WebElement> list = options.listIterator();
		
		while (list.hasNext()) {
			WebElement next = list.next();
			String actual = next.getText();
			if (expected.equalsIgnoreCase(actual)) {
				next.click();
				break;
			}
		}
	}
	@Given("user search the relevant product in searchbox")
	public void user_search_the_relevant_product_in_searchbox() throws InterruptedException {
		String search = "cd";
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(search);
		
		Thread.sleep(2000);
		
		List<WebElement> searchOptions = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']"));
		int size = searchOptions.size();
		
		for (int i = 1; i <= size; i++) {
			WebElement eachSuggestion = driver.findElement(By.xpath("//div[@class='autocomplete-results-container']/div["+i+"]"));
			String text = eachSuggestion.getText();
			if (text.equalsIgnoreCase(search)) {
				eachSuggestion.click();
				break;
			}
			
		}
	}

}
