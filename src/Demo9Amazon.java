import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo9Amazon {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Fossil watch for men");
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		
		//driver.findElement(By.xpath("//*[contains(text(),'a-section a-spacing-medium')]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/span[4]/div[1]/div[2]/div/span/div/div/div[2]/div[3]/div/div[1]/h2/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/form/div/div/div[1]/span/span/a")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/div/div/div/div[2]/div[5]/div/form/span/span/span/input")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div/div/div[4]/div/div/div/span[2]/span/a")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/div[2]/div/div/div/span[2]/span/button")).click();
	
		driver.navigate().to("https://www.amazon.com");
		Thread.sleep(4000);
	
		WebElement acc=driver.findElement(By.id("nav-link-accountList"));
		
		Actions act=new Actions(driver);
		act.moveToElement(acc).build().perform();
	}

}
