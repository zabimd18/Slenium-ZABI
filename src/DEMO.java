import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DEMO {

	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		String s=driver.getTitle();
		System.out.println(s);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/footer/ul/li[1]/a")).click();
		
		Set<String>	id=driver.getWindowHandles();
		Iterator<String> it=id.iterator();
		String parentID=it.next();
		String childID=it.next();
		
		driver.switchTo().window(childID);
		System.out.println(driver.getTitle());
		
	}

}
