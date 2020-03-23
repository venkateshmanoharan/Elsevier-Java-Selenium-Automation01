package elsevier.javaproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class launchbrowser {
	
	public static WebDriver driver = null;
	
	
	public static void main(String[] args) throws InterruptedException {
	// Page objects
	WebElement category;
	WebElement subcategory;
	WebElement dresses;
	WebElement addtocart;
	WebElement continueshopping;
	WebElement proceedtocheckout;
	

	System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	
	Actions action = new Actions(driver);
	
	
	// Open the web page
	driver.navigate().to("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	String Title = driver.getTitle();
	
	// print the title to the console
	System.out.println("The Title is : ");
	System.out.println(Title);	
	
	// identify the category (Dresses)
	category = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));
	category.click();
	Thread.sleep(1000);
	
	// navigate to and click on subcategory (Summer dress)
	subcategory = driver.findElement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[3]/a"));
	subcategory.click();
	Thread.sleep(1000);
	
	// Hover over the first element
	dresses = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"));
	action.moveToElement(dresses).perform();
	Thread.sleep(1000);
		
	//navigate to the pop-up window
	driver.switchTo().activeElement();
	
	// click on add to cart
	addtocart = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]"));
	addtocart.click();
	Thread.sleep(1000);
	
	//Continue Shopping
	continueshopping = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span"));
	continueshopping.click();
	Thread.sleep(1000);
	
	driver.switchTo().activeElement();
	

	// Hover over the Second element
	dresses = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img"));
	action.moveToElement(dresses).perform();
	Thread.sleep(1000);
		
	//navigate to the pop-up window
	driver.switchTo().activeElement();
	
	// click on add to cart
	addtocart = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1]/span"));
	addtocart.click();
	Thread.sleep(1000);
	
	//Continue Shopping
	continueshopping = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span"));
	continueshopping.click();
	Thread.sleep(1000);
	
	driver.switchTo().activeElement();
	
	// Hover over the Third element
		dresses = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[1]/div/a[1]/img"));
		action.moveToElement(dresses).perform();
		Thread.sleep(1000);
			
		//navigate to the pop-up window
		driver.switchTo().activeElement();
		
		// click on add to cart
		addtocart = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[2]/div[2]/a[1]/span"));
		addtocart.click();
		Thread.sleep(1000);
		
		//Proceed to Checkout
		proceedtocheckout = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
		proceedtocheckout.click();
		Thread.sleep(1000);
		
		// Again click on the proceed to checkout button on this page
		driver.switchTo().activeElement();
		proceedtocheckout = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
		proceedtocheckout.click();
		Thread.sleep(1000);
		
	}

}
