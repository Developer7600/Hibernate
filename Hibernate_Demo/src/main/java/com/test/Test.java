package com.test;

public class Test {
	public static void main(String[] args) {
C c= new C();
int test=c.cClassMethod().bClassMethod().aClassMethod();
System.out.println(test);
	}
}
