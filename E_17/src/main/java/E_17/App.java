package E_17;


/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Kevin Kant
 */
public class App 
{
    public static void main( String[] args )
    {
        BaCalculator policeman = new BaCalculator();

        policeman.grabValues();

        float result = (float) policeman.calculateBA();

        if(result < 0){
            System.out.println("Your BAC is 0.00 You can drive");
        }else if(result < .08){
            System.out.printf("Your BAC is %.2f You can drive", result);
        }else{
            System.out.printf("Your BAC is %.2f You CANNOT Drive", result);
        }


    }
}
