package interview1;
//import java.util.*; 

public class Myclass {
// The following function will return true or false to call from main function
 boolean verifyingUniqueCharacters(String s) 
 { 
	 // if string length is>256, then there must be few strings already duplicate so not too check further
	 
	 if(s.length()>256) return false;
	 //create an array of 256 size.
	 boolean array[];
	 array= new boolean[256];
	 for(int i=0;i<s.length();i++) {
		 //fetch the first character
		 char ans = s.charAt(i);
		 //get the ASCII of each character.
		 //(int) ans --> changes string value to int value is ASCII
		 
		 int value =(int) ans;
		 // if (array[value]) exists already means this time is duplicate charater so return false
		 
		 if(array[value]== true)
			 return false;
		 //otherwise assign true in that particular the array box.
		 array[value]=true;
		 
	 }
	 return true; // if all characters pass true then return true.

 } 


 public static void main(String args[]) 
 { 
     Myclass obj = new Myclass(); 
     String input_user = "Turkey"; 

     if (obj.verifyingUniqueCharacters(input_user)) 
         System.out.println("The String " + input_user 
           + " has all unique characters"); 
     else
         System.out.println("The String " + input_user 
        + " has duplicate characters"); 
 } 

}
