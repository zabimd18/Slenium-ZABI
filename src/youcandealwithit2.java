import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class youcandealwithit2 {

	public static void main(String[] args) throws Exception 
	{
		String vfood[]= {"100","200","400"};
		String vclothing[]= {"100","200","50"};
		String vshelter[]= {"50","200","50"};
		String vMP[]= {"500","400","500"};
		
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
		
		
		
		/*for(int i=0;i<3;i++)
		{
			System.out.println(vfood[i]);
		}
		
		for(int j=0;j<3;j++)
		{
			System.out.println(vclothing[j]);
		}
		
		for(int k=0;k<3;k++)
		{
			System.out.println(vshelter[k]);
		}
		
		for(int l=0;l<3;l++)
		{
			System.out.println(vMP[l]);
		}*/
		for(int i=0;i<3;i++)
		{
			
		
		
		driver.findElement(By.id("food")).sendKeys(vfood[i]);
		Thread.sleep(2000);
		driver.findElement(By.id("clothing")).sendKeys(vclothing[i]);
		Thread.sleep(2000);
		driver.findElement(By.id("shelter")).sendKeys(vshelter[i]);
		Thread.sleep(2000);
		driver.findElement(By.id("monthlyPay")).sendKeys(vMP[i]);
		Thread.sleep(2000);
		

		 TakesScreenshot TakesScreenshot = (TakesScreenshot)driver;
		 File source= TakesScreenshot.getScreenshotAs(OutputType.FILE);
		 Files.copy(source, new File("D:\\Screenshot.png"));
		 
		//driver.findElement(By.id("totalMonthlyIncome")).getAttribute("value");
		//Thread.sleep(2000);
		//driver.findElement(By.id("totalMonthlyExpenses")).getAttribute("value");
		//Thread.sleep(4000);
		 String S=driver.findElement(By.id("totalMonthlyIncome")).getAttribute("value");
		 String S1=driver.findElement(By.id("totalMonthlyExpenses")).getAttribute("value");
		
		 driver.findElement(By.id("food")).clear();
		 driver.findElement(By.id("clothing")).clear();
		 driver.findElement(By.id("shelter")).clear();
		 driver.findElement(By.id("monthlyPay")).clear();
		
		 double a=Double.parseDouble(S);
		 double b=Double.parseDouble(S1);
		 
		 if(b>a)
		 {
			 System.out.println("Spend your wisely!");
			 TakesScreenshot TakesScreenshot1 = (TakesScreenshot)driver;
			 File source1= TakesScreenshot1.getScreenshotAs(OutputType.FILE);
			 Files.copy(source1, new File("D:\\Screenshot"+i+".png"));
			 
		 }
		 else if(b<a)
		 {
			 System.out.println("You are a good saver!");
			 TakesScreenshot TakesScreenshot1 = (TakesScreenshot)driver;
			 File source1= TakesScreenshot1.getScreenshotAs(OutputType.FILE);
			 Files.copy(source1, new File("D:\\Screenshot\"+i+\".png"));
		 }
		 
		 else
		 {
			 System.out.println("You are neither good nor bad");
			 TakesScreenshot TakesScreenshot1 = (TakesScreenshot)driver;
			 File source1= TakesScreenshot1.getScreenshotAs(OutputType.FILE);
			 Files.copy(source1, new File("D:\\Screenshot\"+i+\".png"));
		 }
		
		 
		 
		 
		 
		}
		driver.close();
		
	}

}
