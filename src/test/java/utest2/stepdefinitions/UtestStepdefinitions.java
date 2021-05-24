package utest2.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import utest2.models.UserData;
import utest2.questions.Answer;
import utest2.tasks.*;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class UtestStepdefinitions {
    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("^I enter to ustest website$")
    public void iEnterToUstestWebsite() {
        theActorCalled("Jean Sousa").wasAbleTo(OpenSite.thePage());
    }

    @When("^I Type my personale information and complete the setup$")
    public void iTypeMyPersonaleInformationAndCompleteTheSetup(List<UserData> userData) throws Exception{
        theActorInTheSpotlight().attemptsTo(
                FormStep1.formStep1(userData),
                FormStep2.formStep2(userData),
                FormStep3.formStep3(userData),
                FormStep4.formStep4(userData));
    }

    @Then("^I Sig up on the utest\\.$")
    public void iSigUpOnTheUtest(List<UserData> userData)  throws Exception{
        //theActorInTheSpotlight().should(seeThat(Answer.CorfirmTheLastStep(userData)));
    }
}
