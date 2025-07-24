class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int arr[]=new int[n+m];
        for(int i=0;i<nums1.length;i++){
            arr[i]=nums1[i];
        }
        int i=n-1,j=m-1,k=m+n-1;
        while(i>=0 && j>=0){
            if(arr[i]>nums2[j]){
                arr[k--]=arr[i--];
            }
            else{
                arr[k--]=nums2[j--];
            }
        }
        while(j>=0){
            arr[k--]=nums2[j--];
        }
        for(i=0;i<n+m;i++){
            System.out.println(arr[i]);
        }
        int in=n+m;
        if(in%2==1) return (double)arr[in/2];
        else{
            double x=(arr[in/2-1]+arr[in/2])/2.0;
            return x;
        }
    }
}