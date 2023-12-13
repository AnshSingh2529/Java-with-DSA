
//public class Arrays_class {
    // public static void main(String args[]){
//input and output
    // int marks[] = new int[50];

    //lenght of marks

    //System.out.println("length :" + marks.length);


//     Scanner sc = new Scanner(System.in);

//     marks[0] = sc.nextInt();
//     marks[1] = sc.nextInt();
//     marks[2] = sc.nextInt();

//     System.out.println("physics : " + marks[0]);
//     System.out.println("maths : " + marks[1]);
//     System.out.println("chemistry : " + marks[2]);

//     //update
//    // marks[2] = 100;   
//     // System.out.println("chemistry : " + marks[2]); 
    
//     int percentage = (marks[0]+marks[1]+marks[2])/3;
//     System.out.println("percentage : " + percentage + "%");
//       }

// public static void Update(int marks[]){
//     for(int i = 0; i<marks.length; i++){
//         marks[i] = marks[i] + 1;
       
//     }
// }
// public static void main(String args[]){
//     int marks[] = {94,85,97};
//     Update(marks);
//      //print our marks.
//     for(int i = 0; i<marks.length; i++){
//         System.out.print(marks[i] + " ");
//     }
//     System.out.println();
// }

    //Linear search
    // public static int Linear_search(int number[], int key){
        
    //     for(int i = 0; i<number.length; i++){
    //         if(number[i]==key){
    //             return i;

    //         }
    //     }
    //      return -1;
    // }
    // public static void main(String args[]){
    //     int number[] = {2,4,6,8,10,12};
    //     int key = 10;
    //     int index = Linear_search(number, key);
    //     if(index==-1){
    //         System.out.println("Not found");
    //     }else{
    //         System.out.println(" Key is at Index : " + index);
    //     }
    // }
        //Largest in Arrays
    // public static int GetSmallest(int numbers[]){
    //     //int largest = Integer.MIN_VALUE;
    //     int smallest = Integer.MAX_VALUE;
    //     for(int i = 0; i<numbers.length; i++){
    //         if(smallest > numbers[i]){
    //             smallest = numbers[i]; 
    //         }
    //     }
    //     return smallest;
    // }
    // public static void main(String args[]){
    //     int numbers[] = {-4,3,5,12,-6,4};
    //     System.out.println( "Smallest numbers is : " + GetSmallest(numbers));
    // }

   // Binary Search in Array
        // public static int Binarysearch(int numbers[] , int key){
        //     int start=0 , end = numbers.length-1;
        //     while(start<=end){
        //         int mid = (start+end)/2;
        //         if(numbers[mid] == key){
        //             return mid;
        //         }            
        //         if(numbers[mid]>key){
        //             end = mid-1;
        //         }else{
        //             start = mid+1;
        //         }
        //     }
        //     System.out.println("Invalid");
        //     return -1;
            
                        


        // }
        // public static void main(String args[]){
        //     int numbers[]={2,4,6,8,10,12,14,16};
        //     int key=13;
        //     System.out.println("key is at index : " + Binarysearch(numbers, key));
        // }

        //reverse of an Array
// public static void Reverse(int numbers[]){
//     int first=0; 
//     int last=numbers.length-1;
//     while(first<last){
//         int temp = numbers[last];
//         numbers[last]=numbers[first];
//         numbers[first]=temp;
//         first++;
//         last--;
//     }

// }
// public static void main(String args[]){
//     int numbers[]={1,2,4,6,8,10};
    
//     Reverse(numbers);
//     for(int i =0; i<numbers.length; i++){
//         System.out.print(numbers[i] + " ");
//     }
//     System.out.println();
//     }

