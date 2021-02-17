import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int n, i, c;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n <= 0);
        int arr[] = new int[n];
        System.out.println("Nhập các phần tử cho mảng: ");
        for (i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Nhập số muốn xóa x: ");
        int x = scanner.nextInt();
        for (c = i = 0; i < n; i++) {
            if (arr[i] != x) {
                arr[c] = arr[i];
                c++;
            }
        }
        n = c;
        System.out.println("Mảng mới là: ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
