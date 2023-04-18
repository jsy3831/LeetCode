class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) return mid;

            // left half sorted
            if (nums[low] <= nums[mid]) {
                if (target >= nums[low] && target < nums[mid])
                    high = mid - 1;
                else
                    low = mid + 1;

            }
            // right half sorted
            // i.e. nums[mid] <= nums[high]
            else {
                if (target <= nums[high] && target > nums[mid])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }

        return -1;
    }
}