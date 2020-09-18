package com.co.despegar.automation.questions;

import static com.co.despegar.automation.userinterfaces.DespegarPage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ResultNameAndLastname implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(SPN_NAME_VERIFY).viewedBy(actor).asString().isEmpty()
                &&
                Text.of(SPN_LASTNAME_VERIFY).viewedBy(actor).asString().isEmpty();
    }

    public static ResultNameAndLastname resultNameAndLastname(){
        return new ResultNameAndLastname();
    }
}
