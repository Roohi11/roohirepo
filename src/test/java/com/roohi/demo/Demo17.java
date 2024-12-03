package com.roohi.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo17 {

	public static void main(String[] args) {
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement e=driver.findElement(By.xpath("//img[@alt='Mobiles']"));
		String x=e.getAttribute("src");
		System.out.println(x);
		String y=e.getCssValue("transition");
		System.out.println(y);

	}

}
