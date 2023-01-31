import java.util.Scanner;

public class Main {
    static int primeNumber(int number, int i)
    {
        if(i != 1)
        {
            if (number % i != 0)
            {
                return primeNumber(number, i - 1);
            }
            return 0;
        }
        return  1;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        int result;
        System.out.print("Please enter a number:");
        number = input.nextInt();
        result = primeNumber(number, number/2);
      if (result == 1)
      {
          System.out.print("it's a prime");

      }
      else {
          System.out.print("Not a prime");

      }
    }
}