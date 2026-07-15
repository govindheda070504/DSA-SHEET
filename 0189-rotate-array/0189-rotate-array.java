class Solution {
    public void reverse (int nums[],int left,int right){
        while(right>left){
            int temp = nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
    public void rotate(int[] nums, int k) {
        
        //approach

        // Reverse the entire array.
        // Reverse the first k elements.
        // Reverse the remaining elements.

        int n = nums.length;
        k= k % n; // this step help us to eliminate the whole rotation of an array

        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
}