import java.util.Scanner;

public class Tugas2_15 {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = sc15.nextInt();
        for(int i = 0; i <= N; i++){
            for(int j = i; j <= N; j++) {
            System.out.print("*");
        }
        System.out.println();
        }
    }
}
