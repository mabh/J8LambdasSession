package com.example.lambdas;

import com.google.common.collect.ImmutableList;

public class B_SimpleListIteration {
	public static void main(String[] args) {
		final ImmutableList<String> list = 
				new ImmutableList.Builder<String>()
				.add("Sprinters")
				.add("Mauryas")
				.add("Pundits")
				.build();
		
		for(String team: list) {
			System.out.println(team);
		}
		
		//bytecode
		
		/*
		
		$ javap -c B_SimpleListIteration.class
Compiled from "B_SimpleListIteration.java"
public class com.example.lambdas.B_SimpleListIteration {
  public com.example.lambdas.B_SimpleListIteration();
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
      27: invokevirtual #33                 // Method com/google/common/collect/ImmutableList.iterator:()Ljava/util/Iterator;
      30: astore_3
      31: goto          51
      34: aload_3
      35: invokeinterface #39,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      40: checkcast     #45                 // class java/lang/String
      43: astore_2
      44: getstatic     #47                 // Field java/lang/System.out:Ljava/io/PrintStream;
      47: aload_2
      48: invokevirtual #53                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      51: aload_3
      52: invokeinterface #59,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z <<<<<<<<<<<<<<<<<<<<<<<<<<<<
      57: ifne          34
      60: return
}


		*/
		
	}
}
