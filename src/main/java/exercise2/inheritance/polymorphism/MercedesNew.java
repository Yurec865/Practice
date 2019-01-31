package exercise2.inheritance.polymorphism;

public class MercedesNew extends MercedesOld {

    private String operatingSystem;

    MercedesNew(double engineVolume, int fuelConsumption, int weight, String operatingSystem) {
        super(engineVolume, fuelConsumption, weight);
        this.operatingSystem = operatingSystem;
    }
    @Override
    public String powerCalculation() {
        pofig();
        return String.valueOf(engineVolume * fuelConsumption * weight) + "Operating system : " + operatingSystem;
    }
}
