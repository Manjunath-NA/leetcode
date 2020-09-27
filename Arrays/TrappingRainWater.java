import java.util.*;
public class TrappingRainWater {
	static Scanner in=new Scanner(System.in);
	
	
  
    // Driver code 
    public static void main(String[] args) 
    { 
    	int[] nums= {0,1,0,2,1,0,1,3,2,1,2,1};
    	System.out.println(trap(nums));
    	
        	
     }
    private static int trap(int[] nums) {
    	int totalWater=0;
    	for(int i=0;i<nums.length;i++) {
    		int lmax = leftmax(nums,i);
    		int rmax=rightmax(nums,i);
    		System.out.println(lmax+" "+rmax);
    		int min=Math.min(lmax, rmax);
    		int wi=min-nums[i];
    		totalWater+=wi;
    		//System.out.println(totalWater);
    	}
	
    	return totalWater;
        
    }
	private static int rightmax(int[] nums, int i) {
		// TODO Auto-generated method stub
		int max=0;
		for(int j=i;j<nums.length;j++) {
			if(nums[j]>max)
				max=nums[j];
		}
		return max;
	}
	private static int leftmax(int[] nums, int i) {
		// TODO Auto-generated method stub
		int max=0;
		for(int j=0;j<=i;j++) {
			if(nums[j]>max)
				max=nums[j];
		}
		return max;
	}

	





}
