class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        int arr[]=new int[32];
        int i=0;
        while(n>0){
            arr[i++]=n%2;
            n/=2;
        }
        for(int j=0;j<i;j++){
            if(arr[j]==1) arr[j]=0;
            else arr[j]=1;
        }
        int res=0;
        int k=0;
        for(int j=0;j<i;j++){
            res+=Math.pow(2,j)*arr[j];
            k++;
        }
        return res;
    }
}