import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        int number, max;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the number of elements in the array: ");
        number = scanner.nextInt();
        int[] array = new int[number];
        System.out.println("Please, enter the elements of array: ");
        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }
        max = array[0];
        for (int i = 0; i < number; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("The largest number of array is: " + max);
    }
}
