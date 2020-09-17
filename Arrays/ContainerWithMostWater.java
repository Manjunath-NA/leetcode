import java.util.*;

public class ContainerWithMostWater {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int height[]= {1,8,6,2,5,4,8,3,7};
		int maximum=0,minimum;
		int len=height.length;
		
		int area=0,k=0;
		if(len>=2) {
		for(int i=0;i<len-1;i++) {
			k=0;
			for(int j=i+1;j<len;j++) {
				k++;
				minimum=Math.min(height[i],height[j]);
				area=k*minimum;
				maximum=Math.max(maximum,area);
			}
		}
		System.out.println(maximum);
		}
	

}
}