package Steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.lang.reflect.Type;
import java.util.List;

public class MyStepdefs {
    @Given("^i navigate to login page$")
    public void iNavigateToLoginPage() {
        System.out.println("method1");

    }
    @And("Pass credentials username as {string} and password as {string}")
    public void passCredentialsUsernameAsAndPasswordAs(String arg0, String arg1) {
        System.out.println("username :  " + arg0 + "  Password :  " + arg1);
    }

    @And("^Click on Login$")
    public void clickOnLogin() {
    }

    @Then("^It should navigate to Userform page$")
    public void itShouldNavigateToUserformPage() {
    }


    @And("i enter following details")
    public void iEnterFollowingDetails(DataTable table) {
        //List<List<String>> data = table.transpose().asList(String.class)
       // List<String> list = table.asList(String.class);
        List<List<String>> userDataList=table.asLists(String.class);
        for(List<String> e:userDataList) {
            System.out.println(e);
        }
    }

    @And("i enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String arg0, String arg1) {
        System.out.println("newusername :  " + arg0 + "  newPassword :  " + arg1);
    }
}
