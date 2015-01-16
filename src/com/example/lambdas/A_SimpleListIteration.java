package com.example.lambdas;

import com.google.common.collect.ImmutableList;

public class A_SimpleListIteration {
	public static void main(String[] args) {
		final ImmutableList<String> list = 
				new ImmutableList.Builder<String>()
				.add("Sprinters")
				.add("Mauryas")
				.add("Pundits")
				.build();
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//bytecode
		
		/*
		 
		 $ javap -c A_SimpleListIteration.class
Compiled from "A_SimpleListIteration.java"
public class com.example.lambdas.A_SimpleListIteration {
  public com.example.lambdas.A_SimpleListIteration();
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
      26: iconst_0
      27: istore_2
      28: goto          48
      31: getstatic     #33                 // Field java/lang/System.out:Ljava/io/PrintStream;
      34: aload_1
      35: iload_2
      36: invokevirtual #39                 // Method com/google/common/collect/ImmutableList.get:(I)Ljava/lang/Object;
      39: checkcast     #45                 // class java/lang/String
      42: invokevirtual #47                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      45: iinc          2, 1				//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
      48: iload_2
      49: aload_1
      50: invokevirtual #53                 // Method com/google/common/collect/ImmutableList.size:()I
      53: if_icmplt     31
      56: return
}

		 
		 */
		
		
	}
}