import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srila\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		List<WebElement>columns1=driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
		System.out.println(columns1.size());
		List<WebElement>rows1=driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
						System.out.println(rows1.size());

						
						
		for(int r=1;r<=rows1.size();r++) {				
		for(int c=1;c<=columns1.size();c++) {
		WebElement s=driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr["+r+"]/td["+c+"]"));
	System.out.print(s.getText()+ "  ");
		}
		System.out.println();
		}
	}
	

}
