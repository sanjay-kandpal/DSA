class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> sandwich = new Stack<>();
        Queue<Integer> student = new LinkedList<>();
        for(int i = 0 ; i< students.length ; i++){
            student.offer(students[i]);
            sandwich.push(sandwiches[sandwiches.length - i - 1]);
        }

        // 
        int lastserved = 0;
        while(student.size() > 0 && lastserved  < student.size()){
            if(student.peek() == sandwich.peek() ){
                student.poll();
                lastserved = 0;
                sandwich.pop();
            }else{
                lastserved++;
                student.offer(student.poll());

            }
        }
        return sandwich.size();
    }
}