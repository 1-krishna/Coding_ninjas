package lecture_9;

public class ReverseIntStringUsingRecursionReturnInt {
	
	public static int smallcode(String input,int start){
        if(start==input.length()){
            return 0;
        }
        
        int t;
        t=(int)(Math.pow(10,start))*Character.getNumericValue(input.charAt(start));
        return t+smallcode(input,start+1);
        
    }

	public static int convertStringToInt(String input){
		
		return (smallcode(input,0));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
