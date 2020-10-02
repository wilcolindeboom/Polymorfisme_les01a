package nl.novi.javaprogrammeren.overerving.polymorfisme;

public class SpaceXRocket extends Rocket {

    // We roepen hier de constructor aan van Rocket
    public SpaceXRocket(int maximumFuel) {
        super(maximumFuel);
    }

    /**
     * d) Implementeer de methode in SpaceXRocket. De methode rekent uit of de raket kan landen of niet
     *     (50 height per 1 fuel). Is dat niet het geval: System.out.println("Rocket has crashed");
     *     Heeft de raket wel genoeg energie: System.out.println("Rocket has landed");
     *
     *     Note van Nick: het is eigenlijk een beetje raar dat we deze methode nu niet in de superklasse zetten. Alleen
     *     een specifieke parameter is anders.
     */
    @Override
    public void land() {
        if(super.canDescend(50)) {
            System.out.println("Rocket has crashed");
        } else {
            System.out.println("Rocket has landed");
        }
    }
}
