package BaiTap2702;

import java.util.Scanner;

public class LargestNumberArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 10 phần tử của mảng: ");
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        for (int i = 0; i < 10; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Số lớn nhất trong mảng là: " + max);
    }
}
