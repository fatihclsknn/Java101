import java.util.Scanner;

public class Main {

    static int[] fillArray(int count)
    {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[count];
        for (int i = 0; i < count; i++)
        {
            System.out.print(i+1+". Elemanı:");
            int number = input.nextInt();
            arr[i] = number;
        }
        return  arr;
    }
    static void printArray(int[] arr)
    {

        for (int value : arr)
        {
            System.out.print(value + " ");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin Boyutu n:");
        int n = input.nextInt();
       int[] list = fillArray(n);
        System.out.println("Before");

        printArray(list);
        System.out.println("\nAfter");

        int[] sortedArray = new int[list.length];

        for (int i = 0; i < list.length; i++)
       {
           for (int j = i +1 ; j < list.length; j++)
           {
               int temp = 0;
               if (list[i] > list[j])
               {
                   temp = list[i];
                   list[i] = list[j];
                   list[j] = temp;
               }
           }
           sortedArray[i] = list[i];

       }
        printArray(sortedArray);
    }
}