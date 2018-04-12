package aa;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Pair{
	int days;
	int fineCost;
	int prevIndex;
	float ratio;
	
	public void calculateRatio(){
		ratio = (float)fineCost/(float)days;
	}
	
	public boolean isGreaterThan(Pair o){
		return this.ratio>o.ratio;
	}
}

public class Tester {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int totalTestCases = s.nextInt();
		
		while(totalTestCases>0){
			int currentTestCases = s.nextInt();
			Pair[] total = new Pair[currentTestCases];
			for(int i=0;i<currentTestCases;i++){
				Pair data = new Pair();
				data.days = s.nextInt();
				data.fineCost = s.nextInt();
				data.prevIndex = i+1;
				data.calculateRatio();
				total[i] = data;
				
			}
			
			Arrays.sort(total);
			
			
			totalTestCases--;
		}
	}
}