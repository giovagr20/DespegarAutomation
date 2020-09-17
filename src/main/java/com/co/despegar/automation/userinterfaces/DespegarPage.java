package com.co.despegar.automation.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DespegarPage extends PageObject {

    public static final Target BTN_FLIGHTS = Target.the("BOTÓN VUELOS")
            .located(By.xpath("/html/body/nav/div[2]/div[1]/div[3]/ul/li[2]/a"));
    public static final Target INP_ORIGIN = Target.the("ORIGEN DE VUELO")
            .located(By.xpath("/html/body/div[6]/div/div[2]/div/div/div[3]/div[2]/div[1]/div[1]/div/div/div/input"));
    public static final Target INP_DESTINY = Target.the("DESTINO DE VUELO")
            .located(By.xpath("/html/body/div[6]/div/div[2]/div/div/div[3]/div[2]/div[1]/div[2]/div/div/div/div/input"));
}
