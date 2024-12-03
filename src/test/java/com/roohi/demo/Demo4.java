package com.roohi.demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo4 {

	public static void main(String[] args) {
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String s=driver.getCurrentUrl();
		if(s.startsWith("https"))
		{
			System.out.println("website is secured");
		}
		else
		{
			System.out.println("website is not secured");
		}

	}

}
