package com.Mohammed.java;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
// This is an application that acts as an ATM machine. The initial balance starts at 0. 
// I will ask the user for a deposit/withdraw and use this to affect the actual balance, reflecting the change in balance using a print out statement.
// This transaction process should loop till the user types done instead of a number.
	public static void main(String[] args) {
		Scanner Sc=new Scanner (System.in);
		double balance=0;
		System.out.println("Your balance is: "+balance);
		System.out.println("Please input your deposit/withdrawl amount (negative values count as withdral):");
		System.out.println("Please type done when transaction is complete or you want to exit");
		String S=Sc.next();
		double k=Double.parseDouble(S);
		try {
 while (true){
         balance=balance+k;
	 if (balance<0) {System.out.println("Your account can't have negative values");
		System.out.println("Your balance is: "+(balance-k));
System.out.println("Please input your deposit/withdrawl amount (negative values count as withdral):");
	 balance=balance-k+Sc.nextDouble();}
   if (balance>=0){	 
		System.out.println("Your balance is: "+balance);
System.out.println("Please input your deposit/withdrawl amount (negative values count as withdral):");
		k=Sc.nextDouble();}}}

catch(InputMismatchException ex) {System.out.println("Exiting");}}}