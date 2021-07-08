package com.hrmautomaion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LetsKodePractice {

	public static void main(String[] args) {

/*
		System.setProperty("Webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver Driver new = ChromeDriver();
		String url = "https://courses.letskodeit.com/practice";
			Driver.get (url);*/

			System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			String url = "https://courses.letskodeit.com/practice";
			driver.get(url);
	}

}
