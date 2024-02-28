public class ArraySearch {
    public static int findValue(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 5;

        int index = findValue(arr, target);

        if (index != -1) {
            System.out.println("Giá trị " + target + " được tìm thấy tại vị trí " + index + " trong mảng.");
        } else {
            System.out.println("Giá trị " + target + " không được tìm thấy trong mảng.");
        }
    }
}
