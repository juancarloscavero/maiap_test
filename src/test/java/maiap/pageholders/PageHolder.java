package maiap.pageholders;

import maiap.pages.*;
import maiap.tools.*;

import java.lang.reflect.*;

public class PageHolder {
  public Page page;

  public PageHolder (Page page){
    this.page = page;
  }

  public <T extends Page> void navigate(Class<T> destinationClass) {
    try {
      this.page = destinationClass.getConstructor(BaseTool.class).newInstance(this.page.getTool());
    } catch (Exception e) {
      throw new RuntimeException("Wrong destination page.", e);
    }
  }
}
