public class EvenOddDemo {
    public static void main(String[] args) {
        evenOrOdd(55);
    }

    static void evenOrOdd(int x) {
        if (x % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}