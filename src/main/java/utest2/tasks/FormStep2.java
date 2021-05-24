package utest2.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import utest2.models.UserData;
import utest2.userinterface.UtestForm;

import java.util.List;

public class FormStep2 implements Task {
    List<UserData> userData;

    public FormStep2(List<UserData> userData) {
        this.userData = userData;
    }
    public static FormStep2 formStep2(List<UserData> userData) {
        return Tasks.instrumented(FormStep2.class, userData);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userData.get(0).getCity()).into(UtestForm.CITY),
                Enter.theValue(userData.get(0).getPostal()).into(UtestForm.POSTAL),
                Click.on(UtestForm.COUNTRY),
                Enter.theValue(userData.get(0).getCountry() + Keys.ENTER).into(UtestForm.INPUT_COUNTRY),
                Click.on(UtestForm.NEXT2)
        );
    }
}
