package maiap.factories;

import maiap.pageholders.*;
import maiap.pages.*;
import maiap.tools.*;

import java.util.Properties;

/**
**/
public class PageHolderFactory{
  // CONSTANTS
  private String DEVICE_PROPERTY = "device";

  // Private data
  private static PageHolder holder = null;
  private static Properties properties = null;

  /**
  **/
  public PageHolderFactory() {
    this.properties = System.getProperties();
  }
  /**
  **/
  public PageHolder newPageHolder(){
    if (this.holder == null){
      BaseTool tool = null;
      String device = null;

      device = properties.getProperty(DEVICE_PROPERTY);

      switch (device){
        case "android"  : tool = new AndroidToolFactory(properties).newTool();
                          break;
        case "ios"      : //tool = new IOSToolFactory(properties).newTool();
                          break;
        default         : tool = new AndroidToolFactory(properties).newTool();
                          break;
      }

      holder = new PageHolder(new Page(tool));
    }

    return holder;
  }
}