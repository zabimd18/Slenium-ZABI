import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class REDIFF_CheckBox
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com");
		driver.findElement(By.className("signin")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[1]/div/form/div/div[7]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]")).click();
		Thread.sleep(2000);
		Select select=new Select(driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]")));
		//driver.findElement(By.name("chk_altemail92eea6f01")).click();
		select.selectByVisibleText("NOV");
		Thread.sleep(2000);
	}

}
