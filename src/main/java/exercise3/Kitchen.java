package exercise3;

public class Kitchen extends Room {
    private Balcony balcony;
    public Kitchen(double length, double width, Balcony balcony) {
        super(length, width);
        this.balcony = balcony;
    }
    @Override
    double square() {
        return length * width;
    }
    @Override
    double perimeter() {
        return length + width;
    }
    private double customSquare(){
        double result = 0;
        if (balcony == null){
            result = square();
        }else if (balcony != null){
            result = square() + balcony.square();
        }
        return result;
    }
}
