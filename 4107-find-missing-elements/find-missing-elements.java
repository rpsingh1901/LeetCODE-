import java.util.Arrays;
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> missing = new ArrayList<>();
       Arrays.sort(nums);
       int p = 0;
       int i = nums[0];
       int j = nums[nums.length-1];
       for(int k = i ; k<j ;k++){
        if (k == nums[p] )
        p++;
        else 
        missing.add(k);
       }

    return missing ;
    }
}