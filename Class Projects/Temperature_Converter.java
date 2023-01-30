import java.util.Scanner;
import java.text.DecimalFormat;

@SuppressWarnings("resource")

public class Temperature_Converter {
    /**
     * @param arg
     */
    public static void main(String[] arg){
        var toConvert = "";
        var typeConvert = "";
        float tempStart = 0;
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("\nThis program will convert Celcius, Fahrenheit, and Kelvin between each other.\n");

        Scanner temperature = new Scanner(System.in);
        System.out.println("What is the current temperature?");
        tempStart = temperature.nextFloat(); //acquires initial temperature
        
        Scanner tempType = new Scanner(System.in);
        System.out.println("What temperature unit would you like to convert?");
        toConvert = tempType.nextLine(); //acquires initial temperature unit
        toConvert = toConvert.toLowerCase();

        Scanner desiredType = new Scanner(System.in);
        System.out.println("What unit do you want to convert to?"); 
        typeConvert = desiredType.nextLine(); //Acquires desired temperature unit
        typeConvert = typeConvert.toLowerCase();


        if (toConvert.equals("celcius")){
            if (typeConvert.equals("kelvin")){
                var finalValue = tempStart + 237;
                System.out.println( tempStart + " Degrees Celcius is " + df.format(finalValue) + " Degrees Kelvin.");
            }else if (typeConvert.equals("fahrenheit")){
                var finalValue = tempStart * 1.8 + 32;
                System.out.println (tempStart + " degrees Celcius is " + df.format(finalValue) + " Degrees Fahrenheit.");
            }else{
                System.out.println("Please enter a valid conversion unit.");
            } 

         // converts Celcius to Kelvin or Fahrenheit

        } else if (toConvert.equals("fahrenheit")){
            if (typeConvert.equals("kelvin")){
                var finalValue = (tempStart - 32) / 1.8 + 273.15;
                System.out.println(tempStart + " Degrees Fahrenheit is " + df.format(finalValue) + " Degrees Kelvin.");
            }else if (typeConvert.equals("celcius")){
                var finalValue = (tempStart - 32) / 1.8;
                System.out.println(tempStart + " degrees Fahrenheit is " + df.format(finalValue) + " Degrees Celcius.");
            }else{
                System.out.println("Please enter a valid conversion unit.");
            }

        //Converts fahrenheit to Celcius or Kelvin

        } else if (toConvert.equals("kelvin")){
            if (typeConvert.equals("celcius")){
                var finalValue = tempStart - 273;
                System.out.println(tempStart + " Degrees Kelvin is " + df.format(finalValue) + " Degrees Celcius.");
            }else if (typeConvert.equals("fahrenheit")){
                var finalValue = (tempStart - 273) * 1.8 +32;
                System.out.println(tempStart + " Degrees Kelvin is " + df.format(finalValue) + " Degrees fahrenheit.");
            }else{
                System.out.println("Please enter a valid conversion unit.");
            }

         //Converts Kelvin to Celcius or Fahrenheit

        } else {
            System.out.println("Please enter a valid unit to conver.");
        }
    }
}