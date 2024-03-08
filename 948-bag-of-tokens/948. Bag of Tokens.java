class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score = 0;
        int begin = 0;
        int end = tokens.length - 1;
        while(begin <= end){
            if(tokens[begin] <= power){
                power -= tokens[begin];
                score++;
                begin++;
            }else if(begin < end && score > 0){
                power += tokens[end];
                score--;
                
                end--;
            }else{
                return score;
            }
        }
        return score;
    }
}