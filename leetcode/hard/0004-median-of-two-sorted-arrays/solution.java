class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int arr[]=new int[n1+n2];

        for(int i=0;i<n1;i++)arr[i]=nums1[i];

        for(int i=0;i<n2;i++)arr[n1 + i] = nums2[i];
        Arrays.sort(arr);

        int n= n1+n2;
        if(n%2 == 1)return arr[n/2];
        else{
            int v1= arr[n/2];
            int v2= arr[n/2-1];
            return (v1+v2)/2.0;
        }
    }
}