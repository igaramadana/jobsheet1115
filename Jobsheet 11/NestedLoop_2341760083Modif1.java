import java.util.Scanner;

public class NestedLoop_2341760083Modif1 {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);
        double temps[][] = new double[5][7];

        for (int i = 0; i < temps.length; i++){
            System.out.println("Kota ke-" + (i + 1) + ": ");
            for (int j = 0; j < temps.length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = sc15.nextDouble();
            }
            System.out.println();
        }

        for (int i = 0; i < temps.length; i++){
            System.out.print("Kota ke-" + (i + 1) + ": ");
            for (double temp : temps[i]) {
                System.out.print(temp + ": ");
            }
            System.out.println();
        }
    }
}