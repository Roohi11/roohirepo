package com.roohi.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo12 {

	public static void main(String[] args) throws Exception {
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("Iphone 15",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']")).click();
		Set<String> s=driver.getWindowHandles();
		System.out.println(s);
		List<String> l=new ArrayList<String>(s);
		System.out.println(l);
		driver.switchTo().window(l.get(0));
		Thread.sleep(2000);
		driver.switchTo().window(l.get(1));
		Thread.sleep(2000);
		driver.switchTo().window(l.get(0));
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in/");
		
		
		

	}

}
