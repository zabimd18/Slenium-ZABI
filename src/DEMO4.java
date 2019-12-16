import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DEMO4 
{
	
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.mortgagecalculator.org");
		
		driver.findElement(By.xpath("//*[@id=\"homeval\"]"));
		driver.findElement(By.name("param[homevalue]")).sendKeys("250000");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"downpayment\"]")).click();
		driver.findElement(By.id("downpayment")).sendKeys("50000");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"loanamt\"]")).click();
		driver.findElement(By.name("param[principal]")).clear();
		driver.findElement(By.name("param[principal]")).sendKeys("8000");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"intrstsrate\"]")).click();
		driver.findElement(By.id("intrstsrate")).sendKeys("2");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"calc\"]/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[1]/div[1]/div[18]/input")).click();
		String s=driver.findElement(By.xpath("//*[@id=\"calc\"]/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[2]/div/div[1]/div[1]/h3")).getText();
		System.out.println(s+"=Total Monthly Payment");
		
		driver.close();
	}

}
