package com.co.despegar.automation.tasks.reserve;

import static com.co.despegar.automation.userinterfaces.DespegarPage.*;

import com.co.despegar.automation.interactions.EnterInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.WebDriver;

public class VoucherFlight implements Task {

    private String email;
    private String confirmarEmail;
    private String area;
    private String numero;
    private WebDriver hisBrowser;

    public VoucherFlight(String email, String confirmarEmail, String area, String numero, WebDriver hisBrowser) {
        this.email = email;
        this.confirmarEmail = confirmarEmail;
        this.area = area;
        this.numero = numero;
        this.hisBrowser = hisBrowser;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(TXT_EMAIL_VOUCHER).andAlignToTop(),
                EnterInformation.textField(email, TXT_EMAIL_VOUCHER),
                EnterInformation.textField(confirmarEmail, TXT_CONFIRM_EMAIL_VOUCHER),
                EnterInformation.textField(area, TXT_AREA),
                EnterInformation.textField(numero, TXT_NUMBERPHONE)
        );
    }

    public static VoucherFlight voucherFlight(
            String email,
            String confirmarEmail,
            String area,
            String numero,
            WebDriver hisBrowser){
        return Tasks.instrumented(VoucherFlight.class, email, confirmarEmail, area, numero, hisBrowser);
    }
}
