package Shapes;

import java.util.Scanner;

public class DiamondShape {

static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        int x, z, numOfRows;

        System.out.println("How tall should the triangle be?");
        numOfRows = console.nextInt();

        // This is the top triangle
        for(x = 0 ; x <= numOfRows ; x++) {
            for(z = 1 ; z <= numOfRows - x; z++) {
                System.out.print(" ");
            }
            for(z = 1 ; z <= 2*x-1 ; z++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // This is the bottom triangle
        for(x = numOfRows - 1; x >= 1; x--) {
            for(z = 1; z <= numOfRows - x; z++) {
                System.out.print(" ");
            }
            for(z = 1; z <= 2*x-1; z++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}