package classDesign;
public class car {
    private String color;
    private int milage;
    private double amountOfGas;

    public car(){
        this.color = "pink";
        this.milage = 15;
        this.amountOfGas = 2.0;
    }
    public car(String color, double amountOfGas){
        this.color = color;
        this.amountOfGas = amountOfGas;
    }
    public int getMileage(){
        return this.milage;
    }
    public String getColor(){
        return this.color;
    }
    public Double getAmountOfGas(){
        return amountOfGas;
    }
    public void fillGas(double fill){
        this.amountOfGas = amountOfGas + fill;
    }
    
}
