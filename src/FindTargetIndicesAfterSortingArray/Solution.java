package FindTargetIndicesAfterSortingArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> targetIndices = new ArrayList<>();
        int count = 0;

        for(int num : nums){
            if (num == target){
                targetIndices.add(count);
            }
            count++;
        }

        return targetIndices;
    }
}
