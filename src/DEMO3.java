import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DEMO3 {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("SLK building pics");
		
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
		Thread.sleep(3000);
		String s=driver.findElement(By.id("resultStats")).getText();
		System.out.println(s);
		
		driver.findElement(By.linkText("Images")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Kgd")).click();
		Thread.sleep(20000);
		
		driver.quit();
		
		
	}

}
