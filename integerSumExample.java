import java.util.Scanner;

public class integerSumExample {
    public static void main(String[] args) {
        positiveNumbers();
        negativeNumbers();
        inputs();
        inputsFloats();
    }

    public static void positiveNumbers() {
        int a = 65;
        int b = 35;
        System.out.println("The sum of a and b is = " + Integer.sum(a, b));
    }

    public static void negativeNumbers() {
        int a = -65;
        int b = -135;
        System.out.println("The sum of a and b is = " + Integer.sum(a, b));
    }

    public static void inputs() {
        //only full numbers in the inputs
        System.out.println("Enter the Two numbers for addtion: ");
        Scanner readInput = new Scanner(System.in);
        int a = readInput.nextInt();
        int b = readInput.nextInt();
        System.out.println("The sum of a and b is = " + Integer.sum(a, b));
    }

    public static void inputsFloats() {
        //can use floats with the inputs
        Scanner readInput = new Scanner(System.in);
        System.out.print("First Number: ");
        float a = readInput.nextFloat();
        System.out.print("Second Number: ");
        float b = readInput.nextFloat();
        readInput.close();
        // It will return the sum of a and b.
        System.out.print("The sum of a and b is = " + Float.sum(a, b));
    }
}
