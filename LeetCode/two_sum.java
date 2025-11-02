public class two_sum {
    public int[] twosum(int [] nums, int target)
    {
        int left = 0;
        int right = nums.length - 1;
        int sum = 0;

        while ( left <right)
        {
            sum = nums[left] + nums[right];

            if (sum == target)
            {
                return new int[] {left, right};
            }

            else if ( sum < target)
            {
                left = left + 1;
            }

            else {
                right = right - 1;
            }
        }
        
        return new int[]{-1,-1};
    }
}
