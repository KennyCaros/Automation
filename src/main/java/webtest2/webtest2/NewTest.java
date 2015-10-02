package webtest2.webtest2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
  @Test
  public void f() {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://www.google.ca");
	  driver.findElement(By.id("sb_ifc0")).sendKeys("maven");
	  driver.findElement(By.id("sb_ifc0")).submit();
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
