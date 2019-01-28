package exercise2.inheritance;

public class Smartphone extends CellPhone {

    private String operationSystem;

    public Smartphone(int year, int hour, String operationSystem) {
        super(year, hour);
        this.operationSystem = operationSystem;
    }
    public void install(String program){
        System.out.println("Устанавливаю " + program + "для" + operationSystem);
    }

}
