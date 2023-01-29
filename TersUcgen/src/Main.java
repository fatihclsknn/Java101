import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Basamak sayisi giriniz:");
        n = input.nextInt();
        for (int i = 0; i<= n-1; i++){

            for (int j = 0; j <= (i-1); j++){
                System.out.print(" ");
            }
            for (int k = 1; k<= (2* (n-i)-1); k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}