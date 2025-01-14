package Arrays;

public class FirstMissingPostive {
    public static int segregate(int[] arr) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        return i;
    }

    public static int findMissing(int[] arr) {
        int shift = segregate(arr);
        int[] arr2 = new int[arr.length - shift];
        int j = 0;
        for (int i = shift; i < arr.length; i++) {
            arr2[j] = arr[i];
            j++;
        }
        return findMissingPostive(arr2, j);
    }

    public static int findMissingPostive(int[] arr, int size) {
        int i;
        for (i = 0; i < size; i++) {
            int x = Math.abs(arr[i]);
            if (x - 1 < size && arr[x - 1] > 0) {
                arr[x - 1] = -arr[x - 1];
            }
        }
        for (i = 0; i < size; i++) {
            if (arr[i] > 0) {
                return i + 1;
            }
        }
        return size + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 10, 2, -10, -20 };
        System.out.println(findMissing(arr));
    }
}
