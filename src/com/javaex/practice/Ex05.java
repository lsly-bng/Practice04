package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int sum=0, avg=0;
		int[] data=new int[5];
		
		/*//노가다
		data[0]=sc.nextInt();
		data[1]=sc.nextInt();
		data[2]=sc.nextInt();
		data[3]=sc.nextInt();
		data[4]=sc.nextInt();
		*/
		
		for (int i=0; i<data.length; i++) {
			//효율적
			data[i]=sc.nextInt();
			sum+=data[i];
			avg=sum/(data.length);
		}
		System.out.println("평균은 "+(double)avg+" 입니다.");
		sc.close();
	}
}
