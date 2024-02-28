import java.util.Arrays;

public class ArrayReversal {
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap phần tử đầu và cuối
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Di chuyển vị trí bắt đầu và kết thúc
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Mảng ban đầu: " + Arrays.toString(arr));

        reverseArray(arr);

        System.out.println("Mảng sau khi đảo ngược: " + Arrays.toString(arr));
    }
}
