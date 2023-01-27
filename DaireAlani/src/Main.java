import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r;
        int aci;
        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("YarıCap giriniz:");
        r = input.nextInt();
        System.out.print("Merkez Aci giriniz:");
        aci = input.nextInt();

        double alan = (pi*(r * r) * aci) / 360;

        System.out.println("Daire diliminin alani:"+alan);
    }
}