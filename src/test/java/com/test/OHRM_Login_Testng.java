package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.main.Mydrivers;

//import seleniumpractice.Mydrivers;

public class OHRM_Login_Testng {
	public WebDriver driver;
	
  @BeforeClass()
  public void OpenApp() {
	  
	  Mydrivers.drivers("firefox");
	  driver = new FirefoxDriver();
	  driver.get("http://opensource.demo.orangehrmlive.com");
		System.out.println("first change");
  }
  
  @Test()
  public void LogintoApp() {
	  
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
	  
  }
  
  @Test(dependsOnMethods="LogintoApp")
  public void AddEmployee() throws InterruptedException {
	  
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//a/b[text()='PIM']")).click();
	  driver.findElement(By.linkText("Add Employee")).click();
	  driver.findElement(By.id("firstName")).sendKeys("Pavan");
	  driver.findElement(By.id("lastName")).sendKeys("Sharma");
	  driver.findElement(By.id("employeeId")).clear();
	  driver.findElement(By.id("employeeId")).sendKeys("25292");
	  driver.findElement(By.id("btnSave")).click();
	  	  
  	}
    
  @AfterClass()
  public void CloseApp() {
	  driver.quit();
  }
  }

