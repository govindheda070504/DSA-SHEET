class Solution {
    public int majorityElement(int[] nums) {
        
        //boyer -moore voter Algorithm 

        int count = 0;
        int majority=0;// we can initialise the variable with any value because initially the count is 0 and the first if condition would aasign the value of majority 

        // simple logic behind this question is 
        // step1: consider the first element of the array as majority and increase the count 
        // step2: now traverse the array if the same elements comes next increase the count(vote) by 1 if differnt element decrease the vote by 1 
        // step3: if count= 0 initialise the value of majority with the next element that comes next;
        for(int i=0;i<nums.length;i++){
            if(count == 0){
                majority = nums[i];
            }
            if(majority==nums[i]){
                count++;
            }
            else{
                count--;
            }

        }
        return majority;
    }
}