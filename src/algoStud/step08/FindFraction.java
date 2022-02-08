package algoStud.step08;

import java.util.Scanner;

public class FindFraction {
	public static void main(String[] args) {
		int diagonal = 1;
		int lNum = 0;
		int rNum = 0;
		int cnt = 1;

		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt(); 
		
		if ( !(input >= 0 && input <= 10000000) ) {
			return;
		}
		
		while (diagonal <= input) {
			if ( diagonal + cnt > input ) {
				break;
			}
			diagonal += cnt;
			++cnt;
		}
		
		
		if ( cnt % 2 == 0 ) {
			rNum = cnt - (input - diagonal);
			lNum = cnt - rNum + 1;
		} else {
			lNum = cnt - (input - diagonal);
			rNum = cnt - lNum + 1;
		}
		
		System.out.println("[" + lNum + "/" + rNum + "]");
		
	}

}
