package com.problem_statement1_3;
import java.util.Scanner;

public class TestBook {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Book Title");
		String booktitle=sc.nextLine();
		
		System.out.println("Enter the Book Price");
		int price=sc.nextInt();
		sc.nextLine();
		
		Book n=new Book();
		n.setBooktitile(booktitle);
		n.setBookprice(price);
		System.out.println("Book Details");
		System.out.println("Book Title :"+n.getBooktitile());
		System.out.println("Book Price :"+n.getBookprice());
	}
}
		

