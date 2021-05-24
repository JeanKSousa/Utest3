package utest2.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromTarget;
import org.openqa.selenium.Keys;
import utest2.models.UserData;
import utest2.userinterface.UtestForm;

import java.util.List;

public class FormStep1 implements Task {
    List<UserData> userData;
    public FormStep1(List<UserData> userData) {
        this.userData = userData;
    }
    public static FormStep1 formStep1(List<UserData> userData) {
        return Tasks.instrumented(FormStep1.class,userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestForm.SIGNUP),
                Enter.theValue(userData.get(0).getFirstName()).into(UtestForm.IMPUT_NAME),
                Enter.theValue(userData.get(0).getLastName()).into(UtestForm.IMPUT_LASTNAME),
                Enter.theValue(userData.get(0).getEmail()).into(UtestForm.IMPUT_EMAIL),
                new SelectByVisibleTextFromTarget(UtestForm.SELECT_MONTH, userData.get(0).getMonth()),
                new SelectByVisibleTextFromTarget(UtestForm.SELECT_DAY, userData.get(0).getDay()),
                new SelectByVisibleTextFromTarget(UtestForm.SELECT_YEAR, userData.get(0).getYear()),
                Click.on(UtestForm.LANGUAGE),
                Enter.theValue(userData.get(0).getLanguage()+ Keys.ENTER).into(UtestForm.LANGUAGE),
                Click.on(UtestForm.NEXT)
        );
    }
}

