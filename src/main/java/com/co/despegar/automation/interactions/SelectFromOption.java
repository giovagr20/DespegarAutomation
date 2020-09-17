package com.co.despegar.automation.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.targets.Target;

public class SelectFromOption implements Interaction {

    private String strVisibleText;
    private Target idField;

    public SelectFromOption(String strVisibleText, Target idField) {
        this.strVisibleText = strVisibleText;
        this.idField = idField;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SelectFromOptions.byVisibleText(strVisibleText).from(idField));
    }

    public static SelectFromOption list(String strVisibleText, Target idField) {
        return Tasks.instrumented(SelectFromOption.class,strVisibleText, idField);
    }

}
