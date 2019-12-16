import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DEMO5 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("SLK building pics");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
		String search="SLK building pics";
		
		String nextpage=driver.findElement(By.name("q")).getAttribute("value");
		if(search.equals(nextpage))
		{
			System.out.println("Pass");
		}
		
		else
		{
			System.out.println("Fail");
		}
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}

}
