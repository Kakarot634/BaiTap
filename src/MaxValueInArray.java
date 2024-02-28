public class MaxValueInArray {
    public static int findMaxValue(int[] arr){
        if(arr.length == 0){
            throw new IllegalArgumentException("Mảng không có phân tử");
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 9, 11, 13, 15, 17, 19, 21, 23};
        int maxValue = findMaxValue(arr);
        System.out.println("Giá trị lớn nhất trong mảng là: " + maxValue);
    }
}
