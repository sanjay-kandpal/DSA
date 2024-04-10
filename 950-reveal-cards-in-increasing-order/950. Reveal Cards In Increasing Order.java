class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer> qt = new LinkedList<>();
        for(int i = 0 ; i < deck.length ; i++){
            qt.offer(i);
        }
        Arrays.sort(deck);
        int result[] = new int[deck.length];
        for(int i = 0 ; i < deck.length ; i++){
            result[qt.poll()] = deck[i];
            qt.add(qt.poll());
        }
        return result;
    }
}