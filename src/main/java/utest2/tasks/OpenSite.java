package utest2.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import utest2.userinterface.UtestWeb;

public class OpenSite implements Task{
    private UtestWeb utestWeb;
    public static OpenSite thePage(){
        return Tasks.instrumented(OpenSite.class);
    };

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(utestWeb));
    }
}
