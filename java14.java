//PART14- MAX SUBARRAY SUM (FIRST LEC)
//every individual array sum and print maximum sum of a array 

//  import java.util.*;
// public class java14 {
//     public static void maxSubarraysSum(int numbers[]){
    
//       int currSum = 0;
//       int maxsum = Integer.MIN_VALUE;


//     for(int i=0 ; i<numbers.length ; i++){
//         int start = i ;
//          for(int j=i ; j<numbers.length ; j++ ){
//              int end = j;
//              currSum = 0;
//               for( int k=start ;k<=end ; k++ ){ 
//                 // subarrays sum
//         currSum += numbers[k];
//               } // print every pairs sum 
//               System.out.println(currSum);
//            if(maxsum < currSum){
//             maxsum = currSum ;
//            }         
//         }
//     } 
//      System.out.println("max sum"+ maxsum);

//     }
     
//     public static void main(String args[]){
//         int numbers[] = {1,-2,6,-1,3};
//          maxSubarraysSum(numbers);
//     } 
// }

// //time complexity = 3 loops lge teeno N tk ja rahe he to tc is big oh on n3 ,O(n3)

// //PART-14 MAX SUBARRAY SUM PREFIX SUM (2ND LEC)

// import java.util.*;
// public class java14 {
//     public static void maxSubarraysSum(int numbers[]){
    
//       int currSum = 0;
//       int maxsum = Integer.MIN_VALUE;
//       int prefix[] = new int[numbers.length];
       
//         prefix[0] = numbers[0];
//         //calculte prefix array
//         for(int i = 1;i<prefix.length ; i++){
//             prefix[i] = prefix[i-1]+numbers[i];
//         }

//     for(int i=0 ; i<numbers.length ; i++){
//         int start = i ;
//          for(int j=i ; j<numbers.length ; j++ ){
//              int end = j;
//               for( int k=start ;k<=end ; k++ ){ 
//                   currSum = start ==0? prefix[end] : prefix[end]-prefix[start-1];
//               }
//            if(maxsum < currSum){
//             maxsum = currSum ;
//            } 
//            System.out.println(currSum);        
//         }
//     } 
//      System.out.println("max sum"+ maxsum);

//     }
     
//     public static void main(String args[]){
//         int numbers[] = {1,-2,6,-1,3};
//          maxSubarraysSum(numbers);
//     } 
// }

// //time complexity = 2 loops lge N tk ja rahe he to tc is big oh on n2 ,O(n2)

// //PART-14 MAX SUBARRAY SUM kadan's algo(3RD LEC)



//PART-14 MAX SUBARRAY SUM kadanes's algo (3rd LEC)

// import java.util.*;
// public class java14 {
//     public static void maxSubarraysSum(int numbers[]){
    
//       int currSum = 0;
//       int maxsum = Integer.MIN_VALUE;
//       int prefix[] = new int[numbers.length];
       
//         prefix[0] = numbers[0];
//         //calculte prefix array
//         for(int i = 1;i<prefix.length ; i++){
//             prefix[i] = prefix[i-1]+numbers[i];
//         }

//     for(int i=0 ; i<numbers.length ; i++){
//         int start = i ;
//          for(int j=i ; j<numbers.length ; j++ ){
//              int end = j;
//               for( int k=start ;k<=end ; k++ ){ 
//                   currSum = start ==0? prefix[end] : prefix[end]-prefix[start-1];
//               }
//            if(maxsum < currSum){
//             maxsum = currSum ;
//            } 
//            System.out.println(currSum);        
//         }
//     } 
//      System.out.println("max sum"+ maxsum);

//     }
//      public static void kadanes(int numbers[]){
//         int ms = Integer.MIN_VALUE;
//         int cs = 0;

//         for(int i =0; i <numbers.length ; i++){
//             cs = cs+ numbers[i]; 
//             if(cs < 0){
//                  cs = 0;
//             }
//             System.out.println(cs);  
//             //  if(maxsum < currSum){
//             //  maxsum = currSum ;
//             //   }
//             //max sum formula 
//            ms =Math.max(cs,ms);
//         }
              
//         System.out.println("our max subarrays sum is : " + ms);
//      } 
     
//     public static void main(String args[]){
//         int numbers[] = {1,-2,6,-1,3};
//          kadanes(numbers);
//     } 
// }

//time complexity = 1 loops lge N tk ja rahe he to tc is big oh of n ,O(n)

//PART-14 Trapping rain watewr (4.5th LEC)

import java.util.*;

public class java14{

  public static int trappingRainWater(int height[]){
     int n = height.length;
     // calculte left max boundary - array 
     int leftmax[] = new int[n];
     leftmax[0] = height[0];

     for(int i =1 ; i<n ; i++){
      leftmax[i] = Math.max(height[i],leftmax[i-1]);
     }

     // calculate right max boundary - array
     int rightmax[] =new int[n];
     rightmax[n-1] = height[n-1];
     for(int i = n-2; i>=0; i--){
        rightmax[i] = Math.max(height[i],rightmax[i+1]);
         }

       int trappedwater = 0 ;
       //loop 
        for (int i = 0 ; i<n; i++){
            //waterlevel = min(leftmax , rightmax)
            int waterlevel = Math.min(leftmax[i],rightmax[i]);

            //trapped water = waterlevel - height [i];

            trappedwater += waterlevel - height[i];
        }  
       return trappedwater;
  }

  public static void main(String args[]){
    int height[] = {4,2,0,6,3,2,5};
    System.out.println( trappingRainWater(height));
    
  }

}
//PART-14 buyandsellstocks (6th LEC)


// import java.util.*;

// public class java14{

//   public static int buyandsellstocks(int prices[]){
//       int buyprice = Integer.MAX_VALUE;
//       int maxProfit = 0;

//      for(int i =0; i<prices.length;i++){
//           if(buyprice< prices[i]){
//             int profit = prices[i] - buyprice;
//             maxProfit = Math.max(maxProfit,profit); 
//           }
//            else{
//             buyprice = prices[i];
//            }
//      }
//       return maxProfit;
//   }

//   public static void main(String args[]){
//     int prices[] = {7,1,5,3,6,4};
//     System.out.println(buyandsellstocks(prices));
    
//   }

// }