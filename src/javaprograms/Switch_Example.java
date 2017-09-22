package javaprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Switch_Example {

	public static void main(String[] args) throws NumberFormatException, IOException {
	System.out.print("Enter Your Choice: ");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int a=Integer.parseInt(br.readLine());
    switch(a)
    {
    case '1': System.out.println("One"); break;
    case '2': System.out.println("Two"); break;
    case '3': System.out.println("Three"); break;
    default: System.out.println("Wrong value");
	}
	}}

