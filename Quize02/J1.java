package Quize02;

import java.util.*;

public class J1 {

	public static void main(String[] args) {
		int n1, n2 = 0 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("密碼輸入測試");
		System.out.print("請輸入密碼:");
		n1 = sc.nextInt();
		for (int i = 1; i <= 3; i++) {
			System.out.print("請再一次輸入密碼:");
			n2 = sc.nextInt();
			if (n1 != n2) {
				System.out.println("與第一次輸入的密碼不同!");
			} else {
				break;
			}
		}
		if (n1 != n2) {
			throw new RuntimeException("輸入三次錯誤！程式停止！");
		}
		else {
			 System.out.println("密碼正確");
		}
	}

}
