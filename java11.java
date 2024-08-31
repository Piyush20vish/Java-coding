// PART-11 FUNCTIONS & METHOD'S

// function without paramater

//  public class java11 {// ye ek class he agr hum class ke andar function ko likhte he to ye function is class ke method ho jate he
   
//    public static void printHelloWorld(){
//       System.out.println("Hello World");
      
//    }

//     public static void main(String args[]){
//       printHelloWorld(); //function call
//        }
//  }

// SYNTAX OR Function with parameter
// import java.util.*;
// public class java11 {
//   public static void printhelloworld(){
//    System.out.println("hello world");
//    System.out.println("hello world");
//    System.out.println("hello world");
//  }

//  public static void calculateSum(int num1,int num2){// paramter , formal parameter
//    int sum = num1 + num2;
//      return sum;
//  }

//  public static void main(String args []){
//    Scanner sc = new Scanner(System.in);
//    int a = sc.nextInt();
//    int b = sc.nextInt();
//    int sum = calculateSum(a ,b); //argument, actual paramter
//   System.out.println("sum is "+ sum);
  
//  }
// }

// SWAPPING CALL BY VALUE EXample

// import java.util.*;
// public class java11 {
  
// public static int calculateSum(int num1,int num2){
//    int sum = num1 + num2;
//      return sum;
//  }

// public static void swap (int a , int b ){
//   int temp = a ;
//      a = b ;
//      b = temp;
//   // System.out.println("a is"+ a);
//   //  System.out.println("b is "+ b);
// }
//  public static void main(String args []){
//     int a = 4;
//     int b   = 9;
  
//     swap(a ,b);
//      System.out.println("a is"+ a);//A KI VALUE 4  print hogi kyoki ye uparwale fun call me iski limit vahi tk he jais hi uska execution pura hoke end hua to phir vo end 
//    System.out.println("b is "+ b);

    
//  }
// }

  //PRODUCT OF A & B ;

// import java.util.*;
// public class java11 {
  
// public static int multiply(int a,int b){
//    int product = a*b ;
//      return product;
//  }

//  public static void main(String args []){
//     int a = 4;
//     int b   = 9;
  
//       int prod = multiply(a ,b);
//       System.out.println("a*b="+prod);
//      int prodc = multiply(10,20);
//       System.out.println("a*b="+prodc);
    
//  }
// }

//FACTORIAL OF A NUMBER , N (N IS USER INPUT).
// import java.util.*;
// public class java11 {
  
// public static int fact(int n){
//    int f = 1;
//    for(int i = 1; i <= n ; i++){
//     f = f*i;
//    }
//      return f;// factorial of n
//  }

  
//  public static void main(String args []){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("type here number for factorial");
//     int n = sc.nextInt();
//     int val = fact(n);
//    System.out.println(val);
// // System.out.println(fact(n));
       
    
//  }
// }

  // // Binomial Coefficient
// //nCr = n!/r!(n-r)!

// import java.util.*;
// public class java11 {
  
// public static int fact(int n){
//    int f = 1;
//    for(int i = 1; i <= n ; i++){
//     f = f*i;
//    }
//      return f;// factorial of n
//  }

//  public static int bincoeff(int n ,int r){
//     int fact_n = fact(n);
//      int fact_r = fact(r);
//       int fact_nmr = fact(n-r);
//       int bincoeff = fact_n/(fact_r*fact_nmr);
//       return bincoeff;
      

//  }
//  public static void main(String args []){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("type here number for factorial");

//     System.out.println(bincoeff(5,2));
//  }
// }
//

  // functon overloadin usig paramter

// import java.util.*;
// public class java11 {
// //   // fun to calculate sum of 2 
// // public static int sum(int a,int b){
// //      return a+b;
// //  }
// //   // fun to calculat sum of 3
// //  public static int sum(int a ,int b,int c){
// //      return a+b+c;

//   // funcion overloading using data types

//  // fun to calculate int sum  
// public static int sum(int a,int b){
//      return a+b;
//  }
//   // fun to calculat floatsum 
//  public static float sum(float a ,float b){
//      return a+b;
//  }
//  public static void main(String args []){
    
