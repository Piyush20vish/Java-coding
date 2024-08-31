// part 6,8,7
//OUTPUT PRINT AND VARIABLE
// public class Javabasics
// {
//   public static void main(String args[])
//   {
//      int a = 5;
//      int b = 9;
//      System.out.println(a);
//      System.out.println(b);
//      String name = "alpha";
//      System.out.println(name);
//      a = 50;  
     
//      System.out.println(a);
//   }
// }

  
//   public class Javabasics
// {
//    public static void main(String args[]){
//      byte b = 8;
//      System.out.println(b);
//      boolean var = true;
//          System.out.println(var);
      
//      short num = 668;
//         System.out.println(num);
//     int number = 22;
//             System.out.println(number);
//     long num1 = 76273;
//               System.out.println(num1);
  
//       double price1= 7896.876876875;
//                System.out.println(price1);  
      
                          
//      }
// }


//   public class Javabasics
//  {
//    public static void main(String args[]){
//      int a = 4;
//      int b = 8;
//      int sum = a+b;
//      System.out.println(sum);

//    }
//  }

  //DIFFRENT DATA TYPE INPUT 
  // import java.util.*;
  // public class Javabasics {
  //   public static void main(String args[])
  //   {
  //     Scanner sc = new Scanner(System.in);
      // String input = sc.next();
      // System.out.println(input);

      // String name = sc.nextLine();
      // System.out.println(name);
       
      //  int number = sc.nextInt();
      // System.out.println(number);
    
        // short snumber = sc.nextShort();
        // System.out.println(snumber);
       
        // long lnumber = sc.nextLong();
        // System.out.println(lnumber);
        

      // float price = sc.nextFloat();
      // System.out.println(price);

        // double dprice = sc.nextDouble();
        // System.out.println(dprice);

        // byte by = sc.nextByte();
        // System.out.println(by);

        // boolean fact = sc.nextBoolean();
        // System.out.println(fact);

  //   }
  // }

    // USER INPUT SUM PROGRAM
//  import java.util.*;
//   public class Javabasics {
//     public static void main(String args[])
//     {
//       Scanner sc = new Scanner(System.in);
//       // int a = sc.nextInt();
//       // int b = sc.nextInt();
//       // int product = a*b;
//       // System.out.println(product);
//        float rad = sc.nextFloat();
//        float area = 3.14f * rad* rad;
//        System.out.println(area);
//     }
//   }

//  type  casting
//  import java.util.*;
//      public class Javabasics {
//      public static void main(String args[])
//    { 
//        char ch = 'a';
//         char ch2 = 'd';
//        int number = ch;
//         int number2 = ch2;
//        System.out.println(number);
//         System.out.println(number2);
//          }
//      }
 
//  TYPE PROMOTION 1st condition
//  import java.util.*;
//      public class Javabasics {
//      public static void main(String args[])
//    { 
          // Char a = 'a';
          // char b = 'b';
          // char c = a-b; // showing error bcz of con int m kiya then usko char me store kr rahe 

        // System.out.println((int)(b));
        // System.out.println((int)(a));
        //  System.out.println(b-a);


            // short a = 4;
            // byte  b = 23;
            // char c = 'c';
            // byte bt = a+b+c;  // (during expresion a,b,c convert to int and we can't store int  into byte data type)  
            // byte bt = (byte) (a+b+c); 
            // System.out.println(bt);   

        
    //      }
    //  }

  //   TYPE PROMOTION 2ND CONDITION - (exp me jo largest data type hoga vo usme convert kr dega expre krte time,int float double convert to double.) 

    //  import java.util.*;
    //  public class Javabasics {
    //  public static void main(String args[])
        // {
          // int a = 10;
          // float b = 22.4f;
          // long c = 30;
          // double d = 45;
          //  float ans = (float) (a + b + c + d);
          //  System.out.println(ans);
           //2nd 
    //        byte b = 5;
    //         // byte a = b*2; // error bcz int to byte conversion not support
    //         byte a = (byte)(b*2); // chnage int into byte
    //         System.out.println(a);

    //      }
    //  }

  //  TYPE CONVERSION
  // import java.util.*;
  //   public class Javabasics 
  //   {
  //    public static void main(String args[])
  //     { 
  //       // int a = 24;
  //       // int b = a;
  //       // long a = 34; error ( long bada he int se )
  //       // int b = a;
  //       //  System.out.print(b);
  //       Scanner scn = new Scanner (System.in);
  //        double a = scn.nextInt();
  //         double b = scn.nextInt();
  //          double c = scn.nextInt();
  //          double avg = (a+b+c)/3;
  //        System.out.println(avg);
  //     }
  //   }

