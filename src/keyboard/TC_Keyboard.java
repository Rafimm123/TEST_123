package keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class TC_Keyboard {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","D:\\Testing\\Testing Softwares\\Softwares\\Drivers\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		driver.findElement(By.className("loginText")).sendKeys("admin");
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		driver.findElement(By.name("Submit")).click();

	}

}
