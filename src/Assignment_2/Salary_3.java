package Assignment_2;

import java.util.Scanner;
import static java.lang.Math.round;

public class Salary_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int basic=s.nextInt();
		char grade=s.next().charAt(0);
		int allow=1300;
		int salary;
		
		if(grade=='A'){
			allow=1700;
		}
		else if(grade=='B'){
			allow=1500;
		}
		//salary=(int)(basic+(20.0/100)*basic+(50.0/100)*basic-(11.0/100)-basic+allow);
		salary=basic+(int)round((59.0/100)*(basic)+allow);
		//salary=(basic+(int)round((20/100.0)*basic)+(int)round((50/100.0)*basic)-(int)round((11/100.0)*basic)+allow);
		System.out.print(salary);
		

	}

}
