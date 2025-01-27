public class Find_Minimum_in_Rotated_Sorted_Array {
    
        public static int findMin(int[] nums) {
            int n=nums.length;
            int start=0,end=n-1;
            while(start<=end){
                if (nums[start]<nums[end]) return nums[start];
                int mid =start+((end-start)/2);
                int next=(mid+1)%n;
                int prev=(mid+n-1)%n;
                if (nums[mid]<=nums[next]&&nums[mid]<=nums[prev]) return nums[mid];
    
                if (nums[start]<=nums[mid]) start=mid+1;
                if (nums[end]>=nums[mid]) end=mid-1;
            }
            return -1;
        }
        public static void main(String[] args) {
            int arr[]={3,4,5,1,2};
            int res=findMin(arr);
            System.out.println(res);
        }
        
        
}
