class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        List<Integer> list = new ArrayList<>();
        for (int num : nums2)
            binarySearch(nums1, num, list);
        return list.stream().mapToInt(i -> i).toArray();
    }

    private void binarySearch(int[] nums1, int target, List<Integer> list) {
        int left = 0, right = nums1.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums1[mid] == target) {
                list.add(nums1[mid]);
                nums1[mid] = -1;
                Arrays.sort(nums1);
                break;
            } else if (nums1[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
    }
}