package com.autodesktry;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;

public class autodesktesting {
	
	
	WindowsDriver<WindowsElement> driver;
	
	
	@BeforeTest
	public void setup() {
		
		DesiredCapabilities dcaps = new DesiredCapabilities();
		
		dcaps.setCapability("platformName", "windows");
		dcaps.setCapability("app", "C:\\Windows\\System32\\notepad.exe");
		dcaps.setCapability("deviceName", "DT-QE-AVDEBULUSAN");
		
		
		try {
			driver = new WindowsDriver<WindowsElement>(new URL("http://127.0.0.1:4723"),dcaps);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
  @Test
  public void execute() {
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  
	  
	  driver.findElement(By.name("Text Editor")).sendKeys("Lorem ipsum dolor sit amet");
	  
	  
	  
	  driver.findElement(By.name("Format")).click();
	  
	  
  }
}
