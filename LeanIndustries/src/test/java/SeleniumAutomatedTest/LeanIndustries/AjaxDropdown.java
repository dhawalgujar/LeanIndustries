package SeleniumAutomatedTest.LeanIndustries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjaxDropdown {

	public static WebDriver driver;

	@BeforeTest
	public void loadbrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.primefaces.org/showcase/ui/ajax/dropdown.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testAjaxDropdown() throws Exception {

		Actions action = new Actions(driver);
		WebElement countrydropdown = driver.findElement(By.xpath("//*[@id=\"j_idt712:country_label\"]"));
		countrydropdown.click();

		WebElement country = driver.findElement(By.xpath("//*[@id=\"j_idt712:country_1\"]"));
		action.moveToElement(country).build().perform();
		Thread.sleep(2000);
		country.click();
		Thread.sleep(2000);

		WebElement citydropdown = driver.findElement(By.xpath("//*[@id=\"j_idt712:city_label\"]"));
		citydropdown.click();

		WebElement city = driver.findElement(By.xpath("//*[@id=\"j_idt712:city_1\"]"));
		action.moveToElement(city).build().perform();
		Thread.sleep(2000);
		city.click();

	}

}
