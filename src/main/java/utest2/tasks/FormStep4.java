package utest2.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import utest2.models.UserData;
import utest2.userinterface.UtestForm;

import java.util.List;

public class FormStep4 implements Task {
    List<UserData> userData;
    public FormStep4(List<UserData> userData) {
        this.userData = userData;
    }
    public static FormStep4 formStep4(List<UserData> userData) {
        return Tasks.instrumented(FormStep4.class, userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userData.get(0).getPassword()).into(UtestForm.IMPUT_PASSWORD),
                Enter.theValue(userData.get(0).getPassword()).into(UtestForm.IMPUT_PASSWORD2),
                Click.on(UtestForm.CHECK_STAY),
                Click.on(UtestForm.CHECK_TERMS),
                Click.on(UtestForm.CHECK_PRIVACY)
        );
    }
}
