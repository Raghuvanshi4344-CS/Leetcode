class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";
        int []res=new int[num1.length()+num2.length()];

        for (int i=num1.length()-1;i>=0;i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
                int n1=num1.charAt(i)-'0';
                int n2=num2.charAt(j)-'0';
                int sum=n1*n2+res[i+j+1];
                res[i + j + 1]=sum % 10;   
                res[i + j]+=sum / 10;      
            }
        }
        StringBuilder result=new StringBuilder();
        for (int num : res) {
            if (!(result.length()==0 && num==0)) {
                result.append(num);
            }
        }
        return result.toString();
    }
}