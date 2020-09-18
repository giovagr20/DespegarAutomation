package com.co.despegar.automation.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DespegarPage extends PageObject {

    public static final Target BTN_FLIGHTS = Target.the("BOTÓN VUELOS")
            .located(By.xpath("/html/body/nav/div[2]/div[1]/div[3]/ul/li[2]/a"));
    public static final Target INP_ORIGIN = Target.the("ORIGEN DE VUELO")
            .located(By.xpath("/html/body/div[6]/div/div[2]/div/div/div[3]/div[2]/div[1]/div[1]/div/div/div/input"));
    public static final Target ITEM_ACTIVE_ORIGIN = Target.the("SELECCIONAR CIUDAD ORIGEN")
            .located(By.xpath("/html/body/div[10]/div/div/ul/li/span"));
    public static final Target INP_DESTINY = Target.the("DESTINO DE VUELO")
            .located(By.xpath("/html/body/div[6]/div/div[2]/div/div/div[3]/div[2]/div[1]/div[2]/div/div/div/div/input"));
    public static final Target ITEM_ACTIVE_DESTINY = Target.the("SELECCIONAR CIUDAD DESTINO")
            .located(By.xpath("/html/body/div[10]/div/div/ul/li[1]/span"));
    public static final Target NO_DECIDE_DATE = Target.the("NO DECIDE FECHA")
            .located(By.xpath("/html/body/div[6]/div/div[2]/div/div/div[3]/div[2]/div[2]/span/label/input"));
    public static final Target INP_DATE_DEPARTURE = Target.the("CALENDARIO FECHA IDA")
            .located(By.xpath("/html/body/div[13]/div/div[2]/div/div/div[3]/div[2]/div[2]/div[2]/div[1]/div[2]/input"));
    public static final Target INP_DATE_RETURN = Target.the("CALENDARIO FECHA REGRESO")
            .located(By.xpath("/html/body/div[13]/div/div[2]/div/div/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/input"));
    public static final Target SPN_ARROW = Target.the("FLECHA SIGUIENTE MES")
            .located(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[2]/div[2]/i[1]"));
    public static final Target SPN_NOVEMBER_1 = Target.the("FECHA DE IDA")
            .located(By.xpath("/html/body/div[4]/div/div[5]/div[3]/div[4]/span[1]"));
    public static final Target SPN_NOVEMBER_8 = Target.the("FECHA DE REGRESO")
            .located(By.xpath("/html/body/div[11]/div/div[5]/div[3]/div[4]/span[8]"));
    public static final Target BTN_SEARCH = Target.the("BOTÓN BUSCAR")
            .located(By.xpath("/html/body/div[6]/div/div[2]/div/div/div[3]/div[2]/div[4]/div/a"));
    public static final Target BTN_SELECT = Target.the("SELECCIONAR PRIMER VUELO")
            .located(By.xpath("/html/body/div[12]/div/div/div/div[3]/div/div[2]/div/div[5]/app-root/app-common/items/div/span[1]/span[1]/cluster/div/div/div[2]/fare/span/span/div[2]/buy-button/a"));
    public static final Target RB_PSE = Target.the("RADIO BOTÓN PSE")
            .located(By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/payment-component/payment-method-selector/div/ul/li[4]/p/label/i"));
    public static final Target LST_BANK = Target.the("LISTADO DE BANCOS")
            .located(By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/payment-component/div/div[4]/payment-method/div/prepaid-payment-container/div/div[1]/cash-container/div/ul/li/div/cash-payment-info/div[1]/div/cash-select/div/div/div/div/div/select"));
    public static final Target TXT_NAME = Target.the("CAMPO NOMBRE")
            .located(By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/payment-component/div/div[4]/payment-method/div/prepaid-payment-container/div/div[2]/invoice-component/div/div[2]/div/invoice-default-component/div/div[2]/div/div[2]/div/input-component-v2/div/div/div/input"));
    public static final Target TXT_LASTNAME = Target.the("CAMPO APELLIDO")
            .located(By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/payment-component/div/div[4]/payment-method/div/prepaid-payment-container/div/div[2]/invoice-component/div/div[2]/div/invoice-default-component/div/div[2]/div/div[3]/div/input-component-v2/div/div/div/input"));
    public static final Target TXT_NUMBERID = Target.the("CAMPO IDENTIFICACION")
            .located(By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/payment-component/div/div[4]/payment-method/div/prepaid-payment-container/div/div[2]/invoice-component/div/div[2]/div/invoice-default-component/div/div[2]/div/div[5]/div/div/fiscal-identification-input/div/div/input-component-v2/div/div/div/input"));
    public static final Target LST_STATE = Target.the("LISTADO DE ESTADOS")
            .located(By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/payment-component/div/div[4]/payment-method/div/prepaid-payment-container/div/div[2]/invoice-component/div/div[2]/div/invoice-default-component/div/address/div/div[2]/select-component-v2/div/div/div/div/select"));
    public static final Target TXT_CITY = Target.the("CAMPO DE CIUDAD")
            .located(By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/payment-component/div/div[4]/payment-method/div/prepaid-payment-container/div/div[2]/invoice-component/div/div[2]/div/invoice-default-component/div/address/div/div[3]/autocomplete-city-own/div/div/div/input"));
    public static final Target TXT_ADDRESS = Target.the("CAMPO DE DIRECCION")
            .located(By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/payment-component/div/div[4]/payment-method/div/prepaid-payment-container/div/div[2]/invoice-component/div/div[2]/div/invoice-default-component/div/address/div/div[4]/div/address-street-input/div/div/input-component-v2/div/div/div/input"));
    public static final Target TXT_NAME_TRAVEL = Target.the("Quien Viaja Nombres")
            .located(By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/travelers/div/ul/li/ul/li/traveler/div/div[2]/div/div[1]/traveler-first-name-input/div/div/input-component-v2/div/div/div/input"));
    public static final Target TXT_LASTNAME_TRAVEL = Target.the("Quien Viaja Apellidos")
            .located(By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/travelers/div/ul/li/ul/li/traveler/div/div[2]/div/div[1]/traveler-last-name-input/div/div/input-component-v2/div/div/div/input"));
    public static final Target LST_COUNTRY_TRAVEL = Target.the("LISTADO DE PAISES")
            .located(By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/travelers/div/ul/li/ul/li/traveler/div/div[2]/div/div[2]/select-component-v2/div/div/div/div/select"));
    public static final Target TXT_NUMBERID_TRAVEL = Target.the("Quien Viaja Identificacion")
            .located(By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/travelers/div/ul/li/ul/li/traveler/div/div[2]/div/div[2]/traveler-identification/div/div/div[3]/div/input-component-v2/div/div/div/input"));
    public static final Target LST_DAY_BIRTH = Target.the("DIA NACIMINENTO")
            .located(By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/travelers/div/ul/li/ul/li/traveler/div/div[2]/div/div[3]/div/div/select-component-v2[1]/div/div/div/div/select"));
    public static final Target LST_MONTH_BIRTH = Target.the("MES DE NACIMIENTO")
            .located(By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/travelers/div/ul/li/ul/li/traveler/div/div[2]/div/div[3]/div/div/select-component-v2[2]/div/div/div/div/select"));
    public static final Target LST_YEAR_BIRTH = Target.the("AÑO DE NACIMIENTO")
            .located(By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/travelers/div/ul/li/ul/li/traveler/div/div[2]/div/div[3]/div/div/select-component-v2[3]/div/div/div/div/select"));
    public static final Target RB_GENDER = Target.the("SEXO-GENERO")
            .located(By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/travelers/div/ul/li/ul/li/traveler/div/div[2]/div/div[3]/compound-radio-component/div/div/div/ul/li[2]/label/span/i"));
    public static final Target TXT_EMAIL_VOUCHER = Target.the("EMAIL VOOCHER")
            .located(By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/contact-email-container/contact-email/div/div/email-address/div/div/input-component[1]/div/div/div/input"));
    public static final Target TXT_CONFIRM_EMAIL_VOUCHER = Target.the("CONFIRMAR EMAIL VOUCHER")
            .located(By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/contact-email-container/contact-email/div/div/email-address/div/div/input-component[2]/div/div/div/input"));
    public static final Target TXT_AREA = Target.the("AREA DE LLAMADA")
            .located(By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/contact-phone/div/div/phones/ul/li/phone/div/div[2]/input-component-v2[1]/div/div/div/input"));
    public static final Target TXT_NUMBERPHONE = Target.the("NUMERO DE TELEFONO")
            .located(By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/contact-phone/div/div/phones/ul/li/phone/div/div[2]/input-component-v2[2]/div/div/div/input"));
    public static final Target SPN_NAME_VERIFY = Target.the("NOMBRE A VERIFICAR")
            .located(By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/buy-component/div/flight-data-revision/div/ul/li/div/div[1]/span"));
    public static final Target SPN_LASTNAME_VERIFY = Target.the("APELLIDO A VERIFICAR")
            .located(By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/buy-component/div/flight-data-revision/div/ul/li/div/div[2]/span"));
}
