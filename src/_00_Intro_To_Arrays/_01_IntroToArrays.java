package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
String[] test= {"first","second","third","fourth","fifth"};
        // 2. print the third element in the
System.out.println(test[3]);
        // 3. set the third element to a different value
test[3]="hello";
        // 4. print the third element again
System.out.println(test[3]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
for(int i=0; i<test.length;i++) {
	test[i]="new string";
}
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
for(int i=0; i<test.length;i++) {
	System.out.println(test[i]);
}
        // 7. make an array of 50 integers
int[] fiftyints= new int[50];
        // 8. use a for loop to make every value of the integer array a random
        //    number
Random randy= new Random();
for(int i=0; i<fiftyints.length;i++) {
	fiftyints[i]= randy.nextInt(500);
}

        // 9. without printing the entire array, print only the smallest number
        //    on the array
int smallest=fiftyints[0];
for(int i=1; i<fiftyints.length;i++) {
	if(smallest>fiftyints[i]) {
		smallest=fiftyints[i];
	
	}
	System.out.println(fiftyints[i]);
	
}
System.out.println(smallest);
        // 10 print the entire array to see if step 8 was correct
//done.
        // 11. print the largest number in the array.
int greatest=fiftyints[0];
for(int i=1; i<fiftyints.length;i++) {
	if(greatest<fiftyints[i]) {
		greatest=fiftyints[i];
	
	}
	
}
System.out.println(greatest);
        // 12. print only the last element in the array
System.out.println(fiftyints[fiftyints.length-1]);
    }
}
