package com.algo.sorting.java;

public class MergeSorter implements Sorter{

	
	private Object[] numbers;
	private Object[] helper;

	private int number;
	
	@Override
	public void sort(Object [] values) {
		this.numbers = values;
		number = values.length;
		this.helper = new Object[number];
		mergesort(0, number - 1);
	}	

	private void mergesort(int low, int high) {
		// check if low is smaller then high, if not then the array is sorted
		if (low < high) {
			// Get the index of the element which is in the middle
			int middle = low + (high - low) / 2;
			// Sort the left side of the array
			mergesort(low, middle);
			// Sort the right side of the array
			mergesort(middle + 1, high);
			// Combine them both
			merge(low, middle, high);
		}
	}

	@SuppressWarnings("unchecked")
	private void merge(int low, int middle, int high) {

		// Copy both parts into the helper array
		for (int i = low; i <= high; i++) {
			helper[i] = numbers[i];
		}

		int i = low;
		int j = middle + 1;
		int k = low;
		
		
		while(k<=high){
			
			if(j>high || i<= middle && ((Comparable<Object>)helper[i]).compareTo(helper[j])<=0){
				numbers[k++]=helper[i++];
			}
			
			//clubs helper[i]>helper[j] and i>middle
			else{
				numbers[k++]=helper[j++];
			}
		}
	}
}
