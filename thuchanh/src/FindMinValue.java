public class FindMinValue {
    public static void main(String[] args) {
        int[] arr = {10, 6, 9, 8, 7, 14, 5};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }

    public static int minValue(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < max) {
                max = array[i];
            }
        }
        return max;
    }
}
