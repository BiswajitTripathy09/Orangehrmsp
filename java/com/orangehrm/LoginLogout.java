package com.orangehrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginLogout {
	
	public static void main(String[] args)throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://irctc.com");
		Thread.sleep(3000);
		driver.close();
	}
	
	

}
