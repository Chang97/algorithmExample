package algoStud.step08;

import java.util.Scanner;

public class Hive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = 0;
		int room = 1;
		int befRoom = 1;
		int cnt = 0;
		
		System.out.println("숫자를 입력하세요. ");
		num = sc.nextLong();
		
		System.out.println(num);
		
		if (num <= 0 && num >= 1000000000) {
			System.out.println("0 <= N <= 1000000000");
			return;
		}
		for (int i = 1; ; i++) {
			room += 6 * i;
			if (i - 1 != 0) {
				befRoom += 6 * i - 1;
			}
			if (num > befRoom && num <= room) {
				cnt = i + 1;
				break;
			}
		}
		System.out.println(cnt);
	}

}
