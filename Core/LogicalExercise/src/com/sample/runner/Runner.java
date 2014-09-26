package com.sample.runner;


public class Runner {

	public static void main(String[] args) {
		int[] unsorted = {5,3,7,10,1};
		System.out.println("Unsorted : ");
		print(unsorted);

		System.out.println("\nSorted : ");

		int[] sorted = sort(unsorted, Order.DESC);	
		print(sorted);

	}


	public static int[] sort(int[] unsortedList, Order order){
		int tempVar;

		if(Order.DESC.equals(order)){
			System.out.println("Descending... ");
			for(int i=0; i<=unsortedList.length-1; i++){
				for(int j=i+1; j<=unsortedList.length-1; j++){
					if(unsortedList[i] < unsortedList[j]){
						tempVar = unsortedList[i];
						unsortedList[i] = unsortedList[j];
						unsortedList[j] = tempVar;
					}
				}
			}
		}else if(Order.ASC.equals(order) || !(order instanceof Order)){
			System.out.println("Ascending... ");
			for(int i=0; i<=unsortedList.length-1; i++){
				for(int j=i+1; j<=unsortedList.length-1; j++){
					if(unsortedList[i] > unsortedList[j]){
						tempVar = unsortedList[i];
						unsortedList[i] = unsortedList[j];
						unsortedList[j] = tempVar;
					}
				}
			}
		}

		return unsortedList;
	}

	private static void print(int[] list){
		for(int i=0; i<=list.length-1; i++){
			System.out.println(list[i]);
		}
	}

	enum Order{
		ASC,
		DESC;
	}

}
