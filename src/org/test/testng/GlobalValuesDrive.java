package org.test.testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GlobalValuesDrive {
	
static WebDriver d;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohammed Rafic\\Desktop\\Selenium Testing\\ChromeDriver\\chromedriver.exe");
		 d = new ChromeDriver();
Properties a = new Properties();
FileInputStream b = new FileInputStream("C:\\Users\\Mohammed Rafic\\eclipse-workspace\\TestNGTutorial\\src\\data.properties");
a.load(b);
System.out.println(a.getProperty("Hello"));
d.get(a.getProperty("ShettyURL"));


		
	}

}
