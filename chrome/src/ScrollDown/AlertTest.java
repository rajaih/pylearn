package ScrollDown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\SELENIUM\\New folder\\chromedriver\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://www.ksrtc.in/oprs-web/guest/home.do?h=1");
		driver.manage().window().maximize();
		WebElement element =driver.findElement(By.id("searchBtn"));
		element.click();
		Alert message= driver.switchTo().alert();
		System.out.println(message.getText());
		Thread.sleep(3000);
		driver.close();
		

	}

}
