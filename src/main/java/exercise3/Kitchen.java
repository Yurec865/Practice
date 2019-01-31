package exercise3;

public class Kitchen extends Room {
    Balcony balcony = new Balcony(4,5);
    public Kitchen(double length, double width) {
        super(length, width);
    }
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
        if (balcony == null){
            square();
        }else if (balcony != null){
            square();
            balcony.square();
        }
        return 0;
    }
}
