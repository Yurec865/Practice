package exercise3;

public abstract class Room {
    protected double length;
    protected double width;

    Room(double length, double width){
        this.length = length;
        this.width = width;
    }
    double square(){
        return  length * width;
    }
    double perimeter(){
        return length + width;
    }
}
