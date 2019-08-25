package TabScroll_Progm;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

@Test

public class Tabs extends MainClass {
	public static void tab() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.linkText("SCHEDULING")).click();
		driver.findElement(By.linkText("REPORTING")).click();
		driver.findElement(By.linkText("NAVIGATION & LAYOUT")).click();
		driver.findElement(By.linkText("DATA")).click();
		driver.findElement(By.linkText("COMPONENTS")).click();
		driver.findElement(By.linkText("COMMON CONTROLS")).click();
		}
	
	
}
