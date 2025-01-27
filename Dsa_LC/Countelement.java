public class Countelement {
    public static int firstOccurrence(int arr[], int ele) {
        int start = 0, end = arr.length - 1;
        int res = -1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (ele == arr[mid]) {
                res = mid; // Update result
                end = mid - 1; // Continue searching on the left side
            } else if (ele < arr[mid]) {
                end = mid - 1; // Search in the left half
            } else {
                start = mid + 1; // Search in the right half
            }
        }
        return res;
    }

    // Method to find the last occurrence of an element
    public static int lastOccurrence(int arr[], int ele) {
        int start = 0, end = arr.length - 1;
        int res = -1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (ele == arr[mid]) {
                res = mid; // Update result
                start = mid + 1; // Continue searching on the right side
            } else if (ele < arr[mid]) {
                end = mid - 1; // Search in the left half
            } else {
                start = mid + 1; // Search in the right half
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] num = {2, 4, 10, 10, 10,10,10, 18, 20};
        int ele = 10;

        int first = firstOccurrence(num, ele);
        int last = lastOccurrence(num, ele);

        int count_element =last-first +1;
        System.out.println(count_element);

        
    }
}
