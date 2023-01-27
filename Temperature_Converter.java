import java.util.Scanner;
@SuppressWarnings("resource")

public class Temperature_Converter {
    /**
     * @param arg
     */
    public static void main(String[] arg){
        var toConvert = "";
        var typeConvert = "";
        float tempStart = 0;

        Scanner temperature = new Scanner(System.in);
        System.out.println("What is the temperature?");
        tempStart = temperature.nextFloat(); //aquires initial temperature
        
        Scanner tempType = new Scanner(System.in);
        System.out.println("What temperature would you like to convert?");
        toConvert = tempType.nextLine(); //aquires initial temperature unit
        toConvert = toConvert.toLowerCase();

        Scanner desiredType = new Scanner(System.in);
        System.out.println("What do you want to convert to?"); 
        typeConvert = desiredType.nextLine(); //Aquires desired temperature unit
        typeConvert = typeConvert.toLowerCase();


        if (toConvert.equals("celcius")){
            if (typeConvert.equals("kelvin")){
                var finalValue = tempStart + 237;
                System.out.println(tempStart + " Degrees Celcius is " + finalValue + " Degrees Kelvin.");
            }else if (typeConvert.equals("fahrenheit")){
                var finalValue = tempStart * 1.8 + 32;
                System.out.println(tempStart + " degrees Celcius is " + finalValue + " Degrees Fahrenheit.");
            }else{
                System.out.println("Please enter a valid conversion unit.");
            } 

         // converts Celcius to Kelvin or Fahrenheit

        } else if (toConvert.equals("fahrenheit")){
            if (typeConvert.equals("kelvin")){
                var finalValue = (tempStart - 32) / 1.8 + 273.15;
                System.out.println(tempStart + " Degrees Fahrenheit is " + finalValue + " Degrees Kelvin.");
            }else if (typeConvert.equals("celcius")){
                var finalValue = (tempStart - 32) / 1.8;
                System.out.println(tempStart + " degrees Fahrenheit is " + finalValue + " Degrees Celcius.");
            }else{
                System.out.println("Please enter a valid conversion unit.");
            }

        //Converts fahrenheit to Celcius or Kelvin

        } else if (toConvert.equals("kelvin")){
            if (typeConvert.equals("celcius")){
                var finalValue = tempStart - 273;
                System.out.println(tempStart + " Degrees Kelvin is " + finalValue + " Degrees Celcius.");
            }else if (typeConvert.equals("fahrenheit")){
                var finalValue = (tempStart - 273) * 1.8 +32;
                System.out.println(tempStart + " Degrees Kelvin is " + finalValue + " Degrees fahrenheit.");
            }else{
                System.out.println("Please enter a valid conversion unit.");
            }

         //Converts Kelvin to Celcius or Fahrenheit

        } else {
            System.out.println("Please enter a valid unit to conver.");
        }
    }
}