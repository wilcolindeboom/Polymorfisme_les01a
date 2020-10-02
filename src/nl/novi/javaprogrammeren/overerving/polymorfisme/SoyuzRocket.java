package nl.novi.javaprogrammeren.overerving.polymorfisme;

public class SoyuzRocket extends Rocket {

    public SoyuzRocket(int maximumFuel) {
        super(maximumFuel);
    }

    @Override
    public void land() {
        if(super.canDescend(40)) {
            System.out.println("Rocket has crashed");
        } else {
            System.out.println("Rocket has landed");
        }
    }
}
