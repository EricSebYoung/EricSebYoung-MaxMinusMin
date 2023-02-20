
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        int max = 0;
        int min = 0;

        boolean valuesSet = false;

        for (int current: nums) {
            if (current > max || !valuesSet) {
                max = current;
            }

            if (current < min || !valuesSet) {
                min = current;
            }

            valuesSet = true;
        }

        return max - min;
    }
}
