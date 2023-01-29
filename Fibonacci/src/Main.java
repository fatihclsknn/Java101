import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n0 = 0;
        int n1 = 1;
        int number;
        int sum = 0;
        System.out.println("Sayı giriniz");
        number = input.nextInt();

        for (int i = 0; i <=number; i++ )
        {
            System.out.print(n0+",");
            sum = n0 + n1;
            n0 = n1;
            n1 = sum;
        }
    }
}