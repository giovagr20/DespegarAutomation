package com.co.despegar.automation.tasks.reserve;

import static com.co.despegar.automation.userinterfaces.DespegarPage.*;

import com.co.despegar.automation.interactions.ClickOn;
import com.co.despegar.automation.interactions.EnterInformation;
import com.co.despegar.automation.interactions.SelectFromOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.WebDriver;

public class WhoTravel implements Task {

    private String nombres;
    private String apellidos;
    private String pais;
    private String numeroDocumento;
    private String dia;
    private String mes;
    private String ano;
    private WebDriver hisBrowser;

    public WhoTravel(String nombres, String apellidos, String pais, String numeroDocumento, String dia, String mes, String ano, WebDriver hisBrowser) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.pais = pais;
        this.numeroDocumento = numeroDocumento;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hisBrowser = hisBrowser;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(TXT_NAME_TRAVEL).andAlignToTop(),
                EnterInformation.textField(nombres, TXT_NAME_TRAVEL),
                EnterInformation.textField(apellidos, TXT_LASTNAME_TRAVEL),
                SelectFromOption.list(pais, LST_COUNTRY_TRAVEL),
                EnterInformation.textField(numeroDocumento, TXT_NUMBERID_TRAVEL),
                SelectFromOption.list(dia, LST_DAY_BIRTH),
                SelectFromOption.list(mes, LST_MONTH_BIRTH),
                SelectFromOption.list(ano, LST_YEAR_BIRTH),
                ClickOn.element(RB_GENDER));
    }

    public static  WhoTravel whoTravel(
            String nombres,
            String apellidos,
            String pais,
            String numeroDocumento,
            String dia,
            String mes,
            String ano,
            WebDriver hisBrowser
    )
    {
        return Tasks.instrumented(WhoTravel.class, nombres,apellidos,pais,numeroDocumento,dia,mes,ano,hisBrowser);
    }
}
