class Solution {
    public int minOperations(String[] logs) {
        int count = 0;
        int i = 0;
        while( i < logs.length){
            if(!logs[i].equals("../") && !logs[i].equals("./")){
                count++;
                i++;
            }else if(logs[i].equals("../")){
                if(count > 0){
                    count--;
                }
                i++;
            }
            else{
                i++;
            }
        }
        
        return count;
        
    }
}