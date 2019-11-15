package Lunes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AddToCart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\academia\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//Launch application
		driver.get("http://automationpractice.com/index.php");
		
		//Click on Women
		WebElement women = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
		women.click();
		
		//Click on Tops
		WebElement tops = driver.findElement(By.xpath("//*[@id=\"subcategories\"]/ul/li[1]/div[1]/a/img"));
		tops.click();
		
		//Select Size L
		WebElement size = driver.findElement(By.id("layered_id_attribute_group_3"));
		size.click();
		
		//Select Color White
		WebElement color = driver.findElement(By.id("layered_id_attribute_group_8"));
		color.click();
		
		//Sort by Price: Lowest first
		Select sortby = new Select(driver.findElement(By.id("selectProductSort")));
		sortby.selectByVisibleText("Price: Lowest first");
		
		//Search "blouses"
		WebElement search = driver.findElement(By.id("search_query_top"));
		search.sendKeys("blouses");
		WebElement clickSearch = driver.findElement(By.name("submit_search"));
		clickSearch.click();
		
		//Verify Search
		WebElement verifySearch = driver.findElement(By.xpath("//*[text()='$27.00']"));
		
		//Close
		driver.close();
		System.out.println("Exercise successful");
		
	
	
		

	}

}
