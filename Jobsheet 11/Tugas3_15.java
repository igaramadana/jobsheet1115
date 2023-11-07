import java.util.Scanner;

public class Tugas3_15 {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = sc15.nextInt();
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j++) {
                if (i == 1 || i == N || j == 1 || j == N) {
                    System.out.print(N + " ");
                } else {
                    System.out.print("  ");
                }
        }
        System.out.println();
        }
    }
}
