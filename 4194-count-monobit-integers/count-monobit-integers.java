class Solution {
    public int countMonobit(int n) {
        int cnt=0;
        for(int i=0;i<=n;i++){
            String binaryString = Integer.toBinaryString(i);
            if(isMonobit(binaryString)) cnt++;
        }
        return cnt;
    }
    public static boolean isMonobit(String binary) {
    if (binary == null || binary.length() == 0) {
        return false;
    }

    char first = binary.charAt(0);

    if (first != '0' && first != '1') {
        return false;
    }

    for (int i = 1; i < binary.length(); i++) {
        if (binary.charAt(i) != first) {
            return false;
        }
    }
    return true;
}
}