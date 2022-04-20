package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {

		int [] lotto=new int[6];
		
		for (int i=0; i<lotto.length; i++) {
			lotto[i]=(int)(Math.random()*45)+1;
			//일단 숫자 6개 뽑아
			
			for (int j=0;j<i;j++) { //중복있나보자
				while (lotto[i]==lotto[j]) { //중복 있으면
					lotto[i]=(int)(Math.random()*45)+1; //i 다시 돌려
					continue; 	//중복없을때까지?
				}
			}
			System.out.print(lotto[i]+" ");
		}
		//뭔지모르겠음
	}
}
