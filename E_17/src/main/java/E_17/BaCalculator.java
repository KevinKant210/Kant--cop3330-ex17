package E_17;

import java.util.Scanner;

public class BaCalculator {

    Scanner reader = new Scanner(System.in);
    IsValidNum checker = new IsValidNum();
   float alcohol,weight,hours;
   String gender;

   public void grabValues(){
        String holder;
        boolean escape = false;

        while(!escape){

            System.out.print("How much have you had to drink: ");
            holder = reader.next();
            if(checker.checkValid(holder)){
                alcohol = Float.parseFloat(holder);
                escape = true;
            }else{
                System.out.println("Please enter a valid number");

            }
        }

       escape = false;
       while(!escape){

           System.out.print("How much do you weight: ");
           holder = reader.next();
           if(checker.checkValid(holder)){
               weight = Float.parseFloat(holder);
               escape = true;
           }else{
               System.out.println("Please enter a valid number");

           }
       }

       escape = false;
       while(!escape){

           System.out.print("How Long since your last drink: ");
           holder = reader.next();
           if(checker.checkValid(holder)){
               hours = Float.parseFloat(holder);
               escape = true;
           }else{
               System.out.println("Please enter a valid number");

           }
       }

       System.out.print("What is your gender enter M or F ");
       gender = reader.next();


   }

    public double calculateBA(){


        if(gender.compareTo("M") == 0 || gender.compareTo("m") == 0) {
            return  (alcohol*5.14/weight*.73)-.015*hours;

        }else{
            return (alcohol*5.14/weight*.66)-.015*hours;
        }
    }
}
