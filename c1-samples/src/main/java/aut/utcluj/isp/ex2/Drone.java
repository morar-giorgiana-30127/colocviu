
package aut.utcluj.isp.ex2;

public class Drone {

    private String id;
    private boolean state;

    public Drone(String sdR1, boolean b) {

        this.id = sdR1;
        this.state = b;
    }

    public String flight() {
        return "Stealth Drone " + id + " is up.";
    }
}
