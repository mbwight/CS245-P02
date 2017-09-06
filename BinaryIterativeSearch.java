package edu.usfca.cs.cs245;

public class BinaryIterativeSearch implements Practice2Search{
	public String searchName(){
		return "binary iterative"; //returns type of search
	}
	public int search(int [] arr, int target){
		int min = 0; //sets the values for the min, mid, and max points of the array
		int max = arr.length-1;
		int mid;
		while(min<=max){
			mid = (min+max)/2;
			if(arr[mid] == target){
				return mid; 
			}
			if(arr[mid] > target){
				min = mid+1; //if midpoint > target, make the new min 1 position higher in array
			}
			else{
				max = mid-1;
			}
		}
		return -1;
	}
}