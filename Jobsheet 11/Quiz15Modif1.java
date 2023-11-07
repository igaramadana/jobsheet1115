import java.util.Random;
import java.util.Scanner;

public class Quiz15Modif1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc15 = new Scanner(System.in);

        char menu ='y';
        do{
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do{
                System.out.print("Tebak angka (1-10): ");
                int answer = sc15.nextInt();
                sc15.nextLine();
                success = (answer == number);

                if (answer > number) {
                    System.out.println("Angka lebih besar dari tebakan!");
                } else if (answer < number) {
                    System.out.println("Angka lebih kecil dari tebakan!");
                } else if (answer == number) {
                    System.out.println("Selamat, Tebakan anda benar!");
                }
            }while(!success);
            System.out.print("Apakah anda ingin mengulang permainan (y/t)? ");
            menu = sc15.nextLine().charAt(0);
        }while(menu == 'y' || menu == 'Y'); 
        System.out.println("Terima kasih sudah bermain tebak angka!");
    }
}

