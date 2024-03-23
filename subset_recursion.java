import java.util.*;
class subset_recursion {
    private void solve(int[] nums, List<Integer> output, int index, List<List<Integer>> ans) {
        // Base case
        if (index >= nums.length) {
            ans.add(new ArrayList<>(output));
            return;
        }

        // Exclude
        this.solve(nums, output, index + 1, ans);

        // Include
        int element = nums[index];
        output.add(element);
        this.solve(nums, output, index + 1, ans);

        // Backtrack
        output.remove(output.size() - 1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        this.solve(nums, output, index, ans);
        return ans;
    }
}