class Solution {
    public boolean asteroidsDestroyed(int tmass, int[] asteroids) {
        Arrays.sort(asteroids);
        long mass = tmass;
        for( int ast : asteroids ){
            if(ast <=mass){
               mass+=ast;
            }
           else return false;
            
        }
        return true;
    }

}