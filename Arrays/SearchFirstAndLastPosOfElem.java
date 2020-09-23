import java.util.*;

public class SearchFirstAndLastPosOfElem {
	public static void main(String[] args) {
		int arr[]= {5,7,7,8,8,10};
		//System.out.println(binarySearchToLeft(arr,8));
		int res[]=searchRange(arr,8); // here 8 is the target element
		for(int x:res)
			System.out.print(x+" ");
	}
	private static int[] searchRange(int[] nums, int target) {
        int len=nums.length;
        int empty[]= {-1,-1};
        if(len==0) return empty;
        
        int index=-1;
        List<Integer> result=new ArrayList<Integer>();
        //binary search
        index=binarySearchToLeft(nums,target);
        if(index<0)
            return empty;
        else{
            result.add(index);
            index++;
            while(index<len && nums[index]==target){
                result.add(index);
                index++;
            }
        }
        int[] arr=new int[2];
        if(result.size()>=2) {
        	arr[0]=result.get(0).intValue();
        	arr[1]=result.get(result.size()-1).intValue();
        }else if(result.size()==1) {
        	arr[0]=result.get(0).intValue();
            arr[1]=arr[0];
            
        }
        return arr;
    }
	private static int binarySearchToLeft(int[] nums, int target)
    {
        int left = 0;
        int right = nums.length-1;
        int index = -1;
        while(left <= right)
        {
            int mid = left + (right - left)/2;
            if(nums[mid] == target)
            {
                index = mid;
                right = mid-1;
            }
            else if(nums[mid] > target)
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }
        
        return index;
    }
}
