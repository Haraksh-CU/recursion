import java.util.*;
class subset_recursion {
    private static void solve(int[] nums, List<Integer> output, int index, List<List<Integer>> ans) {
        // Base case
        System.out.println("current index from line 5: " + index);
        if (index >= nums.length) {
            System.out.println("output array from base case: " + output);
            ans.add(new ArrayList<>(output));
            return;
        }

        // Exclude
        solve(nums, output, index + 1, ans);
        System.out.println("current index from line 14: " + index);
        // Include
        int element = nums[index];
        output.add(element);
        solve(nums, output, index + 1, ans);
        System.out.println("current index from line 19: " + index);

        // Backtrack
        output.remove(output.size() - 1);
        System.out.println("output list after backtrack: " + output);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        solve(nums, output, index, ans);
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3 };
        List<List<Integer>> ans = new ArrayList<>();
        ans = subsets(nums);
        System.out.println("ans: " + ans);
        
    }
}