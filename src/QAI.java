import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QAI {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qaiglobalinstitute.com/");
		
		//driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Fossil watch for men");
		WebElement acc=driver.findElement(By.xpath("//*[@id=\"menu-item-14\"]/a/span"));
		WebElement Zab=driver.findElement(By.xpath("//*[@id=\"menu-item-21149\"]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(acc).build().perform();
		act.moveToElement(Zab).build().perform();
		
	}

}