//The problem is to check whether a given Sudoku solution is correct.

//Prepared by Khushi Shah 21CE127


import java.util.Scanner;
public class practical1_9
{
public static void main (String[]args)
{
Scanner sc = new Scanner (System.in);
int[][] a = new int[9][9];
int f, ans = 0;
for (int i = 0; i < 9; i++)
{
for (int j = 0; j < 9; j++)
{
a[i][j] = sc.nextInt ();
}
}
for (int i = 0; i < 9; i++)
{
for (int j = 0; j < 9; j++)
{
ans = ans ^ a[i][j];
}
}
if (ans == 1)
System.out.println ("YES");
else
System.out.println ("NO");
}
}
