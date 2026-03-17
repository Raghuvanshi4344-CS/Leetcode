class Solution {
    public long smallestNumber(long num) {
        if (num==0) return 0;   
        boolean isNega =num<0;
        long tem=Math.abs(num);
        int s=0;
        while(tem!=0){
            tem/=10;
            s++;
        }
        int arr[]=new int[s];
        tem=Math.abs(num);
        for(int i=0;i<s;i++){
            arr[i]=(int)(tem%10);
            tem/=10;
            System.out.println(arr[i]);
        }
        for (int i =0;i<s;i++) {
            for (int j=i+1;j<s; j++) {
                if (isNega) {
                    if (arr[i] < arr[j]) {
                        int t=arr[i];
                        arr[i]=arr[j];
                        arr[j]=t;
                    }
                } else {
                    if (arr[i] > arr[j]) {
                        int t=arr[i];
                        arr[i]=arr[j];
                        arr[j]=t;
                    }
                }
            }
        }
        long res=0;
        if(!isNega){
            int i = 0;
            while(i<s && arr[i]==0) i++;
            res=arr[i];
            if (i<s) {
                res=arr[i];
                arr[i]=0;
            }
            for (int j=0;j<s;j++) {
                if (j!=i) {
                    res=res*10+arr[j];
                }
            }
        }
        else{for(int i=0;i<s;i++){
            res=res*10+arr[i];
        }}
        if(isNega) res=-res;
        return res;
    }
}