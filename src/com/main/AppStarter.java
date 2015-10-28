package com.main;

import com.algo.sorting.java.MergeSorter;
import com.algo.sorting.java.Sorter;

public class AppStarter {

	public static void main(String[] args) {
		
		Integer [] array = {3,1,6,8,2,4,7,5};
		Sorter sorter = new MergeSorter();
		sorter.sort(array);
		
		for(int i : array){
			System.out.println(i);
		}
	}

}
