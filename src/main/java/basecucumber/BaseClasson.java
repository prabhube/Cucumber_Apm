package basecucumber;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class BaseClasson {

		public static WebDriver driver;
		static long timeOuts = 30;
		
		public static WebDriver browser(String value) {	
			if(value.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			}else if (value.equalsIgnoreCase("edge")) {
				driver= new EdgeDriver();
			}else if (value.equalsIgnoreCase("gecko")) {
				driver= new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(timeOuts, TimeUnit.SECONDS);
			return driver;
		}
		
		
		//click
		public static void click(WebElement element) {
			element.click();
		}
		
		//inspect and sendkeys and action
		public static void Input(WebElement element,String value) {
			element.sendKeys(value);
		}
		public static void Inputkeys(WebElement element,String value,String key) {
			element.sendKeys(value, key);
		}
		  
		   
		//sleep
		public static void sleep()throws InterruptedException{
			Thread.sleep(2000);
		}
		
		//Switch Windows
		public static void SwitchToWindow(int i) {
			Set<String> windowHandles = driver.getWindowHandles();
			ArrayList<String> list = new ArrayList<String>(windowHandles);
			driver.switchTo().window(list.get(i));
		}
		
		//DropDown
		public static List<WebElement>dropDownOptions(WebElement element) {
			Select s1 = new Select(element);
			List<WebElement>Options = s1.getOptions();
			return Options;
		}
		public static void dropdown(String options,WebElement element, String value) {
			Select s = new Select(element);
			if(options.equalsIgnoreCase("value")) {
				s.selectByValue(value);
			}else if(options.equalsIgnoreCase("text")) {
				s.selectByVisibleText(value);
			}else if(options.equalsIgnoreCase("Index")) {
				int n = Integer.parseInt(value);
				s.selectByIndex(n);
			}
		}
		public static void dropdownDeselet(String options,WebElement element, String value) {
			Select s = new Select(element);
			if(options.equalsIgnoreCase("value")) {
				s.deselectByValue(value);
			}else if(options.equalsIgnoreCase("text")) {
				s.deselectByVisibleText(value);
			}else if(options.equalsIgnoreCase("Index")) {
				int n = Integer.parseInt(value);
				s.deselectByIndex(n);
			}
		}
		public static void geturl(String url) {
			driver.get(url);
		}
		public static String getTitle() {
			System.out.println(driver.getTitle());
			return null;
		}
		public static String getText(WebElement element) { 
		 String text = element.getText();
		 System.out.println(text);
		 return null;
		}
		public static String getCurrentUrl() {
			System.out.println(driver.getCurrentUrl());
		//(or..print statement namma inga access pannikalam)System.out.println(driver.getCurrentUrl());	
			return null;
		}
		public static void quit() {
			driver.quit();
		}
		public static void close() {
			driver.close();
		}
		public static void navigateTo(String url) {
			driver.navigate().to(url);
		}
		public static void navigateForward() {
			driver.navigate().forward();
		}
		public static void navigateBack() {
			driver.navigate().back();
		}
		public static void Refresh() {
			driver.navigate().refresh();
		}
		
		//	Alert and popup
		public static void popup(String options) {
			if(options.equalsIgnoreCase("ok")) {
				driver.switchTo().alert().accept();
			}else if(options.equalsIgnoreCase("cancel")) {
				driver.switchTo().alert().dismiss();			
			}
		}
		public static void sendkeysAlert(String value) {
			driver.switchTo().alert().sendKeys(value);
		}
		public static void frameSwitch(String element) {
			driver.switchTo().frame(element);
		}

		//switchToParenrFrame
		public static void switchToParenrFrame() {
			driver.switchTo().parentFrame();
		}

		//  switchToDefaultPage
		public static void switchToDefaultPage() {
			driver.switchTo().defaultContent();
		}

		//ScreenShort
		public static void capture(String name) throws IOException {
			TakesScreenshot scs=(TakesScreenshot)driver;
			File screenShotAs=scs.getScreenshotAs(OutputType.FILE);
			File destination=new File("D:\\Selenium scs\\"+name+".png");
			org.openqa.selenium.io.FileHandler.copy(screenShotAs, destination);
		}
	// javascript scrollup and scroll down
		//  clickJavaScript
			public static void clickJavaScript(WebElement target) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click()", target);
			}

			// scrollup
			public static void scrollUpJavaScript(WebElement target) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", target);
			}

			// scrolldown
			public static void scrollDownJavaScript(WebElement target) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(false)", target);
			}

		
	}
