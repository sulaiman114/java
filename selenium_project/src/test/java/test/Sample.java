package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver;
driver = new ChromeDriver();
driver.get("https://demo.automationtesting.in/Register.html");
Select dropdownyear = new Select(driver.findElement(By.xpath("//select[@id='yearbox']")));

dropdownyear.selectByValue("1920");
	}

}
