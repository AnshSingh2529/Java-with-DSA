import java.util.*;
public class AbsoluteDiff {

    static class JOB{              //hamne class banai ki hame kya kya use krna hai Jobinfo ke ander
        int deadline;
        int profit;
        int id;

    public JOB(int i , int d , int p){   // make  Parametrized Contructor of the class to use the value
        deadline = d;
        profit = p;
        id = i;

    }
}
 public static void main(String args[]){

//Absolute Difference

    // int A[] = {4,1,8,7};
    // int B[] = {2,3,6,5};

    // Arrays.sort(A);
    // Arrays.sort(B);

    // int Mindiff = 0;
    // for(int i=0; i<A.length; i++){
    //     Mindiff  += Math.abs(A[i] - B[i]);
    // }
    // System.out.println("Min Absolute difference for value = " + Mindiff);
//Max chain length.

    // int pairs[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};

    // Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));
    //     int chainlen = 1;
    //     int chainend = pairs[0][1];

    //     for(int i=1; i<pairs.length; i++){
    //         if(pairs[i][0] > chainend){
    //             chainlen++;
    //             chainend = pairs[i][1];
    //         }
    //     }
    //     System.out.println("Length of the chain is = " + chainlen);

//Indian Rupee.

        // Integer Currency[] = {1,2,5,10,20,50,100,500,2000};

        // Arrays.sort(Currency,Comparator.reverseOrder());
        
        // int CountofNotes = 0;
        // int amount = 10;
        // ArrayList<Integer> ans = new ArrayList<>();

        // for(int i = 0; i<Currency.length; i++){
        //     if(Currency[i] <= amount){
        //         while(Currency[i] <= amount){
        //             CountofNotes++;
        //             ans.add(Currency[i]);
        //             amount = amount-Currency[i];
        //         }
        //     }
        // }
        // System.out.println("Total Notes given = " + ans + "," +  " Count of Notes = " + CountofNotes);

//Job sequencing Problem

           int Jobinfo[][] = {{4,20},{1,10},{1,40},{1,30}};   //two d array banaya.

           ArrayList<JOB> jobs = new ArrayList<>();        //using ArrayList make an object  jobs

           for(int i=0; i<Jobinfo.length; i++){            
                jobs.add(new JOB(i,Jobinfo[i][0],Jobinfo[i][1]));      //new JOB ka jon hamne abhi constructor banaya tha use add kiya hai.
           }

        Collections.sort(jobs, (obj1,obj2) -> obj2.profit - obj1.profit);    ///object Sorting with the help of Collections.
        
        ArrayList<Integer> seq = new ArrayList<>();

        int time = 0;
        for(int i=0; i<jobs.size(); i++){
            JOB curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println("Maxprofit = " + seq.size()  + " , " + " On index = " + seq);
       



    }       

}
