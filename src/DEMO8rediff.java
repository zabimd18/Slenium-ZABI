import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DEMO8rediff 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com");
		
		
		driver.findElement(By.xpath("//*[@id=\"signin_info\"]/a[1]")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"login1\"]")).sendKeys("ZZZZ");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("5533");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();
		
		String S=driver.getTitle();
		System.out.println(S);
		
	}
	
}