//  import java.util.*;
//  public class Javabasics{
//    public static void main (String[]args)
  
//   {
//      Scanner scn = new Scanner(System.in);
//      float pencil = scn.nextFloat();
//      float pen = scn.nextFloat();
//      float eraser = scn.nextFloat();
//      float totalPrice = pen+pencil+eraser;
//      System.out.println("total price is "+ totalPrice);
//      float newTotal = (totalPrice*0.18f)+ totalPrice;
//      System.out.println("total price is "+ newTotal);
//   }
//  }

    // pratice que
    // import java.util.*;
    // public class Javabasics {
    //   public static void main (String args[])
    //   {
    //     Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // int avg = (a+b+c)/3;
        // System.out.println(avg);

        //  int side = sc.nextInt();
        //  int area = side*side;
        //  System.out.println(area);

        //  float pencil = sc.nextFloat();
        //  float pen = sc.nextFloat();
        //  float eraser = sc.nextFloat();
        //  float total = pencil + pen + eraser;
        //  float newCost = (total*0.18f)+ total;
        //  System.out.println(newCost);
        
    //         int $ = 24;
    //         System.out.println($)
    //   }
    // }   

   // Arithmetic operator 
  //  import java.util.*;
  //   public class Javabasics {
  //     public static void main (String args[])
      // {
      //   Scanner sc = new Scanner(System.in);   
        // int a = 5;
        // int b = ++a;
        // System.out.println(a);
        // System.out.println(b);

        // int a = 5;
        // int b = a++;
        // System.out.println(a);
        // System.out.println(b);

        // int a = 10; //relatinoal
        // int b = 5;
        // System.out.println(a <=b );

    //    System.put.println( (3>2) && (5>0) ); //AND 

    //   }
    // }

   // Relational operator
// import java.util.*;
//     public class Javabasics {
//       public static void main (String args[]) 
//       {
    //     System.out.println( (3>5) && (5>0) ); //AND

    //     System.out.println( (3>11) 
    //     || (11>9) );// OR

    //     System.out.println( !(100>87) );// NOT 
    //   }
    // } 
 // assignment operator 
    // import java.util.*;
    // public class Javabasics {
    //   public static void main (String args[]) 
    //   {
    //     int a = 4;
    //     //a = a+ 5;
    //     a -= 5;
    //     System.out.println(a);


    //   }
    //}

    // PART 8
    // CONDITINAL STATEMENT

    // import java.util.*;
    //  public class Javabasics {
    //   public static void main (String args[]) 
    //   {
    //      int age = 17;
    //       if (age >= 18)
    //       {
    //         System.out.println("drive adult");

    //       }
    //       if (age >=13 && age <18){
    //         System.out.println("teenager")
    //       }
    //       else {
    //         System.out.println("not adult");
    //       }  
          
    //   }
    // }

     // largest of 2 number
    // import java.util.*;
    //  public class Javabasics {
    //   public static void main (String args[]) 
    //   {
    //     int A = 77;
    //     int B= 4;

    //     if (A>B){
    //       System.out.println("A is largest of 2 number");
    //     } else {
    //       System.out.println("B is largest of 2 number");
    //     }
    //   }
    //  }

     // Number is odd or even ??
  //  import java.util.*;
  //    public class Javabasics {
  //     public static void main (String args[]) 
  //     {
  //       Scanner sc = new Scanner(System.in);
  //       int number = sc.nextInt();

  //       if (number % 2==0){
  //         System.out.println("EVEN");
  //       } else{
  //         System.out.println("ODD");
  //       } 
  //     }
     //}


     // ELSE IF

    //  import java.util.*;
    //  public class Javabasics {
    //   public static void main (String args[]) 
    //   {
    //       int age = 17;
    //       if (age >= 18) // agr else if nhi likhte to ye true ho ya false niche wali condition bhi chek krta hi 
    //       {
    //         System.out.println("drive adult");

    //       }
    //       else if (age >=13 && age <18){
    //         System.out.println("teenager");
    //       } 
    //       else {
    //         System.out.println("not adult");
    //       }  
          
    //   }
    // }

