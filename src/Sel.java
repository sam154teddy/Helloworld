import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Sel {

	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\srila\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
//			driver.get("https://www.amazon.com/");
//			List<WebElement>linkText=driver.findElements(By.xpath("//*[@id=\"nav-xshop\"]/a[6]"));
//			int size= linkText.size();
//			String s= linkText.toString();
//			System.out.println(size);
//			System.out.println(s);
//			boolean ischecked= false;
//			for(int i=0; i<size; i++) {
//				ischecked=linkText.get(i).isSelected();
//				System.out.println(ischecked);
//				if(!ischecked) {
//					linkText.get(i).click();
//				}
//			}
//			driver.findElement(By.linkText("Books")).click();
//	    	WebElement Ele=driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[5]"));
//			
//		    Actions action=new Actions(driver);
//		    action.moveToElement(Ele).perform();
//		    Ele.click();
//	        driver.findElement(By.className("bxc-grid-overlay__link")).click();
//	        
//	       
	    driver.get("https://petstore.octoperf.com");
		//System.out.println(driver.getTitle());
		//driver.findElement(By.name("q")).sendKeys("javatpoint tutorials");
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.linkText("Enter the Store")).click();
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.linkText("Register Now!")).click();
		driver.findElement(By.name("username")).sendKeys("Automation2");
    	driver.findElement(By.name("password")).sendKeys("automation@2");
		driver.findElement(By.name("repeatedPassword")).sendKeys("automation@2");
		driver.findElement(By.name("account.firstName")).sendKeys("sai");
		driver.findElement(By.name("account.lastName")).sendKeys("xyz");
		driver.findElement(By.name("account.email")).sendKeys("sai@gmail.com");
		driver.findElement(By.name("account.phone")).sendKeys("1234567890");
		driver.findElement(By.name("account.address1")).sendKeys("6900 pointe Inverness way");
		driver.findElement(By.name("account.address2")).sendKeys("6900 pointe inverness way");
		driver.findElement(By.name("account.city")).sendKeys("Fortwayne");
		driver.findElement(By.name("account.state")).sendKeys("IN");
		driver.findElement(By.name("account.zip")).sendKeys("46804");
		driver.findElement(By.name("account.country")).sendKeys("USA");
		List<WebElement> ELE=driver.findElements(By.name("account.languagePreference"));
		for(int i=0;i<ELE.size();i++) {
			System.out.println(ELE.get(i).getText());
			if(ELE.get(i).getText().equalsIgnoreCase("japanese")) {
				ELE.get(i).click();
			}
			
		}
//		Select language= new Select(driver.findElement(By.name("account.languagePreference")));
//		language.selectByValue("japanese");
//		Select Favouritecatagory =new Select(driver.findElement(By.name("account.favouriteCategoryId")));
//		Favouritecatagory.selectByValue("BIRDS");
//		System.out.println(driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[3]/td[2]/input")).isSelected());
//		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[3]/td[2]/input")).click();
//		System.out.println(driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[3]/td[2]/input")).isSelected());
//		System.out.println(driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[4]/td[2]/input")).isSelected());
//		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[4]/td[2]/input")).click();
//		System.out.println(driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[4]/td[2]/input")).isSelected());
//		driver.findElement(By.name("newAccount")).click();
//		driver.close();
		}
		
	
	
}
