public class Main {

    static boolean isFind(int[] list, int value)
    {
        for (int arr : list)
        {
            if (arr == value)
            {
                return  true;
            }
        }
        return  false;
    }
    public static void main(String[] args) {

        int[] list = {2, 3, 4, 4, 8, 1, 2, 5, 5, 9,8};
        int[] repeatingEvenNumbers = new int[list.length];
        int counter = 0;
        for (int i = 0; i < list.length; i++)
        {
            for (int j = 0; j < list.length; j++)
            {
                if ((i != j) && list[i] == list[j])
                {
                   if (!isFind(repeatingEvenNumbers, list[i]))
                   {
                       if (list[i] % 2 == 0)
                       {
                           repeatingEvenNumbers[counter++] = list[i];
                       }
                   }
                }
            }
        }
        for (int value : repeatingEvenNumbers)
        {
            if ( value != 0)
            {
                System.out.print(value + " ");
            }
        }

    }
}