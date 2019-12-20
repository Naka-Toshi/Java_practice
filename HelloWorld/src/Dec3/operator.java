package Dec3;

public class operator {
	public static void main(String args[]) {
		
		int num1 = 100;
		int num2 = 20;
		
		System.out.println("Arithemtic Opetators");
		System.out.println("num1 + num2: " +(num1+num2));
		System.out.println("num1 - num2: " +(num1-num2));
		System.out.println("num1 * num2: " +(num1*num2));
		System.out.println("num1 / num2: " +(num1/num2));
		
		System.out.println("Assignment Operators");
		num2 =num1;
		System.out.println(" = output: "+num2);
		num2 += num1;
		System.out.println(" += output: "+num2);
		num2 -= num1;
		System.out.println(" -= output: "+num2);
		num2 *= num1;
		System.out.println(" *= output: "+num2);
		num2 /= num1;
		System.out.println(" /= output: "+num2);
		num2 %= num1;
		System.out.println(" %= output: "+num2);
		
		System.out.println("increment and decrement oparators");
		num2++;
		num1--;
		System.out.println("num1++ is: "+num2);
		System.out.println("num1-- is: "+num1);
		
		--num1;
		++num2;
		System.out.println("--num1 is: "+num1);
		System.out.println("++num2 is: "+num2);
		
		System.out.println("Logical Operators");
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("b1 && b2: "+(b1 && b2));
		System.out.println("b1 || b2: "+(b1 || b2));
		System.out.println("!(b1 && b2): "+!(b1 && b2));
	
	//Q1
	System.out.println("Ternary Operater");
		int a , b;
		a = 25;
		
		b = (a ==10)? 100 : 200;
		System.out.println("b: " +b);
		
		b = (a ==25)? 100 : 200;
		System.out.println("b: " +b);
		
	System.out.println("Comparision / Relstional oparators");
		int num3 = 10;
		int num4 = 50;
		
		if(num3 == num4) {
			System.out.println("num3 and num4 are equal");
		} else {
			System.out.println("num3 and num4 are not equal");
		}
		
		if(num3 != num4) {
			System.out.println("num3 and num4 are not equal");
		} else {
			System.out.println("num3 and num4 are equal");
		}
		
		if(num3 > num4) {
			System.out.println("num3 is grater than num4");
		} else {
			System.out.println("num3 is less than num4");
		}
		
		if(num3 < num4) {
			System.out.println("num3 is less than num4");
		} else {
			System.out.println("num3 is grater than num4");
		}
		
		if(num3 >= num4) {
			System.out.println("num3 is grater than or equal to num4");
		} else {
			System.out.println("num3 is less than num4");
		}
		
		
		if(num3 <= num4) {
			System.out.println("num3 is less than or equal to num4");
		} else {
			System.out.println("num3 is grater than num4");
		}
		
	
	//Q2
	System.out.println("Bitwise Operator");
		int num5 = 11;
		int num6 = 22;
		int result = 0;
		
		result = num5 & num6;
		System.out.println("num5 & num6 " +result);
		
		result = num5 | num6;
		System.out.println("num5 | num6 " +result);
		
		result = num5 ^ num6;
		System.out.println("num5 ^ num6 " +result);
		
		result = ~ num5;
		System.out.println("num5 " +result);
		
		result = num5 << 2;
		System.out.println("num5 << 2 " +result);
		
		result = num5 >> 2;
		System.out.println("num5 >> 2 " +result);
		
		}
	

}
