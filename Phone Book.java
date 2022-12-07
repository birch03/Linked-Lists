// Name: Quinn Stone
// Class: CSCI 145
// Teacher: Professor Darrell Criss
// Assignment 1
// This program makes an intractable phone book

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


// IMPORTANT: When getting an input to the Phone Book, 
// .get(0) is the Last Name, 1 is the First Name, 2 is the Address
// 3 is the City, 4 is the Phone Number


public class Assignment1 {


   static List<String> addToList() {
	   Scanner scn = new Scanner(System.in);
	   
	   //creating temp list
	   List<String> temp = new ArrayList<>();
	   
	   //Getting Name
	   System.out.print("\nLast Name: ");
	   String lastName = scn.nextLine();
	   //Adding Name to list
	   temp.add(lastName);
	   
	 //Getting Name
	   System.out.print("First Name: ");
	   String firstName = scn.nextLine();
	   //Adding Name to list
	   temp.add(firstName);
	   
	 //Getting Address
	   System.out.print("Adress: ");
	   String address = scn.nextLine();
	   //Adding Address to list
	   temp.add(address);
	   
	 //Getting City
	   System.out.print("City: ");
	   String city = scn.nextLine();
	   //Adding City to list
	   temp.add(city);
	   
	   
	 //Getting Number
	   System.out.print("Phone Number: ");
	   String number = scn.nextLine();
	   //Adding Number to list
	   temp.add(number);
	   System.out.println("");
	   
	   return temp;
	   
   }
   
   public static List<List<String>> editEntry(List<List<String>> phoneBook) {
	   //Set up Scanner
	   Scanner scn = new Scanner(System.in);
	   
	   System.out.println("\nWhoes entry would you like to edit(Last Name, Case Sensitive): ");
	   String editing = scn.nextLine();
	   editing.toLowerCase();
	   
	   for (int i = 0; i < phoneBook.size(); i++) {
		   
		   List<String> tempList = new ArrayList<>();
		   tempList = phoneBook.get(i);
		   
		   if (tempList.get(0).equals(editing)) {
			   phoneBook.remove(i);
			   System.out.println("Replacing Entry.");
			   phoneBook.add(addToList());
		   }
		   
	   }
	   
	   return phoneBook;
	   
   }
   
   private static LinkedList<List<String>> deleteEntry(LinkedList<List<String>> phoneBook) {
		
	   //Set up Scanner
	   Scanner scn = new Scanner(System.in);
	   
	   System.out.println("\nWhoes entry would you like to edit(Last Name, Case Sensitive): ");
	   String editing = scn.nextLine();
	   editing.toLowerCase();
	   
	   for (int i = 0; i < phoneBook.size(); i++) {
		   
		   List<String> tempList = new ArrayList<>();
		   tempList = phoneBook.get(i);
		   
		   if (tempList.get(0).equals(editing)) {
			   phoneBook.remove(i);
		   }
		   
	   }
	   
	   return phoneBook;
	}
   
   private static void sortList(LinkedList<List<String>> phoneBook) {
		//Couldn't figure this one out
		
	}
   
   public static void main(String[] args) {
       //Set up scanner
	   Scanner scn = new Scanner(System.in);
	   
	   
	   LinkedList<List<String>> phoneBook = new LinkedList<List<String>>();
	    
	   
	   List<String> input = new ArrayList<>();
	   String answer = "";
	   
	   while (answer != "e") {
		   
		   System.out.println("If you would like to print the phone book, type 'p'.\nIf you would like to add an entry, type 'a'.\nIf you would like to edit an entry, type 'e'.\nIf you would like to delete and entry, type'd'.\nIf you would like to sort alphabetically by last name, type 's'.\nIf you would like to exit, type 'x'.");
		   answer = scn.next();
		   answer.toLowerCase();
		   
		   if (answer.equals("p")) {
			   System.out.println(phoneBook);
			   System.out.println("");
		   }
		   else if (answer.equals("a")) {
			   phoneBook.add(addToList());
		   }
		   else if (answer.equals("e")) {
			   editEntry(phoneBook);
		   }
		   else if (answer.equals("d")) {
			   deleteEntry(phoneBook);
		   }
		   else if (answer.equals("s")) {
			   sortList(phoneBook);
		   }
		   else if (answer.equals("x")) {
			   System.exit(0);
		   }
		   else {
			   System.out.println("Try Again");
		   }
	   }
	    

   
   }




}