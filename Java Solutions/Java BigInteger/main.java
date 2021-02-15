import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        BigInteger a;
        BigInteger b;
        BigInteger sum = BigInteger.valueOf(0);
        BigInteger multiply = BigInteger.valueOf(0);
        
        a = new BigInteger(scan.nextLine());
        b = new BigInteger(scan.nextLine());
        
        sum = sum.add(a);
        sum = sum.add(b);
        multiply = a.multiply(b);
        
        System.out.println(sum);
        System.out.println(multiply);
    }    
}
