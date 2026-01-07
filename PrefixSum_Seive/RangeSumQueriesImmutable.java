package PrefixSum;

public class RangeSumQueriesImmutable {
    class NumArray {
        private int[] pre;
        public NumArray(int[] nums) {
            pre = new int[nums.length];
            pre[0] = nums[0];
            for(int i=1;i<nums.length;i++){
                pre[i] = pre[i-1] + nums[i];
            }
        }

        public int sumRange(int left, int right) {
            if(left==0) return pre[right];
            return pre[right] - pre[left-1];
        }
    }
}
