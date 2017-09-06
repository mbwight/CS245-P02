package edu.usfca.cs.cs245;

public  class BinaryRecursiveSearch implements Practice2Search{
	public String searchName(){
		return "binary recursive"; //returns type of search
	}
	
	public int search(int [] arr, int target){
		return search(arr,target,0,arr.length-1);
	} //first run initializer
	
	public int search(int [] arr, int target, int min, int max){
		int mid = (min+max)/2;
		if(min > max){
			return -1;
		} //base case
		if(arr[mid] == target){
			return mid;
		} //end case if true, return index
		if(arr[mid] > target){
			return search(arr,target,min,mid-1);
		}//if mid is greater than target, research and have max be lower by 1 index than midpoint
		if(arr[mid] < target){
			return search(arr,target,mid+1,max);
		}
		
			return -1;
		
	}

}