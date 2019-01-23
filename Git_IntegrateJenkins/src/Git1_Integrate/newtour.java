package Git1_Integrate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class newtour {
	
WebDriver d;

@Test
public void regtour() {
	System.setProperty("webdriver.gecko.driver", "D:\\Selenium jars\\Selenium jar new\\geckodriver.exe");
	  d = new FirefoxDriver();
	d.get("http://newtours.demoaut.com/");
	d.findElement(By.linkText("REGISTER")).click();
	d.findElement(By.name("email")).sendKeys("test.igs@gmail.com");
	d.findElement(By.name("password")).sendKeys("integra2012");
	d.findElement(By.name("confirmPassword")).sendKeys("integra2012");
	d.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input")).click();
	
}
	
	
}
