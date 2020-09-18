package com.co.despegar.automation.tasks.reserve;

import static com.co.despegar.automation.userinterfaces.DespegarPage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class VerifyNameAndLastname implements Task {

    private String nombre;
    private String apellido;
    private WebDriver hisBrowser;

    public VerifyNameAndLastname(String nombre, String apellido, WebDriver hisBrowser) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.hisBrowser = hisBrowser;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String nombrePage = SPN_NAME_VERIFY.resolveFor(actor).getText();
        String apellidoPage = SPN_LASTNAME_VERIFY.resolveFor(actor).getText();

        Assert.assertEquals("Los datos ingresados:", nombrePage, nombre);

        Assert.assertEquals("Los datos ingresados:", apellidoPage, apellido);
    }

    public static VerifyNameAndLastname verifyNameAndLastname(WebDriver hisBrowser, String nombre, String apellido){
        return Tasks.instrumented(VerifyNameAndLastname.class, hisBrowser,nombre,apellido);
    }
}
