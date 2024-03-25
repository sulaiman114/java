package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleA {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame("singleframe");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
		
		
		

	}

}
