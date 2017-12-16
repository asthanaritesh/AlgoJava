package Utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
	public static int singleInt(){
		System.out.println("Provide your input as single integer value:");
		Scanner scanner = new Scanner(System.in);
		int input=0;
		if(scanner.hasNextInt())
			input = scanner.nextInt();
		else {
			System.err.println("\nWrong value Provided: "+scanner.next()+"\nProvide Only integer value");
			System.err.flush();
		}
		//scanner.close();
		return input;
	}
	
	public static int[] arrayOfInts(){
		System.out.println("Provide your input as space-sepearted integer values. Press Enter when done:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		String[] inputStr = line.split("\\s+");
		int[] inputIntArr = new int[inputStr.length];
		int j = 0;
		try{
			for(String str : inputStr) {
				inputIntArr[j++] = Integer.parseInt(str);
			}
		}
		catch(NumberFormatException e){
			e.printStackTrace();
		}
		//scanner.close();
		return inputIntArr;
	}
	
	public static char singleChar(){
		System.out.println("Provide your input as single character value. Press Enter when done:");
		Scanner scanner = new Scanner(System.in);
		char input = '\u0000',ch;
		if(scanner.hasNext()) {
			ch = scanner.next().charAt(0);
			if(Character.isLetter(ch))
				input = ch;
			else System.err.println("Invalid Input, Not a Char" + ch);
		}
		//scanner.close();
		return input;
	}
	
	public static char[] arrayOfChars(){
		System.out.println("Provide your input as space-sepearted character values. Press Enter when done:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		String[] inputStr = line.split("\\s+");
		char[] inputCharArr = new char[inputStr.length];
		int j = 0;
		try{
			for(String str : inputStr) {
				char ch = str.charAt(0);
				if(Character.isLetter(ch))
					inputCharArr[j++] = ch;
				else System.err.println("Invalid Input, Not a Char: " + ch);				
			}
		}
		catch(NumberFormatException e){
			e.printStackTrace();
		}
		//scanner.close();
		return inputCharArr;
	}
	
	public static String singleString(){
		System.out.println("Provide your input as single String. Press Enter when Done:");
		Scanner scanner = new Scanner(System.in);
		String input = " ";
		if(scanner.hasNextLine())
			input = scanner.nextLine();
		//scanner.close();
		return input;
	}
	
	public static String[] arrayOfStrings(){
		System.out.println("Provide your input as Enter-sepearted String values. Press Blank Enter when done:");
		Scanner scanner = new Scanner(System.in);
		List<String> strList = new ArrayList<String>();
		while(scanner.hasNextLine()) {
			String line = scanner.nextLine();
			if(line.length()>0)
				strList.add(line);
			else break;
		}
		String[] inputStr = new String[strList.size()];
		int j = 0;
		for(String s : strList)
			inputStr[j++]=s;
		//scanner.close();
		return inputStr;
	}
	
	public static ArrayList<String> listOfStrings(){
		System.out.println("Provide your input as Enter-sepearted String values. Press Blank Enter when done:");
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> strList = new ArrayList<String>();
		while(scanner.hasNextLine()) {
			String line = scanner.nextLine();
			if(line.length()>0)
				strList.add(line);
			else break;
		}
		//scanner.close();
		return strList;
	}
	
	public static String[] arrayOfWords(){
		System.out.println("Provide your input as space-sepearted Word values. Press Enter when done:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		String[] inputStr = line.split("\\s+");
		//scanner.close();
		return inputStr;
	}
	
	public static void main(String[] args) {
		int i = singleInt(); System.out.println(i);
		int[] iArr = arrayOfInts(); for(int j : iArr) System.out.println(j);
		char c = singleChar(); System.out.println(c);
		char[] cArr = arrayOfChars(); System.out.println(cArr);
		String s = singleString(); System.out.println(s);
		String[] sArr = arrayOfWords(); for(String j : sArr) System.out.println(j);
		String[] sArr1 = arrayOfStrings(); for(String j : sArr1) System.out.println(j);
		List<String> sList = listOfStrings(); System.out.println(sList);
		System.exit(0);
	}
}
