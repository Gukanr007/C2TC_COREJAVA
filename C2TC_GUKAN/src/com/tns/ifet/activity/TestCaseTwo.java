package com.tns.ifet.activity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TestCaseTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dc =new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		System.out.print("Enter n: ");
		int n = dc.nextInt();
		System.out.print("Enter m: ");
		int m = dc.nextInt();
		System.out.print("Enter N: ");
		int N = dc.nextInt();
		for(int i=n;i<=m;i++) {
			int no = i;
			int sum=0;
			while(no!=0) {
				sum+=(int)no%10;
				no/=10;
			}
			if(sum==N) {
				list.add(i);
			}
		}
		
		System.out.println("Result: " + list.stream().map(String::valueOf).collect(Collectors.joining(", ")));
		
	}

}
