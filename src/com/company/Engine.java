package com.company;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Engine {

    public static void main(String[] args) {
        Scanner kbinput = new Scanner(System.in);
        System.out.print("Number of Discs: ");
        Hanoi hanoi = new Hanoi();
        int discs;
        while(true)
        {
            try
            {
                discs = kbinput.nextInt();
                System.out.println();
                break;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Invalid input. Please try again");
                kbinput.next();
                System.out.print("Number of Discs: ");
            }
        }
        hanoi.solve(discs, 'A', 'B', 'C');
        System.out.println("\nTotal Moves: " + (Math.pow(2, discs) - 1));
    }

}
