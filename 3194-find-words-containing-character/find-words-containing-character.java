class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> index=new ArrayList<>();
        for(int i=0;i<words.length;i++){
           if(words[i].contains(""+x)){
            index.add(i);
           }
        }
    return index;
    }
}