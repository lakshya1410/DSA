class Solution {
    public double angleClock(int hour, int minutes) {
        double min=6.0* minutes;
        double ho = 30.0*hour + 0.5*minutes;
        double diff=Math.abs(min-ho);
        return Math.min(diff,360.0-diff);
    }
}