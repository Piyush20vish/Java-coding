  // print hollow rectangle pattern
// public class Pattern {
//     public static void hollow_rectangle(int totrows, int totcols){
//         // outer loop 
//         for ( int i = 1; i <= totrows ; i++){
//              // inner loop - colums 
//               for ( int j = 1 ; j<= totcols ; j ++){
//                 // cell - (i,j)
//                 if ( i == 1 || i == totrows || j == 1 || j == totcols ){
//                     System.out.print("*");
//                 }else {
//                     System.out.print(" ");
//                 }
//               }
//            System.out.println();    
//         } 
        
//     }

//   public static void main (String args[]){
//     hollow_rectangle( 4, 5);
//   }

// }

  // print inverted & rotated half-pyramid 
//   public class Patterns {
//     public static void inverted_rotated_half_pyramid(int n) {
//         // outer loop 
//         for (int i = 1; i <= n; i++) {
//             // space 
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             // star
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String args[]) {
//         inverted_rotated_half_pyramid(4);
//     }
// }

// print inverted & rotated half-pyramid  with number
// public class Patterns {
//     public static void floyds_triangle(int n) {
//         // outer loop
//         int counter = 1; 
//         for (int i = 1; i <= n; i++) {
//             // num
//             for (int j = 1; j <= i; j++) {
//                 System.out.print( counter+" ");
//                 counter++;
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String args[]) {
//         floyds_triangle(5);
//     }
// }

// 0-1 triangle 
  
// public class java12 {
//   public static void zero_one_triangle(int n){
//       for (int i = 1 ; i<= n ; i++){
//          for (int j = 1 ; j<=i ; j++){
//              if ( (i+j)%2==0){
//                 System.out.print("1");
//              }else{
//                 System.out.print("0");
//              }
//          }
//         System.out.println();
//       }

//   }
//  public static void main (String[] args){
//      zero_one_triangle(5);
//  }
// }

 // butterly

//   public class java12 {
//   public static void butterfly(int n){
//     // 1st half 
//       for (int i = 1 ; i<= n ; i++){
//         // star
//          for (int j = 1 ; j<=i ; j++){
//                System.out.print("*");
//          }
//          //space
//           for (int j = 1 ; j<=2*(n-i); j++){
//                System.out.print(" ");
//          }
//          // star
//           for (int j = 1 ; j<=i ; j++){
//                System.out.print("*");
//          }

//         System.out.println();
//       }

//    // 2nd half
//  for (int i = n ; i>= 1 ; i--){
//         // star
//          for (int j = 1 ; j<=i ; j++){
//                System.out.print("*");
//          }
//          //space
//           for (int j = 1 ; j<=2*(n-i); j++){
//                System.out.print(" ");
//          }
//          // star+
//            for (int j = 1 ; j<=i ; j++){
//                System.out.print("*");
//          }

//         System.out.println();
//       }

//   }
//  public static void main (String[] args){
//      butterfly(5);
//  }
//   }


 // solid rhombus 

//    public class java12 {
//   public static void solid_rhombus(int n){
    
//       for (int i = 1 ; i<= n ; i++){
//         // space
//          for (int j = 1 ; j<= (n-i); j++){
//                System.out.print(" ");
//          }
//          //star
         
//           for (int j = 1 ; j<=n; j++){
//                System.out.print(" *");
//          }
//        System.out.println();
//       }
     
//   }
//  public static void main(String args[]){
//      solid_rhombus(5);
//  }
//   }

//  public class java12 {
//   public static void hollow_rhombus(int n){
    
//       for (int i = 1 ; i<= n ; i++){
//         // space
//          for (int j = 1 ; j<= (n-i); j++){
//                System.out.print(" ");
//          }
//          //hollow rectangle
         
//           for (int j = 1 ; j<=n; j++){
//               if ( i == 1|| i == n || j == 1 || j == n){
//                 System.out.print("*");
//               }else {
//                 System.out.print(" ");
//               }
//           }
//           System.out.println();
//       }
     
//   }
//  public static void main(String args[]){
//      hollow_rhombus(5);
//  }
//   }

 // hollow rhombus pattern 

  public class java12 {
  public static void diamond(int n){
    //1st half 
      for (int i = 1 ; i<= n ; i++){
        // space
         for (int j = 1 ; j<= (n-i); j++){
               System.out.print(" ");
         }
         //star
         
          for (int j = 1 ; j<=(2*i)-1; j++){
              System.out.print("*");
          }
          System.out.println();
      }

      //2nd half

       for (int i = n ; i>= 1 ; i--){
        // space
         for (int j = 1 ; j<= (n-i); j++){
               System.out.print(" ");
         }
         //star
         
          for (int j = 1 ; j<=(2*i)-1; j++){
              System.out.print("*");
          }
          System.out.println();
      }
     
  }
 public static void main(String args[]){
     diamond(5);
 }
  }