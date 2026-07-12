class Solution {
    public void swap(int i ,int j,int nums[]){
        int temp = nums[i] ;
        nums[i]= nums[j];
        nums[j]=temp;
    }
    public void sortColors(int[] nums) {
        // dutch national Flag Algorithm
        int start=0;
        int middle=0;
        int end=nums.length-1;

        //        Middle    end
        //         |         | 
        // nums = [2,0,2,1,1,0]
        //         |
        //        Start

        // Middle pointer is the main pointer which traverse the whole array and tracks all the elements
        // Start Ponter tracks the 0 in the array 
        // end Pointer tracks the 2 in the array
        // whenever middle counters 0 or 2 swap with their existing tracking pointer
        // logic 
        //case o: swap with the element at start pointer, start+, middle++ 
        //case 1: no swapping, middle++ 
        //case 2: swap with the end pointer, end--
        while(middle<=end){
            switch(nums[middle]){
                case 0:
                swap(middle,start,nums);
                start++;
                middle++;
                break;

                case 1:
                middle++;
                break;

                case 2:
                swap(middle,end,nums);
                end--;
                break;
            
            }
            

        }

    }
}