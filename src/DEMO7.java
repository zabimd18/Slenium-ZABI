import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DEMO7 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		//driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[3]/div/span")).sendKeys(Keys.TAB);
		//Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("SLK building pics");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[3]/div/span")).sendKeys(Keys.TAB);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[3]/div/span")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/div[2]/center/input[1]")).sendKeys(Keys.ENTER);
		//Thread.sleep(3000);
	}

}
