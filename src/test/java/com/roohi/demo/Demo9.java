package com.roohi.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo9 {

	public static void main(String[] args) {
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/default.asp");
		driver.findElement(By.xpath("//a[text()='Try it Yourself »']")).click();
		Set<String>s=driver.getWindowHandles();
		System.out.println(s);
		List<String> l =new ArrayList<String>(s);
		System.out.println(l);
		driver.quit();
		
		
		

	}

}
