package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HWScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver fram= new ChromeDriver();
		fram.get("http://www.leafground.com/pages/frame.html");
		fram.manage().window().maximize();
		fram.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		File source = fram.getScreenshotAs(OutputType.FILE);
		File Destination= new File("./screenshot/shot.png");
		FileUtils.copyFile(source, Destination);
		List<WebElement> elements = fram.findElements(By.tagName("iframe"));
		int size = elements.size();
		System.out.println(size);
	}

}
