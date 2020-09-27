class Solution {
    public int firstMissingPositive(int[] nums) {
        int len=nums.length;
        if(len==0) return 1;
        if(len==1){
            if(nums[0]<=0 || nums[0]>1)
                return 1;
            else if(nums[0]==1) {
             return 2;   
            }
        	
        }
        Arrays.sort(nums);
        
        int small=smallest(nums);
        if(small>1) {
        	return 1;
        }else if(small==1) {
        	while(find(small, nums)) {
        		small++;
        	}
        	return small;
        }
		return 0;
    }
    public boolean find(int i, int[] a) {
		
		// TODO Auto-generated method stub
		for(int j:a) {
			if(i==j)
				return true;
		}
		return false;
	}
	public int smallest(int[] a) {
		// TODO Auto-generated method stub
		int len=a.length,small=0;
        for(int i=0;i<len-1;i++){
        	if(a[i]>0) {
        		small=a[i];
        		while(i<len-1) {
        			if(a[i+1]<a[i] && a[i+1]>0) {
        				small=a[i+1];
        			}
        			i++;
        		}
        		return 1;
        	}
        }
        return 1;
	}
}
