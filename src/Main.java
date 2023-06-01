/**
 * @author fazliberkordek
 */

//Todo: Java ile klavyeden girilen N tane sayma sayısından en
// büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //todo: step 1: get amoun of the input.
        Scanner input = new Scanner(System.in);

        System.out.print("Amount of inputs : ");
        int amountOfInputs = input.nextInt();
        if (amountOfInputs < 0) {
            System.out.println("Invalid Input!!");
        }
        int numbers = 1;
        int greatest = numbers;
        int lowest = numbers;
        //Todo Step 2 : We have to take the numbers by the amoun of inputs :
        for (int i = 1; i <= amountOfInputs; i++) {
            System.out.print(i + "'th number : ");
            numbers = input.nextInt();
            //todo :Step 3 finding the graetst among the numbers
            if (numbers > greatest) {
                greatest = numbers;
            }
            //todo: Step4 finding the the lowest amoong the numbers:
            if (numbers < lowest) {
                lowest = numbers;
            }
        }
        System.out.println("The most greatest is: " + greatest);
        System.out.println("The most lowest is : " + lowest);


    }
}