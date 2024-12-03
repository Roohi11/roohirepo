package com.roohi.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo11 {

	public static void main(String[] args) throws Exception {
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_input_attributes_value");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.id("fname")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("lname")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("fname")).sendKeys("Abbas");
		Thread.sleep(2000);
		driver.findElement(By.id("lname")).sendKeys("Mirza");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
