package healenium_Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.epam.healenium.SelfHealingDriver;

public class Check_Healenium_Java {

	public static void main(String[] args) {

		//declare delegate
		  WebDriver delegate = new ChromeDriver();
		  //create Self-healing driver
		  SelfHealingDriver driver = SelfHealingDriver.create(delegate);
		  driver.get("https://elenastepuro.github.io/test_env/index.html");
		  driver.manage().window().maximize();
		  driver.findElement(By.id("change_id")).sendKeys("QA AUTOMATION");
	        driver.findElement(By.className("test_class")).sendKeys("test_class");
	        driver.findElement(By.xpath("//*[@id=\"Submit\"]/span/i")).click();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        driver.findElement(By.id("change_id")).clear();
	        driver.findElement(By.className("test_class")).clear();
	        driver.findElement(By.id("change_id")).sendKeys("Test of Healenium");
	        driver.findElement(By.className("test_class")).sendKeys("test_new_class");
	        driver.close();
	}

}
