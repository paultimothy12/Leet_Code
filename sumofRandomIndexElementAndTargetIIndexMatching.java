public class sumofarrayandtargetIndex {
	public static void main(String args[]) {
    	int array[]= {2,7,11,15};
    	int target=22;
    	outerloop:
    	for(int i=0;i<array.length;i++) {
    		for(int j=0;j<array.length;j++) {
    			if(target==array[i]+array[j] && i!=j) {
    				System.out.println(i+" "+j); break outerloop;}
    		}
    	}	
    	
    }
}
