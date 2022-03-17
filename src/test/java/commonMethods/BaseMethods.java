package commonMethods;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseMethods {
	
	public WebDriver driver;
	
	public void openBrowser() {
       System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	   driver = new ChromeDriver();
	}
	
	public void launchERP() {
	   driver.get("http://orangehrm.qedgetech.com/webapp/login.php");
	   driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	public void loginERP() {
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("master");
		driver.findElement(By.id("btnsubmit")).click();
		
		String pageName = driver.findElement(By.id("ewPageCaption")).getText();
		if(pageName.equals("Dashboard")) {
			System.out.println("Login is success, Testcase is Passed");
		} else {
			System.out.println("Unable to Login, Testcase is Failed");
		}
	}
	
	public void loginwithParam(String uname, String pwd) {
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("btnsubmit")).click();
		
		String pageName = driver.findElement(By.id("ewPageCaption")).getText();
		if(pageName.equals("Dashboard")) {
			System.out.println("Login is success, Testcase is Passed");
		} else {
			System.out.println("Unable to Login, Testcase is Failed");
		}
	}

}
