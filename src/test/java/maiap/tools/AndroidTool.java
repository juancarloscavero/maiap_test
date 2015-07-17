package maiap.tools;

import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AndroidTool extends BaseTool{
  // CONSTANTS.
  private static long TIME_TO_WAIT = 2;

  public AndroidTool(AndroidDriver driver){
    super(driver);
  }

  public void press(String id){
    WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
    WebElement el = driver.findElement(By.id(id));
    el.click();
  }

  public void fill(String id, String text){
    WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
    WebElement el = driver.findElement(By.id(id));
    el.sendKeys(text);
  }
}
