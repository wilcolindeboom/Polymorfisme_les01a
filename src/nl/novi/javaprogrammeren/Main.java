package nl.novi.javaprogrammeren;

import nl.novi.javaprogrammeren.overerving.polymorfisme.Rocket;
import nl.novi.javaprogrammeren.overerving.polymorfisme.SoyuzRocket;
import nl.novi.javaprogrammeren.overerving.polymorfisme.SpaceXRocket;
import nl.novi.javaprogrammeren.overerving.util.Util;

public class Main {

    /*
    Gegeven: 2 klassen. SpaceXRocket extends Rocket.

    a) Maak de klasse Rocket Abstract en pas de code hieronder aan, zodat deze weer werkt. GenericRocket hoeft niet meer
    geinstantieerd te worden.

    b) Pas de code zo aan dat dit werkt: Util.destroyRocket(spaceXRocket);
    Dit is een statische methode. Hier kun je meer over lezen op EdHub!

    c) Maak een abstracte methode `void land()` in Rocket.

    d) Implementeer de methode in SpaceXRocket. De methode rekent uit of de raket kan landen of niet
    (50 height per 1 fuel). Is dat niet het geval: System.out.println("Rocket has crashed");
    Heeft de raket wel genoeg energie: System.out.println("Rocket has landed");


    e) Maak een klasse SoyuzRocket aan.
    f) Implementeer de methode land(). Een Soyuz-rocket daalt 40 heigt per 1 fuel.

   g) Instantieer de Soyuz-rocket. Let op polymorfisme!
   h) Zorg dat je Util.destroyRocket() kunt aanroepen met het Soyuz-object.
     */

    public static void main(String[] args) {

        Rocket spaceXRocket = new SpaceXRocket(100);
        spaceXRocket.fly(10);
        System.out.println(spaceXRocket.toString());
        spaceXRocket.land();
        Util.destroyRocket(spaceXRocket);
        System.out.println("--");

        Rocket unLandableRocket = new SpaceXRocket(250);
        unLandableRocket.fly(250);
        System.out.println(unLandableRocket.toString());
        unLandableRocket.land();
        Util.destroyRocket(unLandableRocket);
        System.out.println("--");

        Rocket russianCrasher = new SoyuzRocket(10);
        russianCrasher.fly(10);
        System.out.println(russianCrasher.toString());
        russianCrasher.land();
        Util.destroyRocket(russianCrasher);
        System.out.println("--");

        Rocket russianLander = new SoyuzRocket(100);
        russianLander.fly(10);
        System.out.println(russianLander.toString());
        russianLander.land();
        Util.destroyRocket(russianLander);

    }
}
