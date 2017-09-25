package com.practise.questions;
import java.util.Scanner;
public class TSSClubFair2017ProblemA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = Integer.parseInt(sc.nextLine());
		for (int i = 0; i <  n1; i++) {			
			String s0 = sc.nextLine();
			String[] sa1 = s0.split(" ");
			String s1 = sa1[0];
			String s2 = sa1[1];
			String s3 = sa1[2];
			if(s1.compareTo(s2) == 0) {
				System.out.println(s1);
			}else if(s1.compareTo(s3) == 0) {
				System.out.println(s1);
			}else if(s2.compareTo(s3) == 0) {
				System.out.println(s2);
			}else {
				System.out.println("???");
			}
		}
	}

}
