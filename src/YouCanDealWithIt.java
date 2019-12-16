import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YouCanDealWithIt {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.youcandealwithit.com/");
		
		WebElement acc=driver.findElement(By.xpath("//*[@id=\"siteNav\"]/li[1]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(acc).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"siteNav\"]/li[1]/ul/li[5]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/ul/li[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/ul/li[3]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("food")).sendKeys("5000");
		Thread.sleep(2000);
		driver.findElement(By.id("clothing")).sendKeys("25000");
		Thread.sleep(2000);
		driver.findElement(By.id("shelter")).sendKeys("10000");
		Thread.sleep(2000);
		driver.findElement(By.id("monthlyPay")).sendKeys("50000");
		Thread.sleep(2000);
		//driver.findElement(By.id("totalMonthlyIncome")).getAttribute("value");
		//Thread.sleep(2000);
		//driver.findElement(By.id("totalMonthlyExpenses")).getAttribute("value");
		//Thread.sleep(4000);
		 String S=driver.findElement(By.id("totalMonthlyIncome")).getAttribute("value");
		 String S1=driver.findElement(By.id("totalMonthlyExpenses")).getAttribute("value");
		 
		 double a=Double.parseDouble(S);
		 double b=Double.parseDouble(S1);
		 
		 if(b>a)
		 {
			 System.out.println("Spend your wisely!");
			 
		 }
		 
		 else
		 {
			 System.out.println("You are a good saver!");
		 }
		
		
		driver.close();
		
	}

}
