package com.salesianostriana.dam.ejercicio2;

public class Main {

	public static boolean contains(int[] arr, int item) {
	      //for (int n : arr) {
		  for(int i = 0; i < arr.length; i++) {
			 int n = arr[i];
	         if (item == n) {
	            return true;
	         }
	      }
	      return false;
	   }
	   public static void main(String[] args) {
	          int[] my_array1 = {
	            1789, 2035, 1899, 1456, 2013, 
	            1458, 2458, 1254, 1472, 2365, 
	            1456, 2265, 1457, 2456};
	      System.out.println(contains(my_array1, 2013));
	      System.out.println(contains(my_array1, 2015));
	   }

}
