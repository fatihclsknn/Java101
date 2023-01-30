import java.util.Scanner;

public class Main {
    static  int exponents(int taban, int us)
    {
        if (us == 1)
            return taban;
        return taban * exponents(taban, us -1);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int taban, us;
        System.out.print("Taban değerini giriniz:");
        taban = input.nextInt();
        System.out.print("Üs değerini giriniz:");
        us = input.nextInt();
        System.out.print(taban+" üssü "+us+":"+exponents(taban,us));
    }
}