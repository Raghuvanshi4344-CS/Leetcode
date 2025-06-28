class Solution {
    public String[] findRelativeRanks(int[] arr) {
        int idx[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            idx[i]=i;
        }
        String re[]=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[idx[i]]>arr[idx[j]] ){
                    int temp=idx[i];
                    idx[i]=idx[j];
                    idx[j]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(i==0){
                re[idx[i]]="Gold Medal";
            }
            else if(i==1){
                re[idx[i]]="Silver Medal";
            }
            else if(i==2){
                re[idx[i]]="Bronze Medal";
            }
            else{
                re[idx[i]]=String.valueOf(i+1);
            }
        }
        return re;
    }
}