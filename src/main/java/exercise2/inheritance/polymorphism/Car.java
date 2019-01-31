package exercise2.inheritance.polymorphism;

public abstract class Car {

    protected double engineVolume;
    protected int fuelConsumption;
    protected int weight;

    Car(double engineVolume, int fuelConsumption, int weight) {
        this.engineVolume = engineVolume;
        this.fuelConsumption = fuelConsumption;
        this.weight = weight;
    }
    protected void pofig(){
        double result = engineVolume * fuelConsumption + weight;
        System.out.println(result);
    }
    abstract String powerCalculation();
}
