import java.util.Scanner;
import java.util.Random;
public class Quiz15 {
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
            }while(!success);
            System.out.print("Apakah anda ingin mengulang permainan (y/t)? ");
            menu = sc15.nextLine().charAt(0);
        }while(menu == 'y' || menu == 'Y'); 
        System.out.println("Terima kasih sudah bermain tebak angka!");
    }
}