//   pairs of an arrays
    // public static void Pairs(int numbers[]){
    //     int tp=0;
    //     for(int i = 0; i<numbers.length; i++){
    //         int curr = numbers[i];
    //         for(int j = i+1; j<numbers.length; j++){
    //             System.out.print("(" + curr + "," + numbers[j] + ")");
    //             tp++;
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("Total pairs : " + tp);

    // }
    // public static void main(String args[]){
    //     int numbers[]={2,4,6,8,10};
    //     Pairs(numbers);

    // }

        //printSubArrays
        // public static void Printsubarrays(int n[]){
            
           
        //     for(int i = 0; i<n.length; i++){
               
        //         for(int j=i; j<n.length; j++){
                    
        //             for(int k = i; k<=j; k++){
        //                 System.out.print(n[k] + " ");
        //             }
        //             System.out.println();
        //             }  System.out.println();               
        //         }
                    
        //     }
                
            
            
        // public static void main(String args[]){
        //     int n[]={2,4,6,8,10};
        //      Printsubarrays(n);
        // }

            //max and min sum if the subarrays.
       
        // public static void Minsubsum(int numbers[]){
        //     int currSum = 0;
        //     int minSum = Integer.MAX_VALUE;  //-infinity

        //     for(int i = 0; i<numbers.length; i++){
        //         int start = i;
        //         for(int j = i; j<numbers.length; j++){
        //             int end = j;
        //             currSum = 0;
        //             for(int k = start; k <= end; k++){
        //                currSum = currSum +  numbers[k];
        //             }
        //             System.out.println(currSum);
        //             if(minSum >  currSum){
        //                 minSum = currSum;
        //             }

        //         }
                
        //     }
            
        //     System.out.println(" Min of the sum is : " + minSum);
        // }

        // public static void Prefixsum(int number[]){
        //     int curr = 0;
        //     int maxsum = Integer.MIN_VALUE;
        //     int prefix[] = new int[number.length];
        //     //calculate prefix 
        //     prefix[0]=number[0];
        //     for(int i=1; i<prefix.length; i++){
        //         prefix[i]=prefix[i-1] +number[i];
        //     }

        //     for(int i=0; i<number.length; i++){
        //         int start = i;
        //         for(int j=i; j<number.length; j++){
        //             int end = j;
        //             curr = start == 0? prefix[end]: prefix[end]-prefix[start-1];   
        //             if(maxsum < curr){
        //                 maxsum=curr;
        //             }
        //         }
        //     }
        //     System.out.println(" Max of the sum is : " + maxsum);
        // }
        // public static void Kadanessum(int number[]){
        //     int maxsum = Integer.MIN_VALUE;
        //     int currSum = 0;
        //     for(int i = 0; i<number.length; i++){
        //         currSum = currSum + number[i];
        //         if(currSum < 0){
        //             currSum = 0;
        //         }
        //          maxsum = Math.max(maxsum, currSum);
        //     }      
        //     System.out.println(" our max subarray sum is : " + maxsum);
        // }
        // public static void main(String  args[]){
        //     int number[] = {-2 ,-3 ,4 ,-1 ,-2 ,1 ,5 ,-3};
        //    //Minsubsum(numbers);
        //   // Prefixsum(number);
        //   Kadanessum(number);
        // }

        // Question on Trapping the Water

        // public  static int Trappedwater(int height[]){
        //     int n = height.length;
        //     //calculate left max ..array
        //     int leftmax[] = new int[n];
        //     leftmax[0] = height[0];
        //     for(int i = 1; i<n; i++){
        //         leftmax[i] = Math.max(height[i] ,leftmax[i-1] );
        //     }
        //     //calculate rightmax ..Array
        //     int rightmax[] = new int[n];
        //     rightmax[n-1]=height[n-1];
        //     for(int i = n-2; i>=0; i--){
        //         rightmax[i] = Math.max(height[i], rightmax[i+1]);
        //     }
        //     //loop
        //     int trappedpani = 0;
        //     for(int i = 0; i<n; i++ ){
        //         //find minimum of left and right
        //     int Waterlevel = Math.min(leftmax[i], rightmax[i]);
        //     //formula of trapped water
        //     trappedpani += Waterlevel-height[i];
        //     }
        //     return trappedpani;

        // }
        // public static void main(String args[]){
        //     int height[] = {4,2,0,6,3,2,5}; // Array
        //     System.out.println(Trappedwater(height));
       // }

       // buy stocks and sell stock

//        public static int Buyandsellstocks(int prices[]){
//         int buyprices = Integer.MAX_VALUE;
//         int maxprofit = 0;
        
//         for(int i = 0; i<prices.length; i++){
//             if(buyprices < prices[i]){
//                 int profit = prices[i] - buyprices;
//                 maxprofit = Math.max(maxprofit, profit);
//             }else{
//                 buyprices = prices[i];
//             } 
//         }
//         return maxprofit;
//        }
       
//        public static void main(String args[]){
//      //    int prices[]={7,1,5,3,6,4};
//     //    System.out.println( Buyandsellstocks(prices));

//        }
// }



