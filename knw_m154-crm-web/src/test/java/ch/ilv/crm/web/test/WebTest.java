package ch.ilv.crm.web.test;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTest {

	private static final String COLA = "Cola";

	@Test
	public void testCustomerInput() {
		//System.setProperty("webdriver.ie.driver", "C:/dev/IEDriverServer.exe");
        //InternetExplorerOptions options = new InternetExplorerOptions();
        //WebDriver driver=new InternetExplorerDriver(options);
		
        System.setProperty("webdriver.chrome.driver", "C:/Tools/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        
        driver.get("http://localhost:7070/products");
        

		WebElement searchText = driver.findElement(By.name("description"));
		searchText.sendKeys(COLA);
		
		searchText.submit();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		WebElement searchCustomer = driver.findElement(By.name("id"));
		searchCustomer.sendKeys("0");
		searchCustomer.submit();
		
		boolean isCola = driver.getPageSource().contains(COLA);
		
		driver.quit();
		
		Assert.assertTrue(isCola);
	}

}
