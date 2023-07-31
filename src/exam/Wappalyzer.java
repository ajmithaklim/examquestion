package exam;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Wappalyzer {
		ChromeDriver driver = new ChromeDriver();
		@Before
		public void setup() {
			driver.get("https://www.wappalyzer.com");
		}
		@Test
		public void testing()
		{
			driver.findElement(By.xpath("//*[@id=\'app\']/div/main/div/div[1]/header/div/div/div/div[2]/button[2]/span"));
			driver.findElement(By.xpath("//*[@id=\'list-item-50\']/div/div[1]"));
			driver.findElement(By.xpath("//*[@id='app']/div/main/div/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/a/div/div/div[2]/span"));
			driver.findElement(By.xpath("//*[@id='app']/div[1]/main/div/div[2]/div[1]/div[2]/div/div[3]/div/div/a/span"));
			driver.findElement(By.xpath("//*[@id='app']/div/main/div/div[2]/div/div[2]/div/form/div[1]/div[1]/div[1]/div/div[1]/button/span"));
		}
		}

}
