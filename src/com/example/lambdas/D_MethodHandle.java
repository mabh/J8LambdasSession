package com.example.lambdas;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class D_MethodHandle {
	public static void main(String[] args) throws Throwable {
		MethodHandles.Lookup lookup = MethodHandles.lookup();
		MethodHandle handle = lookup.findStatic(D_MethodHandle.class, "hello", MethodType.methodType(void.class, String.class));
		handle.invokeExact("SAG");
	}
	
	 static void  hello(String str) {
		System.out.println("Hello");
	}
}
