package step_definition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_shop {
	static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.asianpaints.com/");
		driver.findElement(By.xpath("//*[@data-target='#SHOP']")).click();
		takeScreenshot("Asianpaints_shop");

		
		//driver.findElement(By.xpath("//*[@title='ap-shop-wall-stickers-thumbnail-asian-paints']")).click();
		//JavascriptExecutor jse= (JavascriptExecutor)driver;
		//jse.executeScript("window,scrollBy(0,1000);");
		//Thread.sleep(5000);
		//takeScreenshot("Asianpaints_wallstickers");
		

	}
	
	public static void takeScreenshot(String fileName) throws IOException {
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Java_training\\com.asianpaint_shop1\\src\\test\\java\\screenshot/"+fileName+".jpg"));
	}

}
