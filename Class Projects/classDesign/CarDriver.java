package classDesign;

public class CarDriver{
    
    public static void main(String[] args){
        car myCar = new car();
        
        System.out.println(myCar.getMileage());
        System.out.println(myCar.getAmountOfGas());
        
        myCar.fillGas(3.5);
        System.out.println(myCar.getAmountOfGas());

        car secondCar = new car("red", 8);

        System.out.println(secondCar.getMileage());
        System.out.println(secondCar.getAmountOfGas());
        System.out.println(secondCar.getColor());
    }
}