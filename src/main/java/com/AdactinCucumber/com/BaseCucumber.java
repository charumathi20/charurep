package com.AdactinCucumber.com;


	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.io.IOException;
	import java.util.List;
	import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

public class BaseCucumber {
		public static WebDriver driver;
	// browserlaunch

		public static WebDriver browserLaunch(String browsername) {
			if(browsername.equalsIgnoreCase("chrome")){
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\valar\\eclipse-workspace\\AdactinCucumber\\driver\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			}else if (browsername.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.geko.driver", "C:\\Users\\valar\\eclipse-workspace\\MavenProject\\driver\\chromedriver_win32\\chromedriver.exe");
				driver=new FirefoxDriver();
				
			}else {
				System.out.println("invalid browser");
			}
			return driver;
			}

		// maximie
		public static void maxWinndow() {
			driver.manage().window().maximize();
		}

	// urllaunch

		public static void urlLaunch(String url) {
			driver.get(url);
		}

//		windows function

		public static void closeWindow() {
			driver.close();
		}

		public void quitWindow() {
			driver.quit();
		}

		public static void Title() {
			String s = driver.getTitle();

			System.out.println("title is:" + s);
		}

		public static void CurrentUrl() {
			String s = driver.getCurrentUrl();
			System.out.println("current url is:" + s);
		}

		public static void PageSource() {
			String s = driver.getPageSource();
			System.out.println("pagesource is:" + s);
		}

		public static void sendKey(WebElement element, String value) {
			element.sendKeys(value);
		}

		// dropdown function
		public static void dropDown(WebElement element, String value, String input) {
			Select s = new Select(element);
			if (value.equals("values")) {

				s.selectByValue(input);
			} else if (value.equals("text")) {
				s.selectByVisibleText(input);
			} else {
				s.selectByIndex(Integer.parseInt(input));
			}
		}

	//navigation  methods
		public static void navigateurl(String url) {
			driver.navigate().to(url);
		}

		public static void navigeteBack() {
			driver.navigate().back();
		}

		public static void navigateForward() {
			driver.navigate().forward();
		}

		public static void navigeteRefresh() {
			driver.navigate().refresh();
		}

	//alert function

		public void alertAcceptDissmis(String value) {
			Alert alert = driver.switchTo().alert();
			if (value.equals("accept")) {
				alert.accept();
			} else {
				alert.dismiss();
			}
		}

		// ScreenShort

		public void screenshort() throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File des = new File("C:\\Users\\valar\\eclipse-workspace\\MavenProject\\screenshot\\img.png");
			FileUtils.copyFile(source, des);
		}

		// Action function
		public static void clickOnElement(WebElement element) {
			element.click();
		}

		public static void rightClick(WebElement element) {
			Actions ac = new Actions(driver);
			ac.contextClick(element).build().perform();
		}

		public static void doubleclick(WebElement element) {
			Actions ac = new Actions(driver);
			ac.doubleClick(element).build().perform();
		}
		public static void clickHoldmoveToElement(WebElement source, WebElement destination) {
			Actions ac = new Actions(driver);
			ac.clickAndHold(source).moveToElement(destination).release(source).build().perform();
		}
		public static void clickAndHold(WebElement source) {
			Actions ac = new Actions(driver);
			ac.clickAndHold(source).build().perform();
		}
		public static void moveToElement(WebElement source, WebElement destination) {
			Actions ac = new Actions(driver);
			ac.moveToElement(destination).release(source).build().perform();
		}
		public static void dragAndDrop(WebElement source, WebElement target) {
			Actions ac = new Actions(driver);
			ac.dragAndDrop(source, target).build().perform();
		}
		// check ismultiple

		public static void checkmultiple(WebElement element) {
			Select s = new Select(element);
			boolean bl = s.isMultiple();
			System.out.println(bl);
		}

		public static void checkElementDisplayed(WebElement element) {
			boolean bl = element.isDisplayed();
			System.out.println(bl);
		}

		public static void checkElementEnabled(WebElement element) {
			boolean bl = element.isEnabled();
			System.out.println(bl);
		}

		public static void checkElementselected(WebElement element) {
			boolean bl = element.isSelected();
			System.out.println(bl);
		}
		// frames

		public static void frames(WebElement element) {
			driver.switchTo().frame(element);
				//driver.switchTo().defaultContent();
			}

		public static void defaultcontent(WebElement element) {
			//driver.switchTo().frame(element);
				driver.switchTo().defaultContent();
			}


		public static void keyPress() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
		}

		public static void keyRelease() throws AWTException {
			Robot r = new Robot();
			r.keyRelease(KeyEvent.VK_ENTER);
		}

		public static void getOptions(WebElement element) {
			Select s = new Select(element);
			List<WebElement> options = s.getOptions();
			for (WebElement webElement : options) {
	       	 System.out.println("get option:"+webElement.getText());
				
			}
		}

		public static void getAllSelectedOptions(WebElement element) {
			Select s = new Select(element);
			List<WebElement> options = s.getAllSelectedOptions();
			for (WebElement webElement1 :options) {
	       	 System.out.println("All selected option:"+webElement1.getText());
				
			}
		}

		public static void getFirstSelectedOptions(WebElement element) {
			Select s = new Select(element);
			//WebElement options = s.getFirstSelectedOption();
			 WebElement firstSelectedOption = s.getFirstSelectedOption();
	         System.out.println("first option"+firstSelectedOption.getText());
		}

		public static void getText(WebElement element) {
			String s = element.getText();
			System.out.println("the text is:" + s);
		}
		public static void windowsHandles() {
			Set<String> winhand = driver.getWindowHandles();
			for (String string : winhand) {
				System.out.println(driver.switchTo().window(string).getTitle());
				
			}

		}
//		scrolup and down
		public static void scrolldown1500() {
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1500)", "");
		}
		public static void scrolldown800() {
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,800)", "");
		}
		public static void scrolldown300() {
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,300)", "");
		}
		public static void scrollUp() {
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,-8000)", "");
		}
		public static void scrollBYVisibleElement(WebElement element) {
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
		
		}
		public static void clear(WebElement element) {
			element.clear();
		}
		//wait
       public static void wait(WebDriver driver)
       
       {
    	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       }

	public static void printScreen() {
		System.out.println("");
		
		
	}
	}


