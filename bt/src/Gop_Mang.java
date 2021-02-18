public class Gop_Mang {
    public static void main(String[] args) {

        int[] a={1,2,4,6};
        int[] b={5,8,9,7,9};
        int[] c= new int[a.length+ b.length];
        for (int i = 0; i < a.length; i++) {
           c[i]=a[i];
        }
        int j=0;
            for (int i = a.length; i < c.length; i++) {
                c[i] = b[j];
                j++;
            }
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
