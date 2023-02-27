// ************************************************************************
// Diamond.java
// John Sabovik
// CS114
// 2/27/23
/* Description: The program takes a number that is input by a user and
if it is determined to be even it will print a diamond out of rows of
asterisks with spaces, with the center row being the inputted number wide
in asterisks. If the number input is odd it will print a diamond out of
rows of asterisks with no spaces, and the center row will be the inputted
number wide.
*/
// ************************************************************************

import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int num = sc.nextInt();
    printDiamond(num);
  }

  public static void printDiamond(int num) {
    boolean isEven = (num % 2 == 0); // Determines if the number entered is even

    int space = num - 1 ;
    if (isEven == true) { // If found true then it runs the following code for the even number
      for (int row = 0; row < num + 1; row++) { // For loop for rows
        if (row < (num / 2 + 1)) { // Top section of diamond
          for (int column = 0; column < space + 1; column++) {
            if (row == 0 && column == space) { // First line star
              System.out.print("*");
            } else {
              System.out.print(" ");
            }
          }
          space = space - 2;
          for (int column = 0; column < 2 * row; column++) { // For loop for columns, prints top half of diamond
            System.out.print("* ");
          }
          System.out.println("");
        } else if (row >= (num /2 + 1)) { // Bottom section of diamond
          space = row*2 - num;
          for (int column = 0; column < space; column++) {
            if (row == num && column == space - 1) { // Last line star
              System.out.print("*");
            } else {
              System.out.print(" ");
            }
          }
          for (int column = 0; column < 2 * (num - row); column++) { // For loop for columns, prints bottom half of diamond
            System.out.print("* ");
          }
          System.out.println("");
        }

      }
    } else { // If number is found to be not even then this runs for the odd numbers
      for (int row = 0; row < num; row++) { // For loop for rows
        if (row < (num / 2 + 1)) {
          for (int column = 0; column < space; column++) { // For loop for columns spacing
            System.out.print(" ");
          }
          space--;
          for (int column = 0; column < 2 * row + 1 ; column++) { // For loop for printing the top half of diamond
            System.out.print("*");
          }
          System.out.println("");
        } else if (row >= (num /2 + 1)) {
          space = row;
          for (int column = 0; column < space; column++) { // For loop for column spacing
            System.out.print(" ");
          }
          for (int column = 0; column < 2 * (num - row) - 1 ; column++) { // For loop for printing the bottom half of diamond
            System.out.print("*");
          }
          System.out.println("");
        }

      }
    }

  }
}
