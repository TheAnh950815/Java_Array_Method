public class FindsMax_TwoDimensional_Array {
    public static void main(String[] args) {
        int[][] array={
                {1,2,5,6,8},
                {1,5,8,6,8,9}
        };
        int max=array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]>max)
                    max=array[i][j];
            }
        }
        System.out.println(max);
    }
}
