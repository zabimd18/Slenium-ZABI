import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com");
		driver.findElement(By.xpath("//input[@id='srchword' and @class='homesrchbox']")).sendKeys("Parker pen");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value=' ' and @class='newsrchbtn']")).click();

	}

}
