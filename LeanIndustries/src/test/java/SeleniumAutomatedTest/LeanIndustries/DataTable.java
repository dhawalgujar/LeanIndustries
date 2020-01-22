package SeleniumAutomatedTest.LeanIndustries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataTable {

	public static WebDriver driver;

	@BeforeTest
	public void loadbrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.primefaces.org/showcase/ui/data/datatable/selection.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void testSelectRadioButtonInGrid() {

		driver.findElement(By.xpath("//*[@id=\"form:radioDT_data\"]/tr[3]/td[1]/div/div[2]/span")).click();
		;
		driver.findElement(By.xpath("//*[@id=\"form:checkboxDT_data\"]/tr[3]/td[1]/div/div[2]/span")).click();
		;
		driver.findElement(By.xpath("//*[@id=\"form:checkboxDT_data\"]/tr[4]/td[1]/div/div[2]/span")).click();
		;

	}

}
