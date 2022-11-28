package airport.airplane;

public class Airplane {
    String id;
    int maxPassengers;
    int currentPassengers;
    boolean flying;
    double cruiseSpeed;

    public Airplane(String id, int maxPassengers) {
        this.id = id;
        this.maxPassengers = maxPassengers;
    }

    public void loadPlane(int load) {
        System.out.println("Loading plane " + this.id + " with " + load + " passengers...");
        this.currentPassengers += load;
    }

    public void unloadPlane() {
        System.out.println("Unloading " + this.currentPassengers + " passengers from plane " + this.id + "...");
        this.currentPassengers = 0;
    }

    public void takeOff() {
        System.out.println("Plane " + this.id + " is taking off...");
        this.flying = true;
    }

    public void land() {
        System.out.println("Plane " + this.id + " is landing...");
        this.flying = false;
    }
}
