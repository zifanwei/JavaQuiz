public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {2,5,8,10,25};
        int k = 25;
        search(arr, k, 0, arr.length-1);
    }

    private static boolean search(int[] arr, int k, int low, int high) {
        if (low > high) {
            return false;
        }
        // 获取当前array的中位数
        int mid = (low + high) / 2; // index
        int temp = arr[mid]; // value
        System.out.println("low: "+ low + ", high: " + high + ", temp: "+ temp);

        if (k == temp) {
            return true;
        } else if (k < temp) {
            return search(arr, k, low, mid-1);
        } else {
            return search(arr, k, mid+1, high);
        }
    }
}
