package maiap.pages;
import maiap.tools.BaseTool;

public class LoginPage extends Page{
  public LoginPage(BaseTool tool) {
    super(tool);
  }

  public void fill_credentials(){
    tool.press("org.wordpress.android:id/nux_add_selfhosted_button");
    tool.fill("org.wordpress.android:id/nux_username", "calabash");
    tool.fill("org.wordpress.android:id/nux_password", "password");
    tool.fill("org.wordpress.android:id/nux_url", "ec2-54-82-18-238.compute-1.amazonaws.com/wordpress");
    tool.press("org.wordpress.android:id/nux_sign_in_button");
  }
}
