class Solution {
    public boolean hasAlternatingBits(int n) {
        int prev=n%2;
        n=n/2;

        while(n>0){
            int curr=n%2;
            if(curr==prev) return false;
            prev=curr;
            n=n/2;
        }

        return true;
        // int x=0;
        // int y=0;
        // while(n>0){
        //     x=n%2+x*10;
        //     n=n/2;
        //     y++;
        // }

        // int a=0;
        // while(x>0){
        //     a=x%10+a*10;
        //     x=x/10;
        // }

        // int arr[]=new int[y];
        // for(int i=0;i<y;i++){
        //     arr[i]=a%10;
        //     a=a/10;
        // }

        // for(int i=1;i<y;i++){
        //     if(arr[i-1] == arr[i]){
        //         return false;
        //     }
        // }
        // return true;
    }
}