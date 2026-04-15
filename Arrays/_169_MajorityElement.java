public class _169_MajorityElement {
    public int majorityElement(int[] nums) {
        int counter = 0, elem = nums[0];

        for (int num : nums) {
            if (counter == 0)
                elem = num;
            
            if (elem == num)
                ++counter;
            else
                --counter;
        }
        return elem;
    }
}
