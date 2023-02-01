import java.util.Scanner;
import java.text.DecimalFormat;

@SuppressWarnings("resource")
    /**
     * @param arg
     */
public class Temperature_Converter {

    public static void main(String[] arg){
        var toConvert = "";
        var typeConvert = "";
        float tempStart = 0;
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("\nThis program will convert Celcius, Fahrenheit, and Kelvin between each other.\n");

        Scanner temperature = new Scanner(System.in);
        System.out.println("What is the current temperature?");
        tempStart = temperature.nextFloat(); //acquires initial temperature
        temperature.nextLine();
        
        System.out.println("\nWhat temperature unit would you like to convert?");
        toConvert = temperature.nextLine();
        toConvert = toConvert.toLowerCase();  
        //Acquires intial temerature unit
        while (!toConvert.equals("kelvin") && !toConvert.equals("celcius") && !toConvert.equals("fahrenheit")){
            System.out.println("\nPlease enter a valid unit\n");
            toConvert = temperature.nextLine();
        }
        //Checks for valid initial unit

        System.out.println("\nWhat unit do you want to convert to?"); 
        typeConvert = temperature.nextLine();
        typeConvert = typeConvert.toLowerCase();
        //Acquires desired temperature unit
        

        while (!typeConvert.equals("kelvin") && !typeConvert.equals("celcius") && !typeConvert.equals("fahrenheit")){
            System.out.println("Please enter a valid unit");
            typeConvert = temperature.nextLine();
        }
        //checks for valid desired unit

        if (toConvert.equals("celcius")){
            if (typeConvert.equals("kelvin")){
                var finalValue = tempStart + 237;
                System.out.println("\n" + tempStart + " Degrees Celcius is " + df.format(finalValue) + " Degrees Kelvin.");
            }else if (typeConvert.equals("fahrenheit")){
                var finalValue = tempStart * 1.8 + 32;
                System.out.println ("\n" + tempStart + " degrees Celcius is " + df.format(finalValue) + " Degrees Fahrenheit.");
            } 

         // converts Celcius to Kelvin or Fahrenheit

        } else if (toConvert.equals("fahrenheit")){
            if (typeConvert.equals("kelvin")){
                var finalValue = (tempStart - 32) / 1.8 + 273.15;
                System.out.println("\n" + tempStart + " Degrees Fahrenheit is " + df.format(finalValue) + " Degrees Kelvin.");
            }else if (typeConvert.equals("celcius")){
                var finalValue = (tempStart - 32) / 1.8;
                System.out.println("\n" + tempStart + " degrees Fahrenheit is " + df.format(finalValue) + " Degrees Celcius.");
            }

        //Converts fahrenheit to Celcius or Kelvin

        } else if (toConvert.equals("kelvin")){
            if (typeConvert.equals("celcius")){
                var finalValue = tempStart - 273;
                System.out.println("\n" + tempStart + " Degrees Kelvin is " + df.format(finalValue) + " Degrees Celcius.");
            }else if (typeConvert.equals("fahrenheit")){
                var finalValue = (tempStart - 273) * 1.8 +32;
                System.out.println("\n" + tempStart + " Degrees Kelvin is " + df.format(finalValue) + " Degrees fahrenheit.");
            }

         //Converts Kelvin to Celcius or Fahrenheit

        } else {
            System.out.println("Please Restart");
        }
    }
}