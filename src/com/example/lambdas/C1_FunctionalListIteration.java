package com.example.lambdas;

import java.util.function.Consumer;

import com.google.common.collect.ImmutableList;

public class C1_FunctionalListIteration {
	public static void main(String[] args) {
		final ImmutableList<String> list = 
				new ImmutableList.Builder<String>()
				.add("Sprinters")
				.add("Mauryas")
				.add("Pundits")
				.build();
		
		/* With anonymous class */
		
		/*list.forEach(new Consumer<String>() {
			public void accept(String x) {
				System.out.println(x);
			}
		});*/
		
		/* With lambdas */
		list.forEach(s -> System.out.println(s));
		
		//bytecode
		
		/*
		
		$ javap -c C1_FunctionalListIteration.class
Compiled from "C1_FunctionalListIteration.java"
public class com.example.lambdas.C1_FunctionalListIteration {
  public com.example.lambdas.C1_FunctionalListIteration();
    Code:
       0: aload_0
       1: invokespecial #8                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: new           #16                 // class com/google/common/collect/ImmutableList$Builder
       3: dup
       4: invokespecial #18                 // Method com/google/common/collect/ImmutableList$Builder."<init>":()V
       7: ldc           #19                 // String Sprinters
       9: invokevirtual #21                 // Method com/google/common/collect/ImmutableList$Builder.add:(Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList$Builder;
      12: ldc           #25                 // String Mauryas
      14: invokevirtual #21                 // Method com/google/common/collect/ImmutableList$Builder.add:(Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList$Builder;
      17: ldc           #27                 // String Pundits
      19: invokevirtual #21                 // Method com/google/common/collect/ImmutableList$Builder.add:(Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList$Builder;
      22: invokevirtual #29                 // Method com/google/common/collect/ImmutableList$Builder.build:()Lcom/google/common/collect/ImmutableList;
      25: astore_1
      26: aload_1
      27: invokedynamic #36,  0             // InvokeDynamic #0:accept:()Ljava/util/function/Consumer; <<<<<<<<<<<<<<<<<<<<<<<<<
      32: invokevirtual #37                 // Method com/google/common/collect/ImmutableList.forEach:(Ljava/util/function/Consumer;)V
      35: return
}


		*/
		
		
	}
}
