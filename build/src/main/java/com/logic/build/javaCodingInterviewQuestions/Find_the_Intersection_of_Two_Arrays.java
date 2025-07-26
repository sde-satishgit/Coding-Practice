package com.logic.build.javaCodingInterviewQuestions;

import java.util.Set;
import java.util.TreeSet;

public class Find_the_Intersection_of_Two_Arrays {

	public static Set<Integer> getIntersectionArray(int arr[],int arr1[]){
		
		Set<Integer> set =  new TreeSet<>();
		
		for(int i=0;i<=arr.length-1;i++){

			for(int j=0;j<=arr1.length-1;j++){
				
				if(arr[i]==arr1[j]) {
					set.add(arr[i]);
				}
			}
		}
		return set;
	}
	public static void main(String[] args) {
		
		int arr[] = {1,2,2,3};
		int arr1[] = {2,2};
		Set<Integer> intersectionArray = getIntersectionArray(arr,arr1);
		intersectionArray.stream().forEach(System.out::println);

	}

}
