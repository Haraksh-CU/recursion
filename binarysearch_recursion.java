public class binarysearch_recursion {
    static boolean search(int arr[], int s,int e, int key) {
        int mid = (s + e) / 2;
        boolean b;
        if (!(s >= 0 && s <= arr.length - 1 && e >= 0 && e <= arr.length - 1)) {
            return false;
        }
        if (arr[mid] == key) {
            return true;
        }
        else if (arr[mid] > key) {
            b = search(arr, s, mid - 1, key);
        }
        else {
            b = search(arr, mid + 1, e, key);
        }
        return b;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,10,14,18};
        int s = 0;
        int e = arr.length-1;
        int key = 4;
        boolean ans = search(arr, s,e, key);
        System.out.println("key->" + key + " found status: " + ans);
    }
}
