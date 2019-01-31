package exercise2.inheritance.polymorphism;

public class Main {
    public static void main(String[] args) {
        Car mercedesOld = new MercedesOld(3.3,10,2000);
        Car mercedesNew = new MercedesNew(4.3,15,3000,"Linux");
        mercedesOld.powerCalculation();
        mercedesNew.powerCalculation();
    }
}
