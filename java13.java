// import java.util.*;

// public class java13{

//     public static void main (String args[]) {

//         int marks [] = new int [100];

//         Scanner sc = new Scanner (System.in);
//         // int phy ;
//         // int phy = sc.nextInt();

//         marks[0] =  sc.nextInt(); //phy 
//         marks[1] =  sc.nextInt(); //chem 
//         marks[2] =  sc.nextInt(); // mathss

//         System.out.println(" phy :"+ marks[0]);
//          System.out.println(" chem :"+ marks[1]);
//           System.out.println(" mathss :"+ marks[2]);

//         //   marks[2] = 100; // updation
//         //    marks[2] =  marks[2] + 1; //* - / operation kr skte he 
//         //   System.out.println(" mathss :"+ marks[2]); // updated value print

//     // percentage 
//      int percentage = (marks[0]+marks[1]+marks[2])/3;
//      System.out.println("percentge ="+ percentage + " %");
   
//    // for length
//     System.out.println("length of array =" + marks.length );
//     }
// }

//
// import java.util.*;

// public class java13{

//     public static void update(int marks[] ){
//     for (int i =0 ; i < marks.length ; i++){
//         marks[i] = marks[i]+1;
//     }
//     }
//     public static void main(String args[]){
//         int marks[] = {94,95,96};
//         update(marks);

//         //print our marks
//         for (int i = 0 ; i < marks.length ; i++){
//             System.out.print(marks[i]+ " ");
//         }
//         System.out.println();
//     }
// }

// import java.util.*;

// public class java13{

//     public static int linearSearch(String food[],String key  ){
//     for (int i =0 ; i < food.length ; i++){
//     if (food[i].equals(key)){
//       return i;
//     }
//     }
//     return -1;
//     }
//     public static void main(String args[]){
//         String food[] = {"samosa","pakoda","gulabjamun"};
//         String key = "pakoda";
//         int index =linearSearch(food,key);
//   if ( index == -1){
//     System.out.println("not found");
//   } else { 
//     System.out.println("your index is "+ index);
//   }
        
//     }
// }

// largest in array 

//  import java.util.*;

//  public class java13{
//   public static int getLargest (int numbers[]){
   
//    int largest = Integer.MIN_VALUE; // -infinity
//    int smallest = Integer.MAX_VALUE; // +infinity

//       for ( int i=0 ; i<numbers.length ; i++ ){
//         if( largest < numbers[i]){
//           largest = numbers[i];
//         }
//         if(smallest > numbers[i]){
//           smallest = numbers[i];
//         }
//       }
//        System.out.println("smallest number is :" + smallest);
//       return largest;
//   }
//   public static void main (String args[]){
//     int numbers[] = {1,2,3,5,6,};
//         //System.out.println(numbers.length);


//    System.out.println("largest value is :" + getLargest(numbers));
//   }
//   // time complexity of this function is BIG O(n). 
//   //bcz n operation ho rahe he 
//  }


// BINARY SEARCH
// import java.util.*;

//  public class java13{
//   public static int binarySearch (int numbers[],int key){
     
//      int start = 0;
//      int end = numbers.length-1;
       
//       while(start <= end){

//         int mid = (start+end)/2;

//         //comparisons
//         if(numbers[mid]==key){//found
//             return mid;
//         }
//         if(numbers[mid]<key){
//           start = mid+1; 
//            }else{
//             end = mid-1;
//           }
//       }
//       return -1;
//   }
//   public static void main (String args[]){
//     Scanner sc = sc.next(System.in)
//     int numbers[] = {1,2,3,5,6};
//      int key = 3;    

//    System.out.println("index for key is :"+binarySearch(numbers,key));
//   }
//     // time complexity is long(n)
//  }

// REVERSE AN ARRAY WITH OPTIMIZED APPROCH 

// import java.util.*;

// public class java13{

//   public static void reverse(int numbers[]){
//    int first = 0,last = numbers.length-1;

//    while (first < last){
//     // first = last nhi kie bcz last me jo value bachegi ushe khud se hi swap nhi krna he self se 

//        int temp = numbers[last];
//        numbers[last] = numbers[first];
//        numbers[first] = temp;

//       first++;
//       last--; 
//    }

//   }
//  public static void main(String args[]){
//     int numbers[] = {1,3,4,5,6,9};
//       reverse(numbers);
//       for(int i = 0; i < numbers.length ;i++){
//         System.out.print(numbers[i]+" ");
//       }
//       System.out.println();
//  }


// }

// PAIRS IN ARRAY   TC = o(n2) bcz nested loop
// import java.util.*;
// public class java13{
//   public static void printPairs(int numbers[]){
//      int tp = 0;
//        for(int i = 0; i < numbers.length ; i++){
//          int curr = numbers[i]; // 
//           for( int j = i+1; j < numbers.length ; j++){
//               System.out.print(" (" + curr + ","+ numbers[j] +")");
//               tp++;
//           }

//            System.out.println();
//        }
//        System.out.println("total pairs = " + tp);
//   }

//      public static void main( String args[]){
//       int numbers[] = {1,3,4,5,6,7,8,9};
//       printPairs(numbers);

//      }
// }



 





//   // internship

// import java.util.*;

// public class java13 {
//     public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//         Random random = new Random();
//         int randomNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
//         int lowerBound = 1;
//         int upperBound = 100;
//         System.out.println("Guess a number between 1 and 100:");
//         int guess = scanner.nextInt();
//         while (true) {
//             if (guess == randomNumber) {
//                 System.out.println("Congratulations! You guessed the number.");
//                 break;
//             } else if (guess < randomNumber) {
//                 System.out.println("Too low.");
//                lowerBound = guess + 1; // Adjust lower bound for binary search
//             } else {
//                 System.out.println("Too high.");
//                upperBound = guess - 1; // Adjust upper bound for binary earch
//             }
//         }

//     }
// }


   import java.util.*;

public class java13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        // Initialize variables for total marks
        int totalMarks = 0;

        // Loop to input marks for each subject
        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / numberOfSubjects;

        // Determine grade based on average percentage
        String grade;
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display results
        System.out.println("Total Marks: " + totalMarks + " out of " + (numberOfSubjects * 100));
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
    }
}

 
// //PART13 - PRINT SUB ARRAYS(LAST LEC)

// import java.util.*;
// public class java13 {
//     public static void printSubarrays(int numbers[]){
//      int ts = 0; // total sub arrays    
//     for(int i=0 ; i<numbers.length ; i++){
//         int start = i ;
//          for(int j=i ; j<numbers.length ; j++ ){
//              int end = j;
//               for( int k=start ;k<=end ; k++ ){//print
//              System.out.print(numbers[k]+" "); //sub arrays
//               }
//               ts++;
//               System.out.println();
//          }
//          System.out.println();
//     } 
//      System.out.println("total sub arrays"+ "" + ts);

//     }
     
//     public static void main(String args[]){
//         int numbers[] = {2,4,6,8,10};
//          printSubarrays(numbers);
//     } 
// }

 