package com.roohi.demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo5 {

	public static void main(String[] args) {
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://web.simmons.edu/~grovesd/comm244/notes/week2/links");
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
