package seleniumpipeline.test;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SetUpDockerGrid {

	@BeforeTest
	public void startDockerGrid() throws IOException, InterruptedException {
		Runtime.getRuntime().exec("cmd /c start start_dockerGrid.bat");
		Thread.sleep(15000);
	}

	@AfterTest
	public void stopDockerGrid() throws IOException, InterruptedException {
		Runtime.getRuntime().exec("cmd /c start stop_dockerGrid.bat");
		Thread.sleep(5000);

		Runtime.getRuntime().exec("taskkill /f /im cmd.exe");//closes all the cmd process
	}

}
