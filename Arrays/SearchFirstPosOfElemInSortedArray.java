import java.util.*;

public class SearchFirstPosOfElemInSortedArray {
	public static void main(String[] args) {
		int arr[]= {4,5,6,7,0,1,2},target=0;
		//System.out.println(binarySearchToLeft(arr,8));
		int res=search(arr,target); // here 8 is the target element
		System.out.print(res);
	}
	public static int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
                return i;
        }
        return -1;
    }
}
