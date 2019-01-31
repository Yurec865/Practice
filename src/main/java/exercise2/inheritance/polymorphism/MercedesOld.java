package exercise2.inheritance.polymorphism;

public class MercedesOld extends Car{

    MercedesOld(double engineVolume, int fuelConsumption, int weight) {
        super(engineVolume, fuelConsumption, weight);
    }
    public String powerCalculation() {
       pofig();
       return String.valueOf(engineVolume * fuelConsumption * weight);
    }
}
