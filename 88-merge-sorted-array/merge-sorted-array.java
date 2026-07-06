class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n)
     {
       int left = m-1;
       int right = n-1;
       int tol = m+n-1;
       while(right>=0){
        if(left>=0 && nums1[left]>=nums2[right]){
            nums1[tol] = nums1[left];
            tol--;
            left--;
            
        }
        else{

            nums1[tol] = nums2[right];
            tol--;
            right--;
        }
       }
    }
}