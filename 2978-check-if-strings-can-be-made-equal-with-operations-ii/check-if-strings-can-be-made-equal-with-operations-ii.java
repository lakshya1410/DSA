class Solution {
    public boolean checkStrings(String s1, String s2) {
        int n=s1.length();
        int e1[]= new int[n];
        int o1[]=new int [n];
        int ind=0;
        for(int i=0;i<n;i+=2){
            e1[ind]=s1.charAt(i);
            ind++;
        }
        ind=0;
         for(int i=1;i<n;i+=2){
            o1[ind]=s1.charAt(i);
            ind++;
        }
        int e2[]= new int[n];
        int o2[]=new int [n];
       ind=0;
        for(int i=0;i<n;i+=2){
            e2[ind]=s2.charAt(i);
            ind++;
        }
        ind=0;
         for(int i=1;i<n;i+=2){
            o2[ind]=s2.charAt(i);
            ind++;
        }
        Arrays.sort(e1);
         Arrays.sort(e2);
          Arrays.sort(o1);
           Arrays.sort(o2);

           return Arrays.equals(e1,e2) && Arrays.equals(o1,o2);


    }
}