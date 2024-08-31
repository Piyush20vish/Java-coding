// first while loop program

// import java.util.*;
// public class java9{
//     public static void main(String args[]){
//         int counter = 0;
//         while(counter<100){
//             System.out.println("hello world ");
//             counter++;
//           }
//      System.out.println(" printed hw 100x")
//             }
// }

// print num from 1 to 10;

// import java.util.*;
// public class java9{
//     public static void main(String args[]){
//         int counter = 1;
//         while(counter<=10){
//             System.out.println(counter);//ek hi line me krne ke liye print se ln remove
//             counter++;
//           }
//      System.out.println(" num 1 to 10");
//             }
// }

// Print number from 1 to n from user ,n is user input;

// import java.util.*;
// public class java9{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int range = sc.nextInt();
//         int counter= 1;
//         while(counter<=range){
//             System.out.print(counter); 
//             counter++;
//           }
//      System.out.println();
//             }
// }

// print sum of first n natural number;

// import java.util.*;
// public class java9{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int i = 1;
//         int sum = 0;
//         while(i <=n){
//             sum = sum +i;
//             i++;
//           }
//      System.out.print("sum is "+sum); 
//             }
// }

 // For loop basic 

//  import java.util.*;
// public class java9{
//     public static void main(String args[]){
        //  for(int i =1;i<=10;i++){
        //     System.out.println("hw");
        //  }

        // for(int line =1;line<=4;line++){
        //     System.out.println("****");
        //    }

        // int line = 1;
        // while (line<=4){
        //     System.out.println("****");
        //     line++;
//         }
//     }
// }

   //  EXTRA QUESTION
 
// print reverse of a number n = 10899;

// import java.util.*;
// public class java9{
//     public static void main(String args[]){
//          Scanner sc = new Scanner(System.in);
//          System.out.println("type a number");
//          int n = sc.nextInt();
//          while (n>0){
//             int lastDigit  = n%10;
//             System.out.print(lastDigit);
//             n = n/10;
//          }
//          System.out.println();
//     }
// }

// print reverse of number but same line me ek bar me 

// import java.util.*;
// public class java9{
//     public static void main(String args[]){
//          Scanner sc = new Scanner(System.in);
//          System.out.println("type a number");
//          int n = sc.nextInt();
//          int rev=0;
//          while (n>0){
//             int lastDigit  = n%10;
//           rev = ( rev*10)+lastDigit;
//             n = n/10;
//          }
//          System.out.println(rev);
//     }
// }


  // BREAK STATEMENT

//    import java.util.*;
//    public class java9{
//     public static void main(String args[]){
//        for (int i =1;i<=10;i++) {
//          if(i ==5){
//             break;
//           }
//         System.out.println("hw");
//         }  
    
//         System.out.println("im out of the loop") ;

//       }
//   }

 // BREAK 2ND EXAMPLE
 //KEEP ENTERING NUM TILL USER ENTERKS MULTIPLE OF 10

//  import java.util.*;
//    public class java9{
//     public static void main(String args[]){Scanner sc = new Scanner(System.in);
//         do {
//             System.out.println("enter a number");
//             int n = sc.nextInt();
//              if (n%10==0){
//                  break;
//              }
//              System.out.println(n);
//         }while(true);
//        System.out.println("the num is multiple of 10");
        
//       }
//   }

   //CONTINUE STATEMENT

//   import java.util.*;
//    public class java9{
//     public static void main(String args[]){
//        for (int i =1;i<=10;i++) {
//          if(i ==5){
//             continue;
//           }
//         System.out.println(i);
//         }  
    
//         System.out.println("5 is skip bc of continue ") ;

//       }
//   }

//CONTINUE 2ND EXAMPLE 
// display all numbers entered by user except numtiple of 10;

//  import java.util.*;
//    public class java9{
//     public static void main(String args[]){Scanner sc = new Scanner(System.in);
//         do {
//             System.out.println("enter your number");
//             int n = sc.nextInt();
//              if (n%10==0){
//                  continue;
//              }
//              System.out.println("number was :"+n);
//         }while(true);
       
//       }
//   }


// CHECK IF A NUMBER IS PRIME OR NOT ??

//  import java.util.*;
//    public class java9
// {
//     public static void main(String args[])
//     {
//        Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//          if (n == 2)
//           {
//            System.out.println("n is prime");
//           }

//          else 
//          {
//            boolean isPrime = true;
//              for (int i =2;i<=Math.sqrt(n);i++) 
//               {
//                 if(n % i ==0)// n is multiple of i (i not equal to 1 or n)
//                   {  
//                      isPrime = false;
//                   }
//               }
           

//             if (isPrime == true){
//                 System.out.println("n is prime");
//             }else {
//               System.out.println("n is not prime");
//                   }
//          }
//    }
// }


// // ASSIGMENT PRACTICE QUE 

// 1st

// import java.util.*;
// public class java9{
//     public static void main(String args []){
//         for(int i =0; i<5 ; i++){
//             System.out.println("hello");
//             i+=2;
//         }
//     }
// }


//2nd  
 
// do while is liye kyoi ek bar pehle chalana he jaise user se 5 input or 1 choice len he

// import java.util.*;
// public class java9{
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
//         int number;
//         int choice;
//         int evenSum= 0;
//         int oddSum=0;
         

//         do {
//             System.out.println("enter the number");
//             number = sc.nextInt();

//             if(number%2==0){
//             evenSum= evenSum+number;
//             }

//             else {
//                 oddSum = oddSum+number;
                 
//             }
//             System.out.println("do you continue ? press 1 for (add more number)yes or 0 for no(for stop and want sum)");
//        choice = sc.nextInt();

//         }while(choice==1);

//         //when while false then below sys is print when user gives 1 the loop is pir se chalega 
    
//         System.out.println(evenSum);
//         System.out.println(oddSum);
//     }
// }


// 3rd 
// import java.util.*;
// public class java9{
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         System.out.println("enter a number for factorial")
//         int number = sc.nextInt();
//         int fact = 1;

//         for (int i =1; i<=number ;i++){
//             fact *=i;
//         }
//         System.out.println(fact);

         
         
//     }
// }


// 4th que 

// import java.util.*;
// public class java9{
//     public static void main(String args[]){
//  Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for (int i =1; i <=10 ; i++){
//        //int table = n*i;
//         //System.out.println(table);
//         System.out.println(n*i);
//     }

// }
// }