class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Set<Integer> set = new HashSet<>();

        for (int num : nums2) {
            if (binarySearch(nums1, num)) {
                set.add(num);
            }
        }

        int[] res = new int[set.size()];
        int idx = 0;

        for (Integer num : set) {
            res[idx++] = num;
        }

        return res;
    }

    private boolean binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target)
                return true;
            else if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return false;
    }
}