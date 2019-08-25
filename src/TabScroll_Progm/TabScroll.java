package TabScroll_Progm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test

public class TabScroll {
	public static void scroll() throws Exception {
		ChromeDriver driver= new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demos.devexpress.com/ASPxNavigationAndLayoutDemos/TabControl/TabScrolling.aspx");
		Thread.sleep(2000);		
		for(int i=0; i<5;i++) {
			driver.findElement(By.xpath("//div[@id='ContentHolder_ASPxPageControl1_SBL']")).click();
			Thread.sleep(2000);
		}	
		Thread.sleep(2000);
		driver.findElement(By.linkText("SCHEDULING")).click();
		driver.findElement(By.linkText("REPORTING")).click();
		driver.findElement(By.linkText("NAVIGATION & LAYOUT")).click();
		driver.findElement(By.linkText("DATA")).click();
		driver.findElement(By.linkText("COMPONENTS")).click();
		driver.findElement(By.linkText("COMMON CONTROLS")).click();
		}
		
		

}
