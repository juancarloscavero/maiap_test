package maiap.tools;

import io.appium.java_client.AppiumDriver;

public abstract class BaseTool{
  protected AppiumDriver driver;

  public BaseTool(AppiumDriver driver){
    this.driver = driver;
  }

  abstract public void press(String id);  

  abstract public void fill(String id, String text);
}
