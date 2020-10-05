package nl.novi.javaprogrammeren.overerving.polymorfisme;

public abstract class Rocket {

 int maximumFuel;
 int currentFuel;
 int height = 0;


    public abstract void fly(int fuel) ;

    public abstract int getHeight() ;

    public abstract int calculateMetersFlown(int fuel) ;

    public abstract void decreaseFuel(int fuel) ;

    public abstract boolean hasEnoughFuel(int fuel) ;

    public abstract void land() ;

}
