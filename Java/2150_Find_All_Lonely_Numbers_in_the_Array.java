/*
LeetCode Problem: 2150. Find All Lonely Numbers in the Array
Difficulty: Medium

Approach:
1. Sort the array so that duplicate and consecutive numbers become adjacent.
2. Traverse the sorted array.
3. For each element:
   - Check if the left neighbor is neither the same value nor one less.
   - Check if the right neighbor is neither the same value nor one greater.
4. If both conditions are true, the current number is lonely.
5. Add it to the result list.

Time Complexity: O(n log n)
Space Complexity: O(1) (excluding the output list)
*/

class Solution {
    public List<Integer> findLonely(int[] nums) {
        List <Integer> lonely=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<=n-1;i++){
            boolean left=(i==0)||(nums[i-1] != nums[i]) && nums[i-1]!=nums[i]-1;
            boolean right=(i==n-1)||(nums[i+1 ]!= nums[i]) && nums[i+1] != nums[i]+1;
            if(left&&right){
                lonely.add(nums[i]);
            }
        }
        return lonely;
        
    }
}