package lecture_14;

public class Complex {

	public static void main(String[] args) {
		ComplexNumbers c1=new ComplexNumbers(4, 5);
		ComplexNumbers c2=new ComplexNumbers(6, 7);
		c1.plus(c2);
		c1.print();
		c1.multiply(c2);
		c1.print();

	}

}
