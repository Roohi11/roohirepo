package com.roohi.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class Demo13 {

	public static void main(String[] args) {
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		FluentWait<RemoteWebDriver> wait =new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(5));
		wait.pollingEvery(Duration.ofSeconds(1));
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcdefgh");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.close();
		
		

	}

}
