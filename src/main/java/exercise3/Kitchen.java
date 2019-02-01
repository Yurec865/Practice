package exercise3;

public class Kitchen extends Room {
    private Balcony balcony;
    public Kitchen(double length, double width, Balcony balcony) {
        super(length, width);
        this.balcony = balcony;
    }
    @Override
    double square() {
        return customSquare();
    }
    @Override
    double perimeter() {
        return length + width;
    }
    private double customSquare(){
        double result = 0;
        double square = length * width;
        if (balcony == null){
            result = square;
        }else if (balcony != null){
            result = balcony.square() + square;
        }
        return result;
    }
}
