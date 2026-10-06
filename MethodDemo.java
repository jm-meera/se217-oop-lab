public class MethodDemo {
    public static void main(String[] args) {
        System.out.println("Program Start:");
        sayHi();
    }

    int getSum(int x, int y) {
        int sum = x + y;

        return sum;
    }

    static void sayHi() {
        System.out.println("Hi");
    }
}