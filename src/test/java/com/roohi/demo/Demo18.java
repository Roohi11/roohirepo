package com.roohi.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo18 {

	public static void main(String[] args) {
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/#sbfbu=1&pi=");
		WebElement e=driver.findElement(By.xpath("//a[text()='Gmail']"));
		String s1=e.getCssValue("text-decoration");
		System.out.println(s1);
		Actions act=new Actions(driver);
		act.moveToElement(e).build().perform();
		String s2=e.getCssValue("text-decoration");
		System.out.println(s2);
		if(s1.equalsIgnoreCase("underline"))
		{
			System.out.println("Gmail is a link");
		}
		else
		{
			System.out.println("Gmail is not a link");
		}
		
		
	

	}

}
