package day03_operator;

public class Ex03_op {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 복합 대입 연산자
		 a = 10;
		 a = a + 3; -> a+= 3;
		 a = a * 3 -> a*= 3;
		 */
		
		int su1, su2;
		su1 = su2 = 5;
		System.out.println("su1 + 1 = " + (su1+=1));
		System.out.println("su1 - 1 = " + (su1-=1));
		System.out.println("su1 * 1 = " + (su1*=su2));
		System.out.println("su1 / 1 = " + (su1/=su2));
		System.out.println("su1 % 1 = " + (su1%=su2));
	}

}
