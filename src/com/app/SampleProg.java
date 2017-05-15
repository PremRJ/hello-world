package com.app;

import java.util.ArrayList;

public class SampleProg {

	public static void main(String[] args) {
		
		System.out.println("hello-world");
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(123);
		list.add(234);
		for (int ele : list) {
			System.out.println(ele);
		}
	}
}
