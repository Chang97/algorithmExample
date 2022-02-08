package algoStud.step08;

import java.util.Scanner;

public class ACMHotel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		String roomNum = "";
		
		if ( (1 <= h && 1 <= w && h <= 99 && w <= 99)
				&& (1 <= n && n <= h * w)) {
			
			int floor = n % h;
			int num = (n / h) + 1;
			
			
			if ( num / 10 == 0 ) {
				roomNum = String.valueOf(floor) + "0" + num;
			} else {
				roomNum = String.valueOf(floor) + num;
			}
			
			System.out.println(roomNum);
			
		} else {
			return;
		}

	}

}
