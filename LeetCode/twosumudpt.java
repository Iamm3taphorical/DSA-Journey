import java.util.HashMap;

class Solution
{
    public int[] twoSum(int[] nums, int target)
    {
        HashMap<Integer, Integer> index_map_var = new HashMap<>();
        int i_var = 0;

        while (i_var < nums.length)
        {
            int curr_var = nums[i_var];
            int complement_var = target - curr_var;

            if (index_map_var.containsKey(complement_var))
            {
                return new int[]{ index_map_var.get(complement_var), i_var };
            }

            index_map_var.put(curr_var, i_var);
            i_var++;
        }

        return new int[]{ -1, -1 }; 
    }
}
