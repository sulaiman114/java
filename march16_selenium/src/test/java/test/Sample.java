package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver;
driver = new ChromeDriver();
driver.get("https://demo.automationtesting.in/Register.html");
driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("hello");
	}

}
