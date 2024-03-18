package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SampleA {

	public static void main(String[] args) {
		WebDriver driver; 
		driver = new ChromeDriver();
	
		driver.get("https://demo.automationtesting.in/Register.html");
		//driver.navigate().forward();
		
		//Select dropDownSkill= new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
		//dropDownSkill.selectByIndex(6);
		driver.manage().window().minimize();	
		
	}
	

}
