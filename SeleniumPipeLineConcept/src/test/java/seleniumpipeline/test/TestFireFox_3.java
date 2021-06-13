package seleniumpipeline.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestFireFox_3 {

	@Test
	public void testFireFox() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName(BrowserType.FIREFOX);

		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);

		driver.get("https://www.myntra.com/");
		System.out.println("firefox   ====" +driver.getTitle());
		driver.quit();

}
}