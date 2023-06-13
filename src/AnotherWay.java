public class AnotherWay {

    public static void main(String[] args) {
        int [] array = new int[] {45, 76, 88, 287, 2, 32, 745};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Array has those numbers: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("The largest number of array is: " + max);
    }
}
