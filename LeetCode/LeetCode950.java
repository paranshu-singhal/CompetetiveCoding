import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {

        int n = deck.length;
        
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n; i++){
            q.add(i);
        }
        
        Arrays.sort(deck);
        int[] result=new int[n];

        for(int card: deck){
            result[q.poll()] = card;
            if(!q.isEmpty()){
                q.add(q.poll());
            }
        }
        return result;
        
    }
}