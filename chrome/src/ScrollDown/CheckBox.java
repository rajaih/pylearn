package ScrollDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\SELENIUM\\New folder\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.ksrtc.in/oprs-web/guest/home.do?h=1");
		driver.manage().window().maximize();
		String checkbox = "singleLady";
		
		{
			WebElement element=driver.findElement(By.id(checkbox));
			System.out.println(element.isDisplayed());
			System.out.println(element.isEnabled());
			System.out.println(element.getTagName());
			System.out.println(element.getAttribute("name"));
			System.out.println(element.getSize());
			System.out.println(element.getLocation());
			for (int i =1;i<=2;i++) {
				element.click();
				System.out.println("CheckBox"+element.getAttribute("name:"+element.isSelected()));
				
			}
			Thread.sleep(5000);
		}
        driver.close();
	}



	}


