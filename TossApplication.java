/*
 */
package com.controlstructure.toss;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class TossApplication {

    public static void main(String[] args) {
        int toss[] = {0, 0, 0, 0, 0, 0};
        for (int t = 1; t <= 5; t++) {
            System.out.println("Enter the toss " + t + " value : ");
            Scanner input = new Scanner(System.in);
            int inputValue = input.nextInt();

            switch (inputValue) {
                case 1:
                    toss[0]++;
                    break;
                case 2:
                    toss[1]++;
                    break;
                case 3:
                    toss[2]++;
                    break;
                case 4:
                    toss[3]++;
                    break;
                case 5:
                    toss[4]++;
                    break;
                case 6:
                    toss[5]++;
                    break;
                default:
                    System.out.println("Invalid Input : " + inputValue);
            }
        }
        System.out.println("Result : "+Arrays.toString(toss));
        
        System.out.println("Surface 1 times : "+toss[0]);
        System.out.println("Surface 2 times : "+toss[1]);
    }
}
