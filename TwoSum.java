import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target){ 
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            indexMap.put(nums[i], i);  
        }
        for (int i = 0; i < nums.length - 1; i++){
            Integer j = indexMap.get(target - nums[i]);
            if (j != null && j != i){
                return new int[] {i, j};           
            }
        }
        return null;
    }
}
