package maiap.pages;

import maiap.tools.BaseTool;

public class Page {
  protected BaseTool tool;

  public Page(BaseTool tool){
    this.tool = tool;
  }

  public BaseTool getTool() {
    return this.tool;
  }
}
