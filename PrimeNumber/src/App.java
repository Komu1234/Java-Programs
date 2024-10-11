package PrimeNumber.src;

import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        int num_checks,flag =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number  ");
        num_checks = sc.nextInt();
         printPrime(num_checks, flag);

    }

    public static void printPrime(int num_checks,int flag){


        if(num_checks == 0 || num_checks == 1){
            System.out.println("Its not a prime number");

        }
        else{
            for(int i = 2;i<num_checks;i++){
                if(num_checks%i == 0){
                    flag =1;
                }
            }

            if(flag == 1){
                System.out.println("Number is not prime");
            }
            else {
                System.out.println("Number is prime");
            }
        }
    }
}
