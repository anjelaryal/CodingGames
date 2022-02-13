import java.util.*;
import java.io.*;
import java.math.*;

public class ShadowKnight {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // width of the building.
        int H = in.nextInt(); // height of the building.
        int N = in.nextInt(); // maximum number of turns before game over.
        int X0 = in.nextInt();
        int Y0 = in.nextInt();

        int upperx = W-1;
        int lowerx = 0;
        int uppery = H-1;
        int lowery = 0;

        // game loop
        while (true) {
            String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            if(bombDir.contains("U")){
                // y ko upper limit ghatauney
                uppery = Y0 - 1;
            }
            if(bombDir.contains("D")){
                // y ko lower limit badhauney
                lowery = Y0 + 1;
            }
            if(bombDir.contains("L")){
                // x ko upper limit ghatauney
                upperx = X0 - 1;
            }
            if(bombDir.contains("R")){
                // x ko lower limit badhauney
                lowerx = X0 + 1;
            }

            X0 = lowerx + (upperx - lowerx)/2;
            Y0 = lowery + (uppery - lowery)/2;
            

            // the location of the next window Batman should jump to.
            System.out.println(X0 + " " + Y0);
        }
    }
}
