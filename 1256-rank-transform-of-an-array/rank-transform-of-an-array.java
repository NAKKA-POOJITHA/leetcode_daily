class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        int[]index=Arrays.copyOf(arr,arr.length);
        Arrays.sort(index);
        HashMap<Integer,Integer> match=new HashMap<>();
        int r=1;
        for(int i:index){
            if(!match.containsKey(i)){
                match.put(i,r++);
            }
            
        }
        for(int i=0;i<n;i++){
             arr[i]=match.get(arr[i]);
        }
        return arr;
    }
}