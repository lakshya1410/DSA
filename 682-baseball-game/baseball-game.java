import java.util.*;

class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (String op : operations) {
            if (op.equals("C")) {
                arr.remove(arr.size() - 1);
            } 
            else if (op.equals("D")) {
                arr.add(2 * arr.get(arr.size() - 1));
            } 
            else if (op.equals("+")) {
                int sum = arr.get(arr.size() - 1) + arr.get(arr.size() - 2);
                arr.add(sum);
            } 
            else {
                arr.add(Integer.parseInt(op));
            }
        }
        
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
