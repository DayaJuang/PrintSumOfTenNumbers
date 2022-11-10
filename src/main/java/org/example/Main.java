package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a scanner and a variable to track the loop and sum
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;

        while(count <= 10){
            System.out.println("Enter number #" + count);

            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                int num = scanner.nextInt();
                sum += num;
                count++;
            }else{
                System.out.println("Invalid Value");
            }
            scanner.nextLine();
        }

        System.out.println("The sum of your input is " + sum);

        scanner.close();
    }
}