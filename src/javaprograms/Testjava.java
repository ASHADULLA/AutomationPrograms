package javaprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Testjava {

	public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int b=Integer.parseInt(br.readLine());
        String c=br.readLine();
        // Complete this line
        // Complete this line

        System.out.println(a);
          System.out.println(b);
          System.out.println(c);
        // Complete this line
        // Complete this line
          scan.close();
    }

}
