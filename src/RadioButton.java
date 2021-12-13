import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver","C:\\Users\\srila\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.amazon.com/");
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     
     
	}

}
