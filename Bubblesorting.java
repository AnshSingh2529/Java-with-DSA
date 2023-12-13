import java.util.Collections;
import java.util.Arrays;
public class Bubblesorting {
    public static void Bubblesort(int number[]){
        for(int i = 0; i<number.length-1; i++){
            for(int j = 0; j<number.length-1-i; j++){
            if(number[j]>number[j+1]){
        int temp = number[j];
        number[j]=number[j+1];
        number[j+1]=temp;
                 }
            }
        }
    }
    // public static void printnumber(int number[]){
    //     for(int i = 0; i<number.length; i++){
    //         System.out.print( number[i] + " ");
    //     }
    //         System.out.println();

    // }
    // public static void main(String args[]){
    //     int number[] = {5,4,1,3,2};
    //     Bubblesort(number);
    //     printnumber(number);

    // }
    public static void Selectionsort(int number[]){
        for(int i=0; i<number.length-1; i++){
            int minpos = i;
            for(int j=i+1; j<number.length; j++){
                if(number[minpos] < number[j]){
                    minpos=j;
                }
            }
            //swap
            int temp = number[minpos];
            number[minpos]=number[i];
            number[i] = temp;

        }
    }
    public static void printnumber(int number[]){
        for(int i =0; i<number.length; i++){
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }

    public static void Insertionsort( int number[]){
        for(int i = 1; i<number.length; i++){
            int curr = number[i];
            int prev = i-1;
            while(prev >= 0 && number[prev] > curr){
                number[prev+1] = number[prev];
                prev--;
            }
            number[prev+1] = curr;   //insertion ho rha hai
        }

    }
    public static void Countingsort(int number[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++){
            largest = Math.max(largest, number[i]);
        }
        int count[] = new int[largest + 1];
        for(int i = 0; i<number.length; i++){
            count[number[i]]++;
        }
        //sorting
        int j = 0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                number[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    
    public static void main(String args[]){
        int number[] = {1,4,3,1,3,4,3,7,7};
        //Selectionsort(number);
        // Insertionsort(number);
        //Arrays.sort(number,Collections.reverseOrder());  //Arrays.sort(arr); , Arrays.sort(arr,si,ei);,Arrays.sort(arr,si,ei,Collertions.reverseOrder())
        Countingsort(number);
        printnumber(number);
    }
}
