





import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


// ENUNCIADO:

// Aparició dígit:

/* Fes un programa que llegeixi un nombre enter N positiu i un dígit X i escrigui quantes vegades el dígit apareix dins del nombre.

Input Format

N: nombre enter positiu.

X: dígit.

Constraints

Suposem els dos nombres enters positius i X<10.

Output Format

Nombre de vegades que apareix el dígit.

Sample Input 0

121 1
Sample Output 0

2
Sample Input 1

1234567890 4
Sample Output 1

1
Sample Input 2

11111 5
Sample Output 2

0

*/




public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();



        int rest;
        int div = N;
        int inv = 0;
        int counter = 0;


        while (div != 0)
        {
            rest = div % 10;
            div = div / 10;
            inv = inv * 10 + rest;
            if (rest == X)
            {
                counter++;
            }

        }
        System.out.println(counter);
    }
}
