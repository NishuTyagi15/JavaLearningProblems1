import java.lang.Math;
import java.time.ZoneOffset;
import java.util.Scanner;
import java.lang.Integer;

// PROBLEM 1 FLIP COIN
public class LearningProblems {
    public static void main (String[] args) {

        // WELCOME MESSAGE
        System.out.println("Welcome to Basic Core Programs!");

        // PROBLEM 1 FLIP COIN

        // INITIALIZATION
        int n, HCount = 0, TCount = 0;
        double heads, tails;

        // INPUT DATA
        Scanner S1 = new Scanner(System.in);
        System.out.println("Enter the No. of Times Coin Flips : ");
        n = S1.nextInt();

        // COMPUTATAION
        for( int i = 0; i < n; i++) {
            double a = Math.random();
            if (a < 0.5)
                TCount++;
            else
                HCount++;
        }
        heads = HCount / (double) n * 100;
        tails = TCount / (double) n * 100;
        System.out.println("Percentage of Heads : " + heads + "%");
        System.out.println("Percentage of Tails : " + tails + "%");

        // PROBLEM 2 LEAP YEAR
        // INPUT DATA
        Scanner S2 = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = S2.nextInt();
        
            // COMPUTATION
            if(year>999 && year<10000) {
                if(year%4 ==0 && year%100 !=0 || year%400 ==0 ) {
                    System.out.println("This Year is a Leap Year");

        	    }

        	    else {
                    System.out.println("This Year is not a Leap Year");
        	    }
            }

        // PROBLEM 3 POWER OF TWO

        int k = Integer.parseInt(args[0]);
              
        int j = 0;
        int p = 1;     

        while (j <= k) {
            System.out.println("Power of Two Series : ");
            System.out.println(j + " " + p);   
            p = 2 * p;                
            j++;
        } 
        
        // PROBLEM 4 HARMONIC NUMBER

        System.out.print("Enter any number : ");
        Scanner S3 = new Scanner(System.in);
        int N = S3.nextInt(); double res = 0;
        while(N > 0) {
            res = res + (double) 1 / N;
            N--;

        }
        System.out.println("The Value Of Nth Harmonic Number  " + res);

        // PROBLEM 5 PRIME FACTORIZATION

        int num;
        Scanner S4 = new Scanner(System.in);
        System.out.println("Enter a number : ");
        num = S4.nextInt();

        for(int x = 2; x*x <= num; x++) {
            while(num%x == 0) {
                num = num/x;
                System.out.println(x);
            }
        }

        // PROBLEM 6 QUOTIENT AND REMAINDER

        System.out.println("Enter the dividend");
        Scanner S5 =new Scanner(System.in);
        int divi = S5.nextInt();
        System.out.println("Enter the divisor");
        Scanner S6 = new Scanner(System.in);
        int div = S6.nextInt();

        int Quotient = divi/div;
        int Remainder = divi%div;
        System.out.println("The quotient and remainder are "+ Quotient+" "+ "and"+" "+ Remainder);

        // PROBLEM 7 SWAP TWO NUMBERS

        System.out.println("Enter the Two numbers you want to Swap : ");  
        Scanner S7 =new Scanner(System.in);
        int y = S7.nextInt();
        Scanner B = new Scanner(System.in);
        int z = B.nextInt();
        System.out.println("value of x :" + y);  
        System.out.println("value of y:" + z);  
        System.out.println("After swapping the Numbers");  
        y = y + z;  
        z = y - z;  
        y = y - z;  
        System.out.println("value of x:" + y);  
        System.out.println("value of y:" + z); 

        // PROBLEM 8 EVEN ODD NUMBERS

        System.out.println("Enter the  number : ");  
        Scanner S8 =new Scanner(System.in);
        int q = S8.nextInt();

        if(q%2==0) {
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }

        // PROBLEM 9 VOWELS AND CONSONANTS
        
        System.out.println("Enter the alphabet ");
		Scanner S9 =new Scanner(System.in);
		String character = S9.next();
			        
		switch (character) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U":
			{
                System.out.println(character + " is vowel");
			    break;
            }    
			default: {
                System.out.println(character + " is consonant");
			}
        }

        // PROBLEM 10 LARGEST AMONG THREE NUMBERS

        int f, s, t;
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        f = s1.nextInt();
        Scanner s2 = new Scanner(System.in);
        System.out.print("Enter the second number : ");
        s = s2.nextInt();
        Scanner s3 = new Scanner(System.in);
        System.out.print("Enter the third number : ");
        t = s3.nextInt();
        if(f > s && f > t) {
            System.out.println("Largest number is : "+f);
        }
        else if(s > t) {
            System.out.println("Largest number is : "+s);
        }
        else {
            System.out.println("Largest number is : "+t);
        }

        // FUNCTIONAL PROGRAMS

        // PROBLEM 2 SUM OF THREE INTEGERS ADD TO ZERO

        int arr[] = {1, 0, 2, -4, 3};
        int array = arr.length;
        int count=0;
        
        for (int b = 0; b < array-2; b++) {
            for (int e = b + 1; e < array-1; e++) {
                for (int r = e + 1; r < array; r++) {
                    if (arr[b] + arr[e] + arr[r] == 0) {
        System.out.println(arr[b]+ " " + arr[e] + " " + arr[r]);
        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
} 