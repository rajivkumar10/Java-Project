package datastructures.search;

public class BinarySearch {


    public boolean binarySearchIterative(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;


        while (left <=  right) {
            int mid = (left + right) / 2;
            if (arr[mid] == x) {
                return true;
            } else if (x < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    private boolean binarySearchRecursive(int[] arr, int x, int left, int right) {
        if (left > right) {
            return false;
        }

        int mid = (left + right) / 2;
        if (arr[mid] == x) {
            return true;
        } else if (x < arr[mid]) {
            return binarySearchRecursive(arr, x, left, mid -1);
        } else {
            return binarySearchRecursive(arr, x, mid + 1, right);
        }
    }

    public boolean binarySearchRecursive(int[] arr, int x) {
        return binarySearchRecursive(arr,  x, 0, arr.length -1);
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 37, 48, 52, 69};
        BinarySearch search = new BinarySearch();
        System.out.println("Recursive search 5: " + search.binarySearchRecursive(arr, 5));
        System.out.println("Iterative search 5: " + search.binarySearchIterative(arr, 5));
        System.out.println("Recursive search 52: " + search.binarySearchIterative(arr, 52));
        System.out.println("Iterative search 20: " + search.binarySearchRecursive(arr, 20));

    }
}
