package steps;

import io.cucumber.java.en.Given;
import support.base.AutomationBase;
import support.pages.LoginPage;
import support.utils.AppLauncher;

/**
 * @author Muhammad Tafseer Haider
 */
public class HomeSteps extends AutomationBase {
    AppLauncher applauncher = new AppLauncher(getDriver());
    LoginPage loginPage = new LoginPage(getDriver());


    @Given("I am at the login page of the Para Bank Home Page {} {}")
    public void navigateToParabankHomePage(String scenario, String file)
    {
        System.out.format("Thread ID - %2d - %s from %s feature file.\n",
                Thread.currentThread().getId(), scenario,file);
        applauncher.navigateToParaBankApplication();
    }

//    @Given("I am at the login page of the Para Bank Home Page Again")
//    public void navigateToParabankHomePageAgain()
//    {
//        applauncher.navigateToParaBankApplication();
//    }
}
