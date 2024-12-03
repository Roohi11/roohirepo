package com.roohi.demo;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name:");
		String bn=sc.nextLine();
		
		if(bn.equalsIgnoreCase("chrome"))
		{
			ChromeDriver driver=new ChromeDriver();
		}
		else if(bn.equalsIgnoreCase("firefox"))
		{
			FirefoxDriver driver=new FirefoxDriver();
		}
		else if(bn.equalsIgnoreCase("Edge"))
		{
			EdgeDriver driver =new EdgeDriver();
		}
		else
		{
			System.out.println("Invaid browser name");
		}

	}

}
