package algoStud.step08;

import java.util.Scanner;

public class SugarDelivery {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("키로수 입력 : ");
		int max = 0;
		int num = sc.nextInt();

		if (num >= 3 && num <= 5000) {
			if (num % 5 == 0) {
				max = num / 5;
			} else if ((num - 5) % 3 == 0) {
				max = 1 + (num - 5) / 3;
			} else if ((num % 5) % 3 == 0) {
				max = num / 5;
				max += (num % 5) / 3;
			} else if (num % 3 == 0) {
				max = num / 3;
			} else {
				max = -1;
			}
			System.out.println(max);
		} else {
			return;
		}
	}

}