// income tax calculator
    // import java.util.*;
    //  public class Javabasics {
    //   public static void main (String args[]) 
    //   {
    //      Scanner sc = new Scanner(System.in);
    //      int income = sc.nextInt();
    //       int tax ;
    //       if (income <500000) 
    //       {
    //         tax = 0;

    //       }
    //       else if (income >=500000 && income < 1000000){
    //         tax = (int)(income*0.2);
    //       } 
    //       else {
    //        tax = (int)(income*0.3);
    //       }  
    //       System.out.println("Your tax is:"+tax);
    //   }
    // }


    // print tha largest of 3 num
    // import java.util.*;
    //  public class Javabasics {
    //   public static void main (String args[]) 
    //   {
    //     int a = 3;
    //     int b = 15;
    //     int c = 9;
    //     if ( (a >= b) && (a>=c)){
    //       System.out.println("a");
    //     }else if (b >= c ){
    //       System.out.println("b");
    //     }
    //     else{
    //       System.out.println("c");
    //     }
    //   }
    //  }

     // TERNARY OPERATOR
  //  import java.util.*;
  //    public class Javabasics {
  //     public static void main (String args[]) 
  //     {
         // check num is odd or even
        // int number = 461;
        // String type = (number%2==0)? "even":"odd";
        // System.out.println(type);
      
       // check student is pass or fail
    //     Scanner sc = new Scanner(System.in);
    //     int marks= sc.nextInt();
    //     // ternary operstor 
    //     String status = (marks >=33)? "pass":"fail";
    //     System.out.println(status);
    //   }
    //  }

   // Switch statemnt

    //   import java.util.*;
    //  public class Javabasics {
    //   public static void main (String args []) 
    //   {
        // int number = 1;
        // switch (number){
        //   case 1: System.out.println("samosa");
        //            break;
        //   case 2: System.out.println("jalebi");
        //            break;
        //   case 3: System.out.println("bada");
        //            break;
        //   default: System.out.println("wake up");

//           char ch = 'a';
//         switch (number){
//           case c: System.out.println("samosa");
//                    break;
//           case b: System.out.println("jalebi");
//                    break;
//           case a: System.out.println("bada");
//                    break;
//           default: System.out.println("wake up");
          
//         }
//       }
//      }


  // CALCULATOR USING SWITCH STATMENT  

  //  import java.util.*;
  //    public class Javabasics {
  //     public static void main (String args []) 
  //     {
  //        Scanner sc = new Scanner(System.in);
  //        System.out.println("enter a :");
  //         int a = sc.nextInt();
  //         System.out.println("enter b :");
  //         int b = sc.nextInt();
  //         System.out.println("enter operator :");
  //         char operator = sc.next().charAt(0);

  //         switch(operator){
  //           case '+': System.out.println(a+b);break;
  //           case '-': System.out.println(a-b);break;
  //           case '*': System.out.println(a*b);break;
  //           case '/': System.out.println(a/b);break;
  //           case '%': System.out.println(a%b);break;
  //           default : System.out.println("not support");break;
  //         }


  //     }
  //    }

   // PRACTIIICE QUE 

// 
  // import java.util.*;
  //    public class Javabasics {
  //     public static void main (String args []) 
  //     {
  //        Scanner sc = new Scanner(System.in);
  //        System.out.println("enter a number :");
  //         int number = sc.nextInt();

  //         switch(number){
  //           case 1: System.out.println("sunday");break;
  //           case 2: System.out.println("monday");break;
  //           case 3: System.out.println("tuesday");break;
  //           case 4: System.out.println("wednsday");break;
  //           case 5: System.out.println("thursday");break;
  //           case 6: System.out.println("friday");break;
  //           case 7: System.out.println("saturday");break;
  //           default : System.out.println("not support");break;
  //         }
  //     }
  //    }


  // number from the user and print positive or negative
    //   import java.util.*;
    //  public class Javabasics {
    //   public static void main (String args []) 
    //   {
    //      Scanner sc = new Scanner(System.in);
    //      System.out.println("enter a number :");
    //       int number = sc.nextInt();
    //       if(number >0){
    //         System.out.println("positive");
    //       }else {
    //         System.out.println("negative");
    //       }
    //   }
    //  }

    
  // check fever or not 
  
//  import java.util.*;
//      public class Javabasics {
//       public static void main (String args []) 
//       {
//           double temp = 104.4;
//           //float temp = 102.4f;
//           if (temp>100){
//             System.out.println("fever");
//           }
//           else {
//             System.out.println("not a fever ");
//           }
//       }
//      }


 // check leap year 
  
  //  import java.util.*;
  //  public class Javabasics   {
  //   public static void main(String args[])
  //   {
  //   Scanner sc = new Scanner(System.in);
  //   int year = sc.nextInt();
  //    boolean x = (year %4==0);
  //    boolean y = (year %100==0)&&(year %400 == 0);
  //    boolean z= (year%100 )!=0;

  //    if ( x && (y || z)){
  //     System.out.println("leap");
  //    }else {
  //     System.out.println(" not leap");

  //    }
  //   }
  //  }

  import java.util.*;
  public class Javabasics