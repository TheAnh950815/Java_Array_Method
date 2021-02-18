import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n <= 0);
        int arr[] = new int[n+1];
        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Nhập số cần thêm: ");
        int x = scanner.nextInt();
        System.out.println("Nhập vị trí muốn thêm: ");
        int index = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            if (index == i)
                break;
        }
        for (int i = n; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = x;
        for (int i = 0; i < n+1; i++) {
            System.out.println(arr[i]);
        }

    }
}
