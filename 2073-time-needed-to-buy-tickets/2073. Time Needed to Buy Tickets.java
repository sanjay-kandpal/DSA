import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count = 0;
        Queue<Integer> ticket = new LinkedList<>();
        for (int i = 0; i < tickets.length; i++) {
            ticket.offer(i);
        }
        
        while (ticket.size() > 0) {
            int element = ticket.poll();
            count++;
        
            tickets[element]--;
            if(element == k && tickets[element] == 0){
                return count;
            }
            if(tickets[element] != 0){
                ticket.offer(element);
            }
            
        }
        return count;
    }
}
