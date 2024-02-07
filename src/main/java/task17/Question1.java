package task17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Launch the chrome browser
WebDriver driver = new ChromeDriver();

//Load the URL
driver.get("https://demoblaze.com/index.html#%22");

//Maximize the window
driver.manage().window().maximize();

//implicit wait for 15 seconds
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//Select Laptop
driver.findElement(By.xpath("//a[text()=\"Laptops\"]")).click();

//Select laptop model
driver.findElement(By.xpath("//a[text() = \"Sony vaio i5\"]")).click();

//Add to cart
driver.findElement(By.xpath("//a[text()=\"Add to cart\"]")).click();

//close window	
driver.close();	
		
	}

}
