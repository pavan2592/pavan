package com.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mydrivers {

	
	public static WebDriver drivers(String brname) {
		WebDriver driver=null;
		
		switch(brname.toLowerCase()) {
		
		case "chrome":
			System.setProperty("webdriver.chrome.driver","E:\\Pavan\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();
			 break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "E:\\Pavan\\geckodriver-v0.20.1-win64\\geckodriver.exe");
			//driver=new FirefoxDriver();
			 break;
			 
		default:
			System.out.println("Driver not found");
		
		}
		return driver;
	}
}
