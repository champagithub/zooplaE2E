package com.zoopla.basepage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Basepage {
	
	public static Properties prop;
	public static WebDriver driver;
	public static Logger logger;
	
	public Basepage() {
		logger = Logger.getLogger("QA Champa Tester");
		PropertyConfigurator.configure("log4j.properties");
		
		try {
			prop = new Properties();
			FileInputStream CP = new FileInputStream(
			System.getProperty("user.dir") + "/src/main/java/com/configPackage/configurate.properties");
			prop.load(CP);
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}}

	
	public static void initializations() {
		//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		String ChampaBrowsers = prop.getProperty("browser");
		if(ChampaBrowsers.equals("chrome")) {
		logger.info("Userb Able to open google chrome");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}else if(ChampaBrowsers.equals("edge")) {
		logger.info("User able to open edge browser");
		System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
		driver = new EdgeDriver();
		
	}
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//System.out.println(prop.getProperty("URL"));
		
	

	
	
	}
	
	

}
