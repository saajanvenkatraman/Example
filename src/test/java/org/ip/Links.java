package org.ip;

import java.net.URI;
import java.net.URLConnection;
import java.util.List;

import javax.print.DocFlavor.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.in");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links"+links.size());
		for (WebElement webElement : links) {
		 String amazon = webElement.getAttribute("href");
		 if (amazon!=null) {
			URL url=new URL(amazon);
			
	
			 
			
		}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
