package com.roohi.demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo3 {

	public static void main(String[] args) {
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String s1=driver.getCurrentUrl();
		System.out.println("Current URL name :" + s1);
		String s2=driver.getTitle();
		System.out.println("Title of the page:" + s2);

	}

}
