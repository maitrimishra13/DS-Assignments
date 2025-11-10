package assignment1;

import java.util.Scanner;

public class Question5 {
    /*
    Write a program to find sum of every row and every column in a two-dimensional array. 
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

        System.out.println("Enter elements: ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                arr[i][j] = sc.nextInt();
            }
        }


        Question5 obj = new Question5();
        int option;
        
        do{
            System.out.println("\n--MENU--");
            System.out.println("1. ROW SUM");
            System.out.println("2. COL SUM");
            System.out.println("3. EXIT");
            System.out.println("Enter option number : ");
            option = sc.nextInt();
            switch(option){
                case 1 -> obj.rowSum(arr);
                case 2 -> obj.colSum(arr);
                case 3 -> System.out.println("EXIT");
                default -> System.out.println("Enter another option number:");
            }
        } while(option!=3);
        sc.close();
    }
    
    public void rowSum(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = 0; j < arr[i].length; j++){
                sum += arr[i][j];
            }
            System.out.println("The sum of row " + (i+1) + " : " + sum);
        }
    }

    public void colSum(int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;

        for(int j = 0; j < cols; j++){
            int sum = 0;
            for(int i = 0; i < rows; i++){
                sum += arr[i][j];
            }
            System.out.println("Sum of column " + (j+1) + " = " + sum);
        }
    }

}
