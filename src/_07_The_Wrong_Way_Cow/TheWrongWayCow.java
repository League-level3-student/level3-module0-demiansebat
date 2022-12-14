/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
*/

package _07_The_Wrong_Way_Cow;

import java.util.Iterator;

public class TheWrongWayCow {

    public static int[] findWrongWayCow(final char[][] field) {
        // Fill in the code to return the [col, row] coordinate position of the
        // head (letter 'c') of the wrong way cow!
    	int up=0;
    	int upX=0;
    	int upY=0;
    	
    	int down=0;
    	int downX=0;
    	int downY=0;
    	
    	int right=0;
    	int rightX=0;
    	int rightY=0;
    	
    	int left=0;
    	int leftX=0;
    	int leftY=0;
for (int i = 0; i < field.length; i++) {
	for (int j = 0; j < field[i].length; j++) {
		
		if ( i+2<field.length && field[i][j]=='c' && field[i+1][j]=='o' && field[i+2][j]=='w') {
			up++;
			upX=j;
			upY=i;
		}
		if ( i-2>=0  && field[i][j]=='c' && field[i-1][j]=='o' && field[i-2][j]=='w') {
			down++;
			downX=j;
			downY=i;
		}
		if ( j+2<field[i].length && field[i][j]=='c' && field[i][j+1]=='o' && field[i][j+2]=='w') {
			right++;
			rightX=j;
			rightY=i;
		}
		if ( j-2>=0 && field[i][j]=='c' && field[i][j-1]=='o' && field[i][j-2]=='w') {
			left++;
			leftX=j;
			leftY=i;
		}
		
	}
}
			
		
if (up==1) {
    return new int[]{upX,upY};
}
if (down==1) {
    return new int[]{downX,downY};
}
if(right==1) {
    return new int[]{rightX,rightY};
}
if(left==1) {
    return new int[]{leftX,leftY};
}
return null;
    }
  
}
