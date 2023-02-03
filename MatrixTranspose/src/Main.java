public class Main {
    public static void main(String[] args) {

        int[][] a = {
                     {1,2,3},
                     {4,5,6}
        };
        int[][] aTranspose = new int[a[0].length][a.length];
        for (int i = 0; i < a[0].length; i++)
        {
            for (int j = 0 ; j < a.length; j++)
            {
                aTranspose[i][j] = a[j][i];
            }
        }

        for (int i = 0; i < aTranspose.length ; i++)
        {
            for (int j = 0; j < aTranspose[0].length; j++)
            {
                System.out.print(aTranspose[i][j] +" ");
            }
            System.out.println();

        }
    }
}