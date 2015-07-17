package maiap.factories;

import maiap.pageholders.*;
import maiap.pages.*;
import maiap.tools.*;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.URL;

import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

public class AndroidToolFactory{
  // CONSTANTS
  private String URL_PROPERTY = "appium.url";
  private String APP_PROPERTY = "app";

  // Private data
  private static Properties properties = null;

  /**
  **/
  public AndroidToolFactory(Properties properties) {
    this.properties = properties;
  }

  /**
  **/
  public AndroidTool newTool() {
    String url = properties.getProperty(URL_PROPERTY);
    String app = properties.getProperty(APP_PROPERTY);
    URL urlObject = null;
    DesiredCapabilities capabilities = new DesiredCapabilities();
    AndroidDriver driver = null;

    try {
      urlObject = new URL(url);
    } catch (Exception e) {
      //
    }
    this.setCapabilities(capabilities, app);
    driver = new AndroidDriver(urlObject, capabilities);

    return new AndroidTool(driver);
  }

  private void setCapabilities(DesiredCapabilities capabilities, String appName) {
    File classpathRoot = new File(System.getProperty("user.dir"));
      File appDir = new File(classpathRoot, "apps");
      File app = new File(appDir, appName);
      capabilities.setCapability("deviceName", "Android Emulator");
      capabilities.setCapability("app", app.getAbsolutePath());
  }
}