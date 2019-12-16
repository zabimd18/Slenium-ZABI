import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("SLK building pics");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class='gNO89b' and @value='Google Search' and @name='btnK']")).click();
		driver.manage().window().maximize();
		Thread.sleep(8000);
		driver.close();
	}
}
