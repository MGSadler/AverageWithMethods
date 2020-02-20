/* The program prompts the user for five to ten numbers, all on one line, and separated by spaces.
Then the program calculates the average of those numbers, and displays the numbers and their average to the user.

*The program uses methods to:
1. Get the numbers entered by the user
2. Calculate the average of the numbers entered by the user
3. Print the results with the whole number, a decimal, and two decimal positions

*The first method should take no arguments and return a String of numbers separated by spaces.

*The second method should take a String as its only argument and return a double (the average).

*The third method should take a String and a double as arguments but have no return value.

For example, if the user input is...  20 40 60 80 100

...the program should give as output...  The average of the numbers 20 40 60 80 100 is 60.00.

Thoughts
Refer to Horstmann chapter 2 for details on formatting output values.
 */
package averagewithmethods;

import java.util.Scanner;
        
public class AverageWithMethods{
    
    static String getInput(){
        Scanner input = new Scanner(System.in);
        String numbers = input.nextLine();
        return numbers;
    }
    static double avg (String nums){
        String a[] = nums.trim().split(" ");
        double sum = 0;
        for (String a1 : a) {
            sum = sum + Double.parseDouble(a1);
        }
        return sum / a.length;
    }
    static void print (String nums, double avg){
        System.out.format("The average of the numbers %s" + " is %.2f\n", nums, avg);
    }
    public static void main(String[] args){
        System.out.println("Please enter between 5 and 10 numbers on one line, separated by spaces: ");
        String nums = getInput();
        int length = nums.trim().split(" ").length;
        if (length < 4 || length > 9){
            System.out.println("More than 10 numbers or less than 5 numbers have been entered.");
            return;
        }
        double avg = avg(nums);
        print(nums, avg);
    }
}
        
    

