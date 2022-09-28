public class Main {
    public static void main(String[] args) {
        findNum();

    }

    public static void findNum() {
        int nums[] = {1, 2, 3, 4, 5, 6, 7};
        int num = 8;
        boolean isThere = false;
        for (int n : nums) {
            if (n == num) {
                isThere = true;
                break;
            }
        }
        if (isThere) {
            printMessage("The number is available: " + num);
        } else {
            printMessage("The number is not available: " + num);
        }
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}
