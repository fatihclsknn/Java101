public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        double harmaonic = 0;
        for (int i = 0; i < numbers.length; i++) {
            harmaonic += (1.0 / (i + 1));
        }
        System.out.println("Harmonik ortlama:"+ (numbers.length / harmaonic));
    }
}