package _01_Simple_Array_Algorithms;

import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.
public static void main(String[] args) {
	
}

public static void allString(String[] str) {
	for (int i = 0; i < str.length; i++) {
		System.out.println(str[i]);
		
	}
}

    //2. Write a method that takes an array of Strings and prints all the Strings in the array.



    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.
public static void backward(String[] str) {
for (int i =str.length-1; i>=0; i--) {
	System.out.println(str[i]);
}
}

    //4. Write a method that takes an array of Strings and prints every other String in the array.
public static void second(String[] str) {
	for (int i = 0; i < str.length; i++) {
if (i%2==0) {
	System.out.println(str[i]);
}
		}
	}
	
    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.
public static void randy(String[] str) {
Random hmmm= new Random();
for (int i = 0; i < str.length; i++) {
	i=hmmm.nextInt(str.length);
}

}

}