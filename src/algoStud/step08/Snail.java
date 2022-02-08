package algoStud.step08;

import java.util.Scanner;

public class Snail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
		int h = 0;
		int cnt = 0;
		
		if ( 1 <= b && b < a && a <= v && b <= 1000000000 ) {
			while (h < v) {
				h += a;
				cnt++;
				if (h >= v) {
					break;
				} else {
					h -= b;
				}
			}
			
			System.out.println(cnt);
		} else {
			return;
		}
		
		
	}

}
