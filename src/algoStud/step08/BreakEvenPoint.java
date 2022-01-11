package algoStud.step08;

import java.util.Scanner;

public class BreakEvenPoint {

	public static void main(String[] args) {
		int fixExpense;
		int varExpense;
		int ltPrice;
		int benefit = 0;
		int cnt = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("고정비용, 가변비용, 판매수익 순으로 입력하시오.");
		fixExpense = scan.nextInt();
		varExpense = scan.nextInt();
		ltPrice = scan.nextInt();
		
		if (fixExpense > 2100000000) {
			return;
		}
		else if (varExpense > 2100000000) {
			return;
		}
		else if (ltPrice > 2100000000) {
			return;
		}
		if (varExpense > ltPrice) {
			System.out.println("-1");
			return;
		}
		
		while(true) {
			benefit = (ltPrice * cnt) - (varExpense * cnt) - fixExpense;
			if (benefit > 0)
				break;
			cnt++;
		}
			
			
		System.out.println(cnt);
			
	}
	

}