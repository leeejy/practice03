package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		// 힌트: Scanner 와 String 클래스의 split 함수를 사용합니다.
		
		Scanner scanner = new Scanner(System.in);
		while( true ) {
			System.out.println("입력해주세요");
			String cal = scanner.nextLine();
			String[] a =cal.split(" ");
			int num1=Integer.parseInt(a[0]);
			int num2=Integer.parseInt(a[2]);
			
			switch(a[1]){
			case "+" :
				Add add= new Add();
				add.setValue(num1, num2);
				int result_add = add.calculate();
				System.out.println(result_add);
				break;
			case "-" :
				Sub sub = new Sub();
				sub.setValue(num1, num2);
				int result_sub = sub.calculate();
				System.out.println(result_sub);
				break;
				
			case "*" :
				Mul mul= new Mul();
				mul.setValue(num1, num2);
				int result_mul = mul.calculate();
				System.out.println(result_mul);
				break;
			case "/" :
				Div div= new Div();
				div.setValue(num1, num2);
				int result_div = div.calculate();
				System.out.println(result_div);
				break;
			
			}

		}
//		scanner.close();
	}
}

/*
 * 다수의 클래스를 정의해보고 활용하는 연습입니다.
 * 
 * 사칙연산 (+, -, *, /)만 가능하고 2개의 피연산자만 입력 받는 정수 계산기를 만드세요.
 * 
 * 각 사칙연산을 수행하는 각 연산 클래스 Add, Sub, Mul, Div 클래스를 만들고 각 클래스는 다음의 필드와 메소드를 가집니다.
 * 
 * int a int b void setValue(int a, int b) int calculate()
 * 
 * 계산기 본체 클래스는 CalcApp 입니다. 계산기 실행 결과는 다음과 같습니다.
 * 
 * 3+4 7 quit
 */
