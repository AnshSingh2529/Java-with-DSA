public class DivideNconquer {
    public static void printarr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }System.out.println();
    }
    public static void mergesort(int arr[],int si, int ei){
        if(si >=ei){
            return;
        }
        int mid = si + (ei-si)/2;
        mergesort(arr,si,mid);
        mergesort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++ ;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        while(j <= ei){
            temp[k++] = arr[j++];
        }
        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
         
        
    }
    public static void Quicksort(int arr[] , int si, int ei){
        if(si >= ei){
            return;
        }
        int pIdx = Partition(arr,si,ei);
        Quicksort(arr,si,pIdx-1); // left
        Quicksort(arr,pIdx+1,ei); // right
    }
    public static int Partition(int arr[], int si , int ei){
        int pivot = arr[ei];
        int i = si-1;

        for(int j = si; j<ei; j++){
            if(arr[j] <= pivot){
                i++;

                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
            }
        }
        i++;

                    int temp = pivot;
                    arr[ei] = arr[i];
                    arr[i] = temp;
        return i;
    }
    public static int Search(int arr[],int tar, int si,int ei){
        if(si > ei){
            return -1;
        }
        int mid = si+(ei-si)/2;
        if(arr[mid]==tar){
            return mid;
        }
        if(arr[si] <= arr[mid]){
            if(arr[si] <=tar && tar <= arr[mid]){
                return Search(arr,tar,si,mid-1);
            }else{
               return Search(arr,tar,mid+1,ei);
            }
        }
        else{
           if(arr[mid] <= tar && tar <=arr[ei]){
              return  Search(arr,tar,mid+1,ei);
           }
           else{
             return Search(arr,tar,si,mid-1);
           }
        }
    }
    
    public static void main(String args[]){
        int arr[] = {4,5,6,7,0,2,3};
        // mergesort(arr,0,arr.length-1);
        // Quicksort(arr,0,arr.length-1);
        // printarr(arr);
        int target = 0;
        int tIdx = Search(arr,target,0,arr.length-1);
        System.out.println(tIdx);
    }
}
