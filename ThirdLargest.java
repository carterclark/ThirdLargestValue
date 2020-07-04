package misc;


import java.util.Scanner;

public class ThirdLargest {

	public static void main(String[] args) throws Exception {
		System.out.println("This program finds the third largest integer in an array. ");
		System.out.println("Please note that the array should be of length 3 or larger. \n");
		Scanner input = new Scanner(System.in);//scanner
		System.out.println("Enter length of array as an integer: ");
		int len = input.nextInt(); //length of array
		int i;
		
		int[] arr = new int[len];	//initializing array of length len
		
		for(i=0; i<len; i++) {
			System.out.println("Enter element of array: ");
			int element = input.nextInt(); //elements in array
			if(i==(len-1)) input.close();	//closes input
			
			arr[i] = element;
			
			
		}
		input.close();
		
		int result = thirdLargest(arr);	//method for finding third largest
		
		System.out.println("Third largest integer of array is: " + result);
		
		
	}
	
	static int thirdLargest(int[] arr) {
		int[] newArr = removeLargest(arr);	//remove largest int
		
		newArr = removeLargest(newArr);		//remove second largest int
		int newNum = findLargest(newArr);	//find third largest int
		
		return newNum;
	}
		
	
	
	
	
	
	//method for finding largest value in array	
	static int findLargest(int[] arr) {
		int i;
		int len = arr.length;
		int max = arr[0];
		
		for(i=0; i<len; i++) {
			if(max<arr[i]) max = arr[i];
			}
			return max;
		}
	
	//method for removing largest array
	static int[] removeLargest(int[] arr) {
		int i;
		int len = arr.length;
		
		int max = findLargest(arr);
		for(i=0; i<len; i++) {
			if(arr[i] == max) arr[i] = 0;
		}
		return arr;
	}
}

