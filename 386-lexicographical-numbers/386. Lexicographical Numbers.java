class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> LexicOrder = new ArrayList<>();
        for(int start = 1; start <= 9; start++ ){
            generateLexicOrder(start,n,LexicOrder);
        }
        return LexicOrder;
    }
    public void generateLexicOrder(int currentNumber,int limit,List<Integer> result){
        if( currentNumber > limit){
            return;
        }

        result.add(currentNumber);
        for(int i = 0 ; i<= 9 ; i++){
            int newCurrent = currentNumber*10 +i;
            if(newCurrent <= limit){
                generateLexicOrder(newCurrent,limit,result);
            }else{
                break;
            }
            
        }
    }
}