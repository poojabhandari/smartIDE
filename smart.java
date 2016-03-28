import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   	// TODO Auto-generated method stub
   	 Scanner sc = new Scanner(System.in);
   	 boolean flag=false;
   	 while(sc.hasNextLine())
   	 {
   		 flag=false;
   		 String curLine = sc.nextLine();
   		 if(curLine.contains("//"))
   		 {
   			 System.out.println(curLine.substring(curLine.indexOf("//")).trim());
   			 flag=true;
   		 }
   		  if(curLine.contains("/*"))
   		 {
   			 int idxStart = curLine.indexOf("/*");
   			 if(curLine.contains("*/"))
   			 {
   				 int idxEnd = curLine.indexOf("*/")+2;
   				 System.out.println(curLine.substring(idxStart,idxEnd).trim());
   			 }
   			 else
   			 {
   				 while(sc.hasNextLine())
   				 {
   					 while(!curLine.contains("*/"))
   					 {
   						 System.out.println(curLine.trim());
   						 curLine = sc.nextLine();
   					 }
   					 System.out.println(curLine.substring(0,curLine.indexOf("*/")+2).trim());
   					 break;
   				 }
   			 }
   		 }
   		 
   		  if(flag==false && curLine.contains("//"))
   			 {
   				 System.out.println(curLine.substring(curLine.indexOf("//")).trim());
   			 }
   	 }

    
    }
}
