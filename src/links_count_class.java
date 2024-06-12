import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links_count_class {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
		WebDriver driver= new ChromeDriver();	
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice");
		WebElement footerDriver=driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		WebElement columnDriver=footerDriver.findElement(By.xpath("//table//tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		
for(int i=1;i<=columnDriver.findElements(By.tagName("a")).size();i++) {
	
	String clickonlink=Keys.chord(Keys.CONTROL,Keys.ENTER);
	columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
	Thread.sleep(3000);
	
	}


Set<String> abc =driver.getWindowHandles();
Iterator <String> it= abc.iterator();

while(it.hasNext()) {

	driver.switchTo().window(it.next());
	System.out.println(driver.getTitle());

}
	}
}
