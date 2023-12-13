import java.util.ArrayList;
import java.util.Collections;

public class Arraylists {
    public static void Swap(ArrayList<Integer>list , int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
//pair sum through 2 pointer approch

    public static boolean Pairsum(ArrayList<Integer> list, int target){
        int lp = 0;
        int rp = list.size()-1;
        while(lp<rp){
            if(list.get(lp) + list.get(rp) ==  target){
                return true;
            }else if(list.get(lp) + list.get(rp) < target){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }

    // pair sum 2 for sorted and rotated array
    public static boolean pairsum(ArrayList<Integer>list , int target){
        int n = list.size();
        int bp = -1;
        for(int i = 0; i<list.size(); i++){
            if(list.get(i) > list.get(i+1)){
                bp = i;
                break;
            }
        }
         int lp = bp+1;
         int rp = bp;
        while(lp != rp){
            if(list.get(lp)+list.get(rp) == target){
                return true;
            }
            else if(list.get(lp) + list.get(rp) < target){
                lp = (lp+1)%n;
            }
            else{
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }
    // public static void main(String args[]){
    //     ArrayList<Integer>list = new ArrayList<>();
    //     // ArrayList<String>list2 = new ArrayList<>();
    //     // ArrayList<Boolean>list3 = new ArrayList<>();
        
    //     list.add(2);
    //     list.add(5);
    //     list.add(7);
    //     list.add(9);
    //     list.add(4);
    //     list.add(1);
    //     list.add(3);
    //      System.out.println(list);
    //     // int idx1 = 1;
    //     //  int idx2 = 3;
    //     //  Swap(list, idx1, idx2);
    // //    System.out.println(list);
    //    // Collections.sort(list);  // ascending  order
    //    Collections.sort(list , Collections.reverseOrder());  //Descending Order
    //     System.out.println(list);

        

    //     // int element = list.get(2);
    //     // System.out.println(list);
    //     // System.out.println(element);
    //     // list.remove(2);
    //     // System.out.println(list);
    //     //  list.set(1,20);
    //     // System.out.println(list);
    //     // System.out.println(list.contains(20));
    //     // System.out.println(list.contains(49));

    //     // System.out.println(list.size());
    //     // for(int i = 0 ; i<list.size(); i++){
    //     //     System.out.println(list.get(i));
    //     // }
    //     // for(int i = list.size()-1; i>=0; i--){
    //     //     System.out.print(list.get(i) + " ");
    //     // }
    //     // System.out.println();
        
    //     //find the max of Arraylists

    //     // int max = Integer.MIN_VALUE;
    //     // for(int i = 0; i<list.size(); i++){
    //     //     // if(max < list.get(i)){
    //     //     //     max = list.get(i);
    //     //     // }
    //     //     max = Math.max(max , list.get(i));
    //     // }
    //     // System.out.println("Max of the Arraylist is = " + max);
    // }

   // MULTI-DIMENTIONAL ArrayList

//    public static void main(String args[]){
//     ArrayList<ArrayList<Integer>>mainlist = new ArrayList<>();
//     ArrayList<Integer> list1 = new ArrayList<>();
//     ArrayList<Integer> list2 = new ArrayList<>();
//     ArrayList<Integer> list3 = new ArrayList<>();

//     for(int i = 1; i<=5; i++){
//         list1.add(i*1);
//         list2.add(i*2);
//         list3.add(i*3);
//     }
//     mainlist.add(list1);
//     mainlist.add(list2);
//     mainlist.add(list3);
//     list1.remove(2);  // for delete element from the array.

//     // System.out.println(mainlist);

//     // print Arraylist using nested loop

//     for(int i = 0; i<mainlist.size();i++){
//         ArrayList<Integer>currlist = mainlist.get(i);
//         for(int j = 0; j<currlist.size(); j++){
//             System.out.print(currlist.get(j) + " ");
//         }
//         System.out.println();
//     }
//    }

 public static void main(String args[]){
    ArrayList<Integer> list = new ArrayList<>();
    list.add(11);
    list.add(15);
    list.add(6);
    list.add(8);
    list.add(9);
    list.add(10);
    int target = 16;
    System.out.println(pairsum(list, target));
    

 }
}
