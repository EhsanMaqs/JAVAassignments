package airport;

import airport.airplane.Airplane;

public class Application {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("KLM252", 300);
        Airplane airplane2 = new Airplane("QA612", 500);

        airplane1.loadPlane(250);
        airplane1.takeOff();
        airplane1.land();
        airplane2.loadPlane(426);
        airplane2.takeOff();
        airplane1.unloadPlane();
        airplane2.land();
        airplane2.unloadPlane();
    }
}
