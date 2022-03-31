import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstselenuimtest {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Shree\\Software\\Crome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
	}

}
