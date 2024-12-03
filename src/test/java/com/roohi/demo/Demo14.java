package com.roohi.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo14 {

	public static void main(String[] args) {
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		List<WebElement> l=driver.findElements(By.tagName("div"));
		System.out.println("List of div tages: " +l.size());
		

	}

}
