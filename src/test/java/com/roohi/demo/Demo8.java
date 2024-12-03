package com.roohi.demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo8 {

	public static void main(String[] args) {
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String s=driver.getWindowHandle();
		System.out.println(s);

	}

}
