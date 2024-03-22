public class binarysearch_recursion {
    static boolean search(int arr[], int s,int e, int key) {
        int mid = s+(e -s) / 2;
        if (s>e) {
            return false;
        }
        if (arr[mid] == key) {
            return true;
        }
        else if (arr[mid] > key) {
            return search(arr, s, mid - 1, key);
        }
        else {
            return search(arr, mid + 1, e, key);
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,10,14,18};
        int s = 0;
        int e = arr.length-1;
        int key = 0;
        boolean ans = search(arr, s,e, key);
        System.out.println("key->" + key + " found status: " + ans);
    }
}
