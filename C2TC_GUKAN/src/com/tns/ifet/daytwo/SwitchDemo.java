package com.tns.ifet.daytwo;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true){
		System.out.println("\n1.Start\n2.Run\n3.Stop\n4.Exit\n");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("Started");
			break;
	case 2:
		System.out.println("Running");
		break;
	case 3:
		System.out.println("Stoping");
		break;
	case 4:
		System.out.println("Exiting");
		System.exit(0);
		break;
	default:
		System.out.print("Invalid char");
}
		}
		
		  }
	}


