public class Door {
    int width;
    int height;
    boolean open;

    public Door(int width, int height, boolean open) {
        this.width = width;
        this.height = height;
        this.open = open;
    }

    public void openDoor() {
        this.open = true;
        System.out.println("Opening door");
    }

    public void closeDoor() {
        this.open = false;
        System.out.println("Closing door");
    }

    public void printOpen() {
        System.out.println("The door is open: " + this.open);
    }

    public int calculateSurface() {
        return this.width * this.height;
    }
}
