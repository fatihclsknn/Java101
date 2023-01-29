import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, r;
        int nFak = 1;
        int rFak = 1;
        int sumOfNMinesRFac = 1;
        int result;
        System.out.print("N Değerini giriniz:");
        n = input.nextInt();
        System.out.print("R Değerini giriniz:");
        r = input.nextInt();

        for (int i= 1;  i <= n; i++)
        {
            nFak = nFak * i;
        }
        for (int i= 1;  i <= r; i++)
        {
            rFak = rFak * i;
        }
        for (int i= 1;  i <= n - r; i++)
        {
            sumOfNMinesRFac = sumOfNMinesRFac * i;
        }
        result = nFak / (rFak *(sumOfNMinesRFac));
        System.out.print("Kombinasyon sonucu:"+result);
    }
}