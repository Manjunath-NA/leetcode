import java.util.*;
public class RotateMatrix {
	static Scanner in=new Scanner(System.in);
	
	
  
    // Driver code 
    public static void main(String[] args) 
    { 
    	int[][] matrix= {{5,1,9,11},
    			       {2,4,8,10},
    			       {13,3,6,7},
    			       {15,14,12,16}
    			       };
    	
    	//Collections.reverse(Arrays.asList(matrix));
    	int len=matrix.length-1,len1=len;
    	for(int i=0;i<matrix.length/2;i++) {
    		
    		for(int j=0;j<matrix.length;j++) {
    			
    			int temp=matrix[i][j];
    			matrix[i][j]=matrix[len][j];
    			matrix[len][j]=temp;
    			
    		}
    		len--;
    		
    	}
    	for(int i=0;i<len1;i++) {
    		for(int j=0;j<matrix[i].length;j++) {
    			if(i<j) {
    			int temp=matrix[i][j];
    			matrix[i][j]=matrix[j][i];
    			matrix[j][i]=temp;
    			}
    		}
    		
    		
    	}
    	for(int i=0;i<matrix.length;i++) {
    		for(int j=0;j<matrix[i].length;j++) {
    			System.out.print(matrix[i][j]+" ");
    		}
    		System.out.println();
    	}
    	
    	
    	//System.out.println(trap(nums));
    	
        	
     }



	
    
	
	





}
