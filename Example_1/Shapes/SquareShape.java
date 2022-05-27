package Shapes;

public class SquareShape {

    static void print_rectangle(int y, int k)
    {
        int x, z;

        for (x = 1; x <= y; x++) {

            for (z = 1; z <= k; z++) {

                if (x == 1 || x == y || z == 1 || z == k)
 
                    System.out.print("*");
                else

                    System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void main(String args[])
    {
        // Custom input initialization values
        int rows = 8, columns = 16;

        print_rectangle(rows, columns);
    }
}
