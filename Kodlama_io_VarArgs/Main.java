public class Main {
    public static void main(String[] args) {
        int sum = sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(sum);

    }

    public static int sum(int... nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        return sum;


    }
}
