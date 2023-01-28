import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sicaklik;
        System.out.print("Sıcaklık giriniz:");
        sicaklik = input.nextInt();
        if (sicaklik <= 0)
        {
            System.out.print("Kar topu oynamaya çıkabilirsiniz");
        } else if (sicaklik <= 5) {
            System.out.print("evde film izleyebilirsiniz");
        } else if (sicaklik >6 && sicaklik <15) {
            System.out.print("sinemaya gidebilrisniz");
        } else if (sicaklik > 16 && sicaklik < 25) {
            System.out.print("pikniğe gidebilrisniz");
        }
        else
            System.out.print("yüzmeye gidebilrisniz");


    }

}