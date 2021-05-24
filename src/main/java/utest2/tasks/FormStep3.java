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

public class FormStep3 implements Task {
    List<UserData> userData;
    public FormStep3(List<UserData> userData) {
        this.userData = userData;
    }

    public static FormStep3 formStep3(List<UserData> userData) {
        return Tasks.instrumented(FormStep3.class, userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestForm.COMPUTER),
                Enter.theValue(userData.get(0).getComputer()+ Keys.ENTER).into(UtestForm.INPUT_COMPUTER),
                Click.on(UtestForm.VERSION),
                Enter.theValue(userData.get(0).getVersion()+ Keys.ENTER).into(UtestForm.INPUT_VERSION),
                Click.on(UtestForm.LANGUAGE_DEVICE),
                Enter.theValue(userData.get(0).getLanguage()+ Keys.ENTER).into(UtestForm.INPUT_LANGUAGE_DEVICE),
                Click.on(UtestForm.MOBIL),
                Enter.theValue(userData.get(0).getMobil() + Keys.ENTER).into(UtestForm.INPUT_MOBIL),
                Click.on(UtestForm.MODEL),
                Enter.theValue(userData.get(0).getModel()+ Keys.ENTER).into(UtestForm.INPUT_MODEL),
                Click.on(UtestForm.SYSTEM),
                Enter.theValue(userData.get(0).getSystem()+ Keys.ENTER).into(UtestForm.INPUT_SYSTEM),
                Click.on(UtestForm.NEXT3)
        );
    }
}
