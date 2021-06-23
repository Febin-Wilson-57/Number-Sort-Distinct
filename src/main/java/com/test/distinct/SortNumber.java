package com.test.distinct;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String line= null;
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader("numberfile.txt"));
			
			while((line = reader.readLine())!=null) {
			 String [] arr = line.split(" ");
				
				for(int i=0;i<=arr.length-1;i++) {
					try {
						
						int number = Integer.parseInt(arr[i]);
						numbers.add(number);
						
					}
					catch(NumberFormatException nfe){
						System.out.println("Number Format Exception");
					}
				}
			}
			
		}
		catch(IOException e) {
			System.out.println("File format Exception");
		}
		System.out.println("given input file:" + numbers);
		
		List<Integer> sortedNumbers = numbers.stream().sorted().distinct().collect(Collectors.toList());
		
//		System.out.println("sorted number is :" + sortedNumbers);
		System.out.println("Distinct elements are :");
		
		sortedNumbers.stream().forEach(System.out::println);
		
	}

}
