class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int mul=1;
        int r;
        int temp=n;
        while (n>0){
          r=n%10;
          sum=sum+r;
          mul=mul*r;
          n=n/10;
        }
       return temp % (sum+mul)==0;
    }
}