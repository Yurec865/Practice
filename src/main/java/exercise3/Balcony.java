package exercise3;

public class Balcony {
    private double length;
    private double width;

    Balcony(double length, double width){
        this.length = length;
        this.width = width;
    }
    double square(){
        return length * width;
    }
}
