public class Main {
    public static void main(String[] args) {
        Door door = new Door(5, 5, false);
        door.openDoor();
        door.closeDoor();
        door.printOpen();
        System.out.println(door.calculateSurface());
    }
}