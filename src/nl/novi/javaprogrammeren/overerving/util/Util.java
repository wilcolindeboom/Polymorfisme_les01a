package nl.novi.javaprogrammeren.overerving.util;

import nl.novi.javaprogrammeren.overerving.polymorfisme.Rocket;

public class Util {

    //private constructor zodat de klasse niet geinstantieerd kan worden.
    private Util(){}

    public static void destroyRocket(Rocket rocket) {
        System.out.println("The Rocket is destroyed. It had flown" + rocket.getHeight() + " meters.");
    }

}
