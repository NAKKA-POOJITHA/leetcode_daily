import java.util.Arrays;
class Solution {
    public int minimumDeletions(int[] nums) {
      if(nums.length<3){
            return nums.length;
      }
      int mini=nums[0], maxi=nums[0], maxind=0,minind=0;
      for(int i=0;i<nums.length;i++){
       if(nums[i]>maxi){
        maxi=nums[i];
         maxind=i;
       }
       if(nums[i]<mini){
        mini=nums[i];
         minind=i;
       }
      }
      return Math.min(Math.min( nums.length-Math.min(maxind,minind),Math.max(maxind+1,minind+1)),nums.length-Math.abs(maxind - minind)+1);
        
    }
}