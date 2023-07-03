class Solution {
    public int[] twoSum(int[] nums, int target) {
        
    HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            //the formula we need to compute our target
            int complement = target - nums[i];
            
            //if our map has the complement we found the pair  
            if (map.containsKey(complement)) {
                //now we add the pair to an array to return as our answer
                return new int[]{map.get(complement), i};
            }
            //if we haven't found the complement yet, we can store the value and index to keep iterating
            map.put(i,nums[i]);
        }
        //if there is no solution, print this error
        throw new IllegalArgumentException("No two sum solution found.");
    }
}