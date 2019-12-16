import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DEMO2 {

	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		String a=input.nextLine();
		if(a.equals("firefox"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.google.co.in/");
		}
		else
		{
			System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com");
		}
				
	
		
	}


}
