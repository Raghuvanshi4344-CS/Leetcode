class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                st.pop();      
            }
            else if(operations[i].equals("D")){
                st.push(2*st.peek());
            }
            else if(operations[i].equals("+")){
                int tem=st.pop();
                int su=tem+st.peek();
                st.push(tem);
                st.push(su);
            }
            else st.push(Integer.parseInt(operations[i]));
        }
        int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}