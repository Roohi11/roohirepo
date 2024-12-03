package com.roohi.demo;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo16 {

	public static void main(String[] args) throws Exception {
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		List<WebElement> lio=driver.findElements(By.xpath("//*"));
		System.out.println("List of web elements: " +lio.size());
		int alllinks=0;
		int correctlinks=0;
		int brokenlinks=0;
		for(WebElement e:lio)
		{
			try {
				if(e.getAttribute("href")!=null)
				{
					String x=e.getAttribute("href");
					if(x.startsWith("http")||x.startsWith("https"))
					{
						alllinks++;
						URL u=new URL(x);
						HttpURLConnection con=(HttpURLConnection)u.openConnection();
						con.connect();
						if(con.getResponseCode()==200)
						{
							correctlinks++;
						}
						else
						{
							brokenlinks++;
							System.out.println(x+ "is broken link due to" +con.getResponseMessage());
						}
					}
				}
					
			}
			catch(StaleElementReferenceException ex)
			{
				
			}
			
		}
		System.out.println("Total count of  links" +alllinks);
		System.out.println("Total count of correct links" +correctlinks);
		System.out.println("Total count of broken links" +brokenlinks);
		
		
		

	}

}
