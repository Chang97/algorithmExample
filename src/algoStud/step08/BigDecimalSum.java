package algoStud.step08;

import java.math.BigInteger;
import java.util.Scanner;

public class BigDecimalSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputNum1 = sc.next();
		String inputNum2 = sc.next();
		
		BigInteger num1 = new BigInteger(inputNum1);
		BigInteger num2 = new BigInteger(inputNum2);
		
		System.out.println(num1.add(num2));
		
	}

}
