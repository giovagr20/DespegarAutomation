package com.co.despegar.automation.tasks.reserve;

import static com.co.despegar.automation.userinterfaces.DespegarPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import com.co.despegar.automation.interactions.ClickOn;
import com.co.despegar.automation.interactions.EnterInformation;
import com.co.despegar.automation.interactions.SelectFromOption;
import com.co.despegar.automation.model.PersonalInformationModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class ReserveFlight implements Task {

    private String banco;
    private String nombre;
    private String apellido;
    private String numeroDocumento;
    private String estado;
    private String ciudad;
    private String direccion;
    private WebDriver hisBrowser;

    public ReserveFlight(String banco, String nombre, String apellido, String numeroDocumento, String estado, String ciudad, String direccion, WebDriver hisBrowser) {
        this.banco = banco;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumento = numeroDocumento;
        this.estado = estado;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.hisBrowser = hisBrowser;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(RB_PSE).andAlignToTop(),
                ClickOn.element(RB_PSE),
                WaitUntil.the(LST_BANK, isVisible()),
                SelectFromOption.list(banco, LST_BANK),
                EnterInformation.textField(nombre, TXT_NAME),
                EnterInformation.textField(apellido, TXT_LASTNAME),
                EnterInformation.textField(numeroDocumento, TXT_NUMBERID),
                SelectFromOption.list(estado, LST_STATE),
                EnterInformation.textField(ciudad, TXT_CITY),
                EnterInformation.textField(direccion, TXT_ADDRESS));
    }

    public static ReserveFlight reserveFlight(
             String banco,
             String nombre,
             String apellido,
             String numeroDocumento,
             String estado,
             String ciudad,
             String direccion,
             WebDriver hisBrowser){
        return Tasks.instrumented(ReserveFlight.class, banco,nombre,apellido,numeroDocumento,estado,ciudad,direccion,hisBrowser);
    }
}
