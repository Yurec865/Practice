package exercise3;

public class Main {
    public static void main(String[] args) {
        Room kitchenBalcony = new Kitchen(8,3,new Balcony(4,5));
        Room kitchen = new Kitchen(8,3, null);
        Room bathroom = new Bathroom(12,5);
//        Balcony balcony = new Balcony(4,5);
        System.out.println("Square bathroom : " + bathroom.square() + " " + "Perimeter bathroom : " + bathroom.perimeter());
        System.out.println("Square kitchen : " + kitchenBalcony.square() + " " + "Perimeter kitchen : " + kitchenBalcony.perimeter());
        System.out.println("Square kitchen : " + kitchen.square() + " " + "Perimeter kitchen : " + kitchen.perimeter());
    }
}
