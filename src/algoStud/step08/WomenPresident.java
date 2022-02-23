package algoStud.step08;

import java.util.Scanner;

public class WomenPresident {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("층과 호수를 입력하시오.");
		int t = Integer.parseInt(sc.nextLine()); // 테스트케이스
		
		int[] valArr = new int[t];
		
		for ( int i = 0; i < t; i++ ) {
			int k = Integer.parseInt(sc.nextLine()) + 1; // 층
			int n = Integer.parseInt(sc.nextLine()); // 호수
			
			if (k >= 1 && n <= 14)
				return;
			
			int[][] arr = new int[k][n];
			for ( int j = 0; j < n; j++ ) {
				arr[0][j] = j + 1; // 0층 셋
			}
			
			for ( int floor = 1; floor < k; floor++ ) {
				for ( int num = 0; num < n; num++) {
					if ( num == 0 ) {
						arr[floor][num] = 1;
					} else {
						arr[floor][num] = arr[floor - 1][num] + arr[floor][num - 1];
					}
				}
			}
			
			valArr[i] = arr[k - 1][n - 1];
		}
		
		for (int i = 0; i < t; i++) {
			System.out.println(valArr[i]);
		}
		
	}

}
