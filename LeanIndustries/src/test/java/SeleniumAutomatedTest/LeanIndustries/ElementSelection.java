package SeleniumAutomatedTest.LeanIndustries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementSelection {

	public static WebDriver driver;

	@BeforeTest
	public void loadbrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.primefaces.org/poseidon/forms.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test(priority = 1)
	public void testInputText() {

		driver.findElement(By.id("j_idt70")).sendKeys("Dhawal Gujar");
		driver.findElement(By.id("j_idt71")).sendKeys("dhawalgujar@gmail.com");
		driver.findElement(By.id("j_idt72")).sendKeys("6478572290");

	}

	@Test(priority = 2)

	public void testCheckboxes() {

		WebElement Checkbox = driver.findElement(By.xpath("//div[@id='j_idt104']//div[2]//div[1]//div[2]//span[1]"));

		if (!Checkbox.isSelected()) {
			Checkbox.click();
		} else {
			System.out.println("Checkbox is already selected.");
		}
	}

	@Test(priority = 3)
	public void testRadioButtons() {

		WebElement RadioButton = driver.findElement(By.xpath("//div[@id='j_idt109']//div[3]//div[1]//div[2]//span[1]"));

		if (!RadioButton.isSelected()) {
			RadioButton.click();
		} else {
			System.out.println("RadioButton is already selected.");
		}
	}

	@Test(priority = 4)
	public void testSelectOneMenu() throws Exception {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('console_input').setAttribute('aria-hidden','false')");

		WebElement xbox = driver.findElement(By.xpath("//*[@id=\"console_1\"]"));
		Actions action = new Actions(driver);
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"console_label\"]"));
		dropdown.click();

		action.moveToElement(xbox).build().perform();
		Thread.sleep(5000);
		xbox.click();
	}

	@Test(priority = 5)
	public void testEnterDate() {

		driver.findElement(By.id("popup_input")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[5]/a")).click();
	}

}
