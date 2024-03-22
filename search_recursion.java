public class search_recursion {
    static boolean search(int arr[], int size, int key) {
        if (size == 0) {
            return false;
        }
        if (arr[size - 1] == key) {
            return true;
        }
        size--;
        boolean s = search(arr, size, key);
        return s;
    }
    public static void main(String[] args) {
        int arr[] = { 3, 5, 1, 2, 6 };
        int size = 5;
        int key = 4;
        boolean ans = search(arr, size, key);
        System.out.println("key->" + key + " found status: " + ans);
    }
}
