package maiap;

import cucumber.api.java.en.Given;

import maiap.pages.*;
import maiap.pageholders.PageHolder;
import maiap.factories.PageHolderFactory;

public class Steps{
  private PageHolder holder;

  public Steps(){
    this.holder = new PageHolderFactory().newPageHolder();
  }

@Given("^I am at login page\\.$")
    public void i_am_at_login_page() throws Throwable{
      holder.navigate(LoginPage.class);
    }

  @Given("^I enter valid credentials for self-hosted site\\.$")
    public void i_enter_valid_credentials_for_self_hosted_site() throws Throwable{
      ((LoginPage)holder.page).fill_credentials();
    }

  @Given("^I can see posts for the self-hosted site\\.$")
    public void i_can_see_posts_for_the_self_hosted_site() throws Throwable{
//
}
}
