package be.intecbrussel;

public class Convertible extends Car {

    private String sunroof;

    public String getSunroof() {
        return sunroof;
    }

    public void setSunroof(String sunroof) {
        this.sunroof = sunroof;
    }

    public void switchToNoRoof() {
        System.out.println("Putting the top down in our convertible");
    }
}
