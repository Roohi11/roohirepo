package com.roohi.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo15 {

	public static void main(String[] args) {
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://semantic-ui.com/");
		List<WebElement> li=driver.findElements(By.xpath("//*"));
		System.out.println("List of Elements: " +li.size());
		int visible=0;
		int hidden=0;
		for(WebElement k:li)
		{
			if(k.isDisplayed())
			{
				visible++;
			}
			else
			{
				hidden++;
			}
		}
		System.out.println("No of visible elements: " +visible);
		System.out.println("No of hidden elements: " +hidden);

	}

}
