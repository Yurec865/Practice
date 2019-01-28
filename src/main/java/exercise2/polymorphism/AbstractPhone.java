package exercise2.polymorphism;

public abstract class AbstractPhone {

    private int year;

    AbstractPhone(int year) {
        this.year = year;
    }

    public abstract void call(int outputNumber);
    public abstract void ring (int inputNumber);
}
