package Shapes;
import java.util.Scanner;

public class TriangleShape {

static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        int x, z, numOfRows;

        System.out.println("How tall should the square be?");
        numOfRows = console.nextInt();

        for(x = 0 ; x <= numOfRows ; x++) {
            for(z = 1 ; z <= numOfRows - x; z++) {
                System.out.print(" ");
            }
            for(z = 1 ; z <= 2*x-1 ; z++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }    
}