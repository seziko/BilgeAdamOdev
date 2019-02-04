package odev;

import java.util.Scanner;

public class BilgeAdamOdev {

    public static void main(String[] args) {



            Scanner scanner = new Scanner(System.in);
            System.out.print("Bir Değer Giriniz..");
            int input = scanner.nextInt();
            if(input==2) {
                System.out.println("Girmiş olduğunuz " + input + " değeri asal bir sayıdır.");


            }else if (input % input == 0 && input % 1 == 0 && input%2==1) {
                System.out.println("Girmiş olduğunuz " + input + " değeri bir asal sayıdır.");

            } else


                System.out.println("Girmiş olduğunuz " + input + " değeri asal bir sayı değildir.");

        }
    }



