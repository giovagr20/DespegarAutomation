# Author: Giovanni Gómez Restrepo
# giovannyg32@gmail.com

Feature: Reserve new flight
  As a user wants to reserve a new flight
  and doesn't buy

  Scenario: Reserve new flight
    Given User must enter to despegar web page
    And User must choose option vuelos
    And User text in origin "Medellín, Antioquia, Colombia" and destiny "Bogotá, Bogotá D.C., Colombia"
    And User adds date departure and return
    And User clicks on Search
    When User chooses first flight
    Then User enters personal information for invoice
    |Banco      |Nombre  |Apellido|Numero documento|Estado   |Ciudad                       |Direccion  |
    |Bancolombia|Giovanni|Gomez   |10102020        |Antioquia|Medellín, Antioquia, Colombia|Cra 1 # 1-2|
    And User enters information who travel
    |Nombres |Apellidos|Pais    |Numero documento|Dia|Mes|Ano |
    |Giovanni|Gomez    |Colombia|10102020        |17 |1  |1996|
    And User Enters information for vouchers
    |Email                |Confirmar email      |Area|Numero    |
    |giovannyg32@gmail.com|giovannyg32@gmail.com|57  |3014221478|
    And User verifies if  nombre and apellidos are corrects

