import java.util.*;

public class ThreeSum {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {-2,0,1,1,2};
		List<List<Integer>> result=threeSum(nums);
		for(int k=0;k<result.size();k++) {
			for(int z=0;z<3;z++) {
				System.out.print(result.get(k).get(z)+" ");
			}
			System.out.println();
		}
		
		
		
		
	}

	 public static List<List<Integer>> threeSum(int[] nums) {
	        if(nums.length<3) return new ArrayList<>();
	        Arrays.sort(nums);
			int len=nums.length;
			Set<List<Integer>> result = new HashSet<>(); 
			int sum=0;
			for(int i=0;i<len-2;i++) {
				int low=i+1,high=len-1;
				
				
				while(low<high) {
					sum = nums[i] + nums[low] + nums[high];
	                if(sum==0) {
						result.add(Arrays.asList(nums[i], nums[low++], nums[high--]));
						
					}else if(sum<0) {
						low++;
					}else if(sum>0) {
						high--;
					}
				}
				
		
			}
	        return new ArrayList<>(result);
	    }
	      
	
}