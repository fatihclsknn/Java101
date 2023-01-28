import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int     number1;
        int     number2;
        char    operation;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz:");
        number1 = input.nextInt();
        System.out.print("İkinci sayiyi giriniz:");
        number2 = input.nextInt();
        System.out.print("Toplama:+\tÇıkarma:-\tÇarpma:*\tBölme:/ \n");
        System.out.print("Seçiminiz:");
        operation = input.next().charAt(0);
        try {
            switch (operation)
            {
                case '+':
                    System.out.println(number1 +"+"+ number2 +"="+(number1+number2));
                    break;
                case '-':
                    System.out.println(number1 +"-"+ number2 +"="+(number1-number2));
                    break;
                case '*':
                    System.out.println(number1 +"*"+ number2 +"="+(number1*number2));
                    break;
                case '/':
                    System.out.println(number1 +"-"+ number2 +"="+(number1/number2));
                    break;
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }


    }
}