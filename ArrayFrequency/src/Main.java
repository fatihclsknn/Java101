import java.util.Arrays;

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

        int[] list = {2, 2,2,1,1,1,4};
        Arrays.sort(list);
        int[] newArray = new int[list.length];
        int count;
        for (int i = 0; i < list.length; i++)
        {
            count = 1;
            if (!isFind(newArray, list[i]))
            {
                   newArray[i] = list[i];
                for (int j = i + 1; j < list.length; j++) {
                    if (list[i] == list[j]) {
                        count++;
                    }
            }
                System.out.println("The number " + list[i] + " is repeated " + count + " times.");


            }


        }
    }
}
