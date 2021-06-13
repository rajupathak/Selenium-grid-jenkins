package seleniumpipeline.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestChrome_3 {

	@Test
	public void testChrome() throws MalformedURLException {
		ChromeOptions options = new ChromeOptions();
		/*
		 * options.addArguments("--headless"); options.addArguments("--disable-gpu");
		 */
		options.addArguments("--disable-dev-shm-usage");

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName(BrowserType.CHROME);
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);

		driver.get("http://www.facebook.com");
		System.out.println("Chrome   ===="+ driver.getTitle());
		driver.quit();
	}
}
