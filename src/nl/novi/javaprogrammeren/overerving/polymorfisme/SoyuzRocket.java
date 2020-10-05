package nl.novi.javaprogrammeren.overerving.polymorfisme;

public class SoyuzRocket extends Rocket {




    public SoyuzRocket(int maximumFuel) {
        this.maximumFuel = maximumFuel;
        this.currentFuel = maximumFuel;
    }

    @Override
    public  void fly(int fuel) {
        int metersFlown = 0;
        if(hasEnoughFuel(fuel)) {
            metersFlown = calculateMetersFlown(fuel);
            decreaseFuel(fuel);
        }
        this.height = height + metersFlown;
    }

    @Override
    public  int getHeight() {
        return height;
    }

    @Override
    public  int calculateMetersFlown(int fuel) {
        return fuel * 100;
    }

    @Override
    public  void decreaseFuel(int fuel) {
        currentFuel = currentFuel - fuel;
    }

    @Override
    public  boolean hasEnoughFuel(int fuel) {
        if(fuel < currentFuel) {
            return true;
        } return false;
    }

    @Override
    public void land() {
        if(height>currentFuel*40) {
            System.out.println("Rocket has crashed");
        }
        else {
            System.out.println("Rocket has landed");
        }
    }


    public String toString() {
        return "The Rocket is flying at an altitude of " + this.height + " meters.";
    }
}