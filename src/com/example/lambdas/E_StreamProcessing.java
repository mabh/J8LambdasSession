package com.example.lambdas;

import java.util.function.Predicate;

import com.google.common.collect.ImmutableList;

public class E_StreamProcessing {
	public static void main(String[] args) {
		
		final Predicate<String> p = (value) -> value.charAt(0) == 'S';
		
		final ImmutableList<String> list = 
				new ImmutableList.Builder<String>()
				.add("Sprinters")
				.add("Mauryas")
				.add("Pundits")
				.build();
		
		/*
		 * we want to do declarative processing on collections
		 * letting the runtime decide which is the best execution approach
		 */
		
		
		//filter those starting with S and count them
		/*System.out.println(
			list.stream()
				.filter(s -> s.charAt(0) == 'S')
				.count()
		);*/
		
		
		//find the total length of team names
		/*System.out.println(
				list.stream()
					.mapToInt(s -> s.length())
					.sum()
		);*/
		
		
		//total length another way by reducer
		System.out.println(
				list.stream()
					.mapToInt(s -> s.length())
					.min()
					.orElse(10)
		);
		
		
		
		//parallel streams
		
		
		
		
	}
}
