package com.sample.runner;

public class ArraySorter {

	public static void main(String[] args) {
		int[] unsortedList = {1,4,5,7,2,9,8,6,7,-3,-6,-1};
		
		System.out.println("Unsorted list");
		printList(unsortedList);
		
		int temp;
		
		for(int i=0; i <= unsortedList.length-1; i++){
			for(int j=0; j<= unsortedList.length-1; j++){
				if(unsortedList[i] < unsortedList[j] ){
					temp = unsortedList[i];
					unsortedList[i] = unsortedList[j];
					unsortedList[j] = temp;
				}
			}
		}
		
		System.out.println("\nSorted list in ASC");
		printList(unsortedList);
		
	}
	
	private static void printList(int[] unsortedList) {
		for(int i : unsortedList){
			System.out.println(i);
		}
	}

}
