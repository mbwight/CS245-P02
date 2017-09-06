package edu.usfca.cs.cs245;

public class LinearSearch implements Practice2Search{
	public String searchName(){
		return "linear";
	}
	public int search(int [] arr, int target){ //search through array iteratively
		for(int i = 0; i<arr.length-1; i++){
			if(arr[i] == target){
				return i;
			}
		}
		return -1; //if target cannot be found, return -1
	}
	
}
