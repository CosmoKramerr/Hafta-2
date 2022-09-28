public class Main {
    public static void main(String[] args) {
        String message = "The weather is lovely today.";
        String newMassage = nameACity();
        System.out.println(newMassage);
        System.out.println(sum(5, 7));

    }

    public static void add() {
        System.out.println("Added.");

    }

    public static void remove() {
        System.out.println("Removed.");
    }

    public static void update() {
        System.out.println("Updated.");
    }

    public static String nameACity() {
        return "Barcelona";
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

}
