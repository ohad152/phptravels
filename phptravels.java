package com.qa.pages;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class phptravels {

	public static void main(String[] args) throws InterruptedException, IOException  {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MyName\\selenium-workspace\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		String jsSyyle = "'3px solid red'";
		WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstname.sendKeys("nehama");		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border=" + jsSyyle, firstname);
		
		
		
		
		WebElement lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastname.sendKeys("zalkidner");	
		js.executeScript("arguments[0].style.border=" + jsSyyle, lastname);

		
		
		WebElement BusinessName = driver.findElement(By.xpath("//input[@placeholder='Business Name']"));
		BusinessName.sendKeys("NZ");	
		js.executeScript("arguments[0].style.border=" + jsSyyle, BusinessName);
		
		
		WebElement Email = driver.findElement(By.xpath("//input[@placeholder='Email']"));
		Email.sendKeys("nehama@gmail.com");	
		js.executeScript("arguments[0].style.border=" + jsSyyle, BusinessName);
		
		
		String Number1 = driver.findElement(By.xpath("//span[@id='numb1']")).getText();
		Integer intValue = Integer.parseInt(Number1);
		String Number2 = driver.findElement(By.xpath("//span[@id='numb2']")).getText();
		Integer intValue2 = Integer.parseInt(Number2);
		System.out.println(intValue2+intValue);
		WebElement Result = driver.findElement(By.xpath("//input[@id='number']"));
		Result.sendKeys((String.valueOf(intValue2+intValue)));	
		
		Thread.sleep(300);
		WebElement Submit = driver.findElement(By.xpath("//button[@id='demo']"));
		Submit.click();
		
		Thread.sleep(5000);

		driver.close();
		
		
		driver.quit();
		
		
		
		


		
	} 

}
