import java.util.Scanner;

public class Main {
    static void patternRecursive(int number)
    {

        System.out.print(number +"  ");
        if (number <= 0)
            return;
        patternRecursive(number - 5);
        System.out.print(number +"  ");

    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Please enter a number:");
        number = input.nextInt();
        patternRecursive(number);
    }
}