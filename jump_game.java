class Solution {
    static boolean solve(int nums[],int current,int goal){
        if(current==0&&current+nums[current]>=goal){
            return true;
        }
        if(current<0){
            return false;
        }
        if(current+nums[current]>=goal){
            goal=current;
        }
        return solve(nums,current-1,goal);
    }
    public boolean canJump(int[] nums) {
        if(nums.length==1){
            return true;
        }
        boolean ans = solve(nums,nums.length-2,nums.length-1);
        return ans;

    }
}
