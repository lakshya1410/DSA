

class Solution {
    public int minimumPairRemoval(int[] nums) {
        if (isSorted(nums)) return 0;

        int cnt = 0;
        List<Integer> list = new ArrayList<>();
        for (int num : nums) list.add(num); 

        while (!isSortedList(list)) {
            int minSum = Integer.MAX_VALUE;
            int mi = -1;

            for (int i = 0; i < list.size() - 1; i++) {
                int curSum = list.get(i) + list.get(i + 1);
                if (curSum < minSum) {
                    minSum = curSum;
                    mi = i;
                }
            }

            
            list.set(mi, list.get(mi) + list.get(mi + 1));
            list.remove(mi + 1);
            cnt++;
        }

        return cnt;
    }

    public static boolean isSorted(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSortedList(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
