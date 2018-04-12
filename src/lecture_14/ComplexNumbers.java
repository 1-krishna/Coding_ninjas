package lecture_14;

public class ComplexNumbers {
	int real;
	int imaginary;
	
	public ComplexNumbers(int real, int imaginary) {
		this.real=real;
		this.imaginary=imaginary;
	}
	
	public void plus(ComplexNumbers c2){
		int temp1=this.real+c2.real;
		int temp2=this.imaginary+c2.imaginary;
		this.real=temp1;
		this.imaginary=temp2;
	}
	
	public void print(){
		System.out.println(this.real+" + "+"i"+""+this.imaginary);
	}
	
	public void multiply(ComplexNumbers c2){
		int temp1=this.real*c2.real - this.imaginary*c2.imaginary;
		int temp2=this.imaginary*c2.real + this.real*c2.imaginary;
		this.real=temp1;
		this.imaginary=temp2;
	}
}