//     System.out.println(sum(5,2));
//         System.out.println(sum(5.3f,2.1f));
//  }
// }


//   // check if a number is prime or not 

//   import java.util.*;
// public class java11 {
//   // only for n>=2
// public static boolean isprime(int n){
//       //boolean isprime = true;

//       // corner case 
//       // 2
//       if (n == 2){
//         return true;
//       }

//       for ( int i = 2; i<=n-1 ; i++){
//          if ( n % i ==0){
//               //isprime = false;
//           return false;
//          }
//       }  
//       return true ;
//  }
  
//  public static void main(String args []){
    
//     System.out.println(isprime(1));
//  }
// }

// OPTIMIZED - check if a number is prime or not 

//   import java.util.*;
// public class java11 {
// public static boolean isprime(int n){
//       if (n == 2){
//         return true;
//       }

//       for ( int i = 2; i<= Math.sqrt(n) ; i++){
//          if ( n % i ==0){
//           return false;
//          }
//       }  
//       return true ;
//  }
  
//  public static void main(String args []){
    
//     System.out.println(isprime(1));
//  }
// }

  // Print all primes in range 

// import java.util.*;
// public class java11 {
// public static boolean isprime(int n){
//       if (n == 2){
//         return true;
//       }

//       for ( int i = 2; i<= Math.sqrt(n) ; i++){
//          if ( n % i ==0){
//           return false;
//          }
//       }  
//       return true ;
//  }
  
//   public static void primesInRange(int n ){
//      for( int i = 2 ; i<= n ; i++){
//         if (isprime(i)){
//           System.out.print(i + "");
//         }
//      }
//      System.out.println();
//   }

//  public static void main(String args []){
    
//     primesInRange(20);
//  }
// }


// Binary to decimal 

// import java.util.*;
// public class java11 {

//   public static void binToDec(int binNum ){
      
//     int myNum = binNum ;
//     int pow = 0 ;
//     int decNum = 0;
//      while (binNum >0){
//       int lastDigit = binNum % 10;
//       decNum = decNum +(lastDigit* (int)Math.pow(2,pow));
//       pow++;
//       binNum = binNum/10;
//      }
//      System.out.println("decimal of myNum"+ myNum + " " +"="+ decNum );
//   }

//   // DECIMAL to BINARY  
//    public static void decToBin(int n ){
//     int myNum = n;
//     int pow = 0;
//     int binNum = 0;
//     while (n>0){
//       int rem = n % 2;
//       binNum = binNum+(rem * (int)Math.pow(10,pow));
//       pow++;
//       n = n/2;
//     } 
//     System.out.println("binary form of"+ myNum + "=" + binNum );
//    }
//  public static void main(String args []){
    
//     binToDec(101);
//      decToBin(7);
//  }
// }


//  practice 

// import java.util.*;
// public class java11 {
//   public static void main (String args[]){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("input the first number");
//     double x = sc.nextDouble();
//      System.out.println("input the second number");
//     double y = sc.nextDouble();
//      System.out.println("input the third number");
//     double z= sc.nextDouble();
//     System.out.println("the avg of three num is "+ average(x,y,z));
//   }

//   public static double average (double x,  double y , double z ){
     
//     return (x + y + z)/3;
//   }
// }

// 2nd 
// import java.util.*;
// public class java11 {
//   public static void main (String args[]){
//     Scanner sc = new Scanner(System.in);
    

//     System.out.println("type any integere");
//     int num = sc.nextInt();
     
//      if (isEven(num)){
//       System.out.println("Number is even");
//      }else   {
//        System.out.println("Number is odd");
//      }
//   }

//   public static boolean isEven (  int num){
//      if (num % 2 == 0){
//         return true ;
//      }else {
//       return false;
//      }
  
//   }
// }

//5th
import java.util.Scanner;public class Solution{
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Input an integer: ");
    int digits = sc.nextInt();
    System.out.println("The sum is "+sumDigits(digits));
    }
    public static int sumDigits(int n) {
      int sumOfDigits = 0 ; 
      while(n>0) { 
        int lastDigit = n % 10;
        sumOfDigits+= lastDigit;
        n/=10;
        }
        return sumOfDigits;
     }
   }
       