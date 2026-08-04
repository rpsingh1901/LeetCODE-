import java.util.Arrays;
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> missing = new ArrayList<>();
       Arrays.sort(nums);
       int p = 0;
       for(int k = nums[0] ; k<nums[nums.length-1] ;k++){
        if (k == nums[p] )
        p++;
        else 
        missing.add(k);
       }

    return missing ;
    }
}