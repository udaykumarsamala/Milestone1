package Arrays;

public class Remove_duplicates {
	
	 public static int[] removeDuplicates(int[] s){
         
	        int j = 0;
	        int i = 1;
	       
	        if(s.length < 2){
	            return s;
	        }
	        while(i < s.length){
	            if(s[i] == s[j]){
	                i++;
	            }else{
	                s[++j] = s[i++];
	            }    
	        }
	        int[] l = new int[j+1];
	        for(int k=0; k<l.length; k++){
	            l[k] = s[k];
	        }
	         
	        return l;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {2,3,6,6,8,9,10,10,10,12,12};
        int[] b = removeDuplicates(a1);
        for(int i:b){
            System.out.print(i+" ");
        }
    }

	}


