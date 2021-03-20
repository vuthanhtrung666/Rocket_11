package ExtraAssignment2;

import java.util.Scanner;

public class Exercise_2 {
	public static void main(String[] args) {
		int arr[] = {1,4,2,3,1,2}; 
		question1(arr);
		question2(arr);
		question3(arr);
	}

	private static void question3(int[] arr) {
		// TODO Auto-generated method stub
		int i,j,count=1,kq=0;
		System.out.printf("số lần xuất hiện của các phần tử: ");
		for(i = 0;i < arr.length; i++ ) {
			for(j = 0; j < arr.length ; j++) {
				if(arr[i]==arr[j] && i!=j) {
					count++;
				}
			}
			System.out.printf("\nphần tử %d có số lần là %d ",arr[i],count);
			count = 1;
		}
		System.out.println();
	}

	private static void question2(int[] arr) {
		// TODO Auto-generated method stub
		int i,j,count=1,kq=0;
		System.out.printf("các phần tử xuất hiện trong dãy đúng 2 lần: ");
		for(i = 0;i < arr.length; i++ ) {
			for(j = 0; j < arr.length ; j++) {
				if(arr[i]==arr[j] && i!=j) {
					count++;
				}
			}
			if(count == 2) {
				System.out.printf("%d ",arr[i]);
			}
			count = 1;
		}
		System.out.println();
	}

	private static void question1(int[] arr) {
		// TODO Auto-generated method stub
		int i,j,count=1;
		System.out.printf("các phần tử xuất hiện trong dãy đúng một lần: ");
		for(i = 0;i < arr.length; i++ ) {
			for(j = 0; j < arr.length ; j++) {
				if(arr[i]==arr[j] && i!=j) {
					count++;
				}
			}
			if(count == 1) {
				System.out.printf("%d ",arr[i]);
			}
			count = 1;
		}
		System.out.println();
	}
}
