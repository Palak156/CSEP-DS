import java.util.Scanner;

public class rotarr {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array:");
        int n=sc.nextInt();
        int[] arr =new int [n];
        System.out.print("Enter element of Array:");
        for (int i = 0 ; i <arr.length;i++){
            arr[i]=sc.nextInt();
        }

        //rotate array by one place
 // int temp= arr[arr.length-1];
        // for (int i = arr.length-1 ; i >0;i--){
        //     arr[i]=arr[i-1];
        // }
        // arr[0]=temp;
        // System.out.print("Rotating Array:");
        // for(int num:arr){
        //     System.out.print(num+" ");
        // }

        // check rotated array is sorted or not 
       
    // int count=0;
    // for(int i=1;i<arr.length;i++){
    //     if(arr[i]>arr[(i+1)% arr.length]){
    //              count++;
    //     }
    // }
    // if(count<=1){
    //     System.out.println("YES");
    // }
    // else{
    //     System.out.println("NO");
    // }

        // M-3
        // int k =3;
        // k= k % n;
        // int[] temp =new int [n];
        // for (int i = 0 ; i <arr.length;i++){
        //      temp[(i+k)%n]=arr[i];
        // }
        // for (int i = 0 ; i <arr.length;i++){
        //     arr[i]=temp[i];
        // }
        // System.out.print("Rotating Array:");
        // for(int num:arr){
        //     System.out.print(num+" ");
        // }
        
        //M-1
        // int k =3;
        // int temp[]=new int[n];
        // int idx=0;
        // for(int i=n-k;i<n;i++){
        //     temp[idx]=arr[i];
        //     idx++;
        // }
        // for(int j=0;j<n-k;j++ ){
        //     temp[idx]=arr[j];
        //     idx++;
        // }
        // System.out.print("Rotating Array:");
        // for(int i=0;i<n;i++){
        //     System.out.print(temp[i]+" ");
        // }
        

        //M-2
        // int k=3;
        // int i,j,temp;
        // i=0;j=n-1;
        // while(i<j){
        //     temp=arr[i];
        //     arr[i]=arr[j];
        //     arr[j]=temp;
        //     i++;
        //     j--;
        // }
        // i=0;j=k-1;
        // while(i<j){
        //     temp=arr[i];
        //     arr[i]=arr[j];
        //     arr[j]=temp;
        //     i++;
        //     j--;
        // }
        // i=k;j=n-1;
        // while(i<j){
        //     temp=arr[i];
        //     arr[i]=arr[j];
        //     arr[j]=temp;
        //     i++;
        //     j--;
        // }
        // System.out.print("Rotating Array:");
        // for(int num:arr){
        //     System.out.print(num+" ");
        // }


        // // first and last occurance 
        // int target = 2;

        // int first = -1;
        // int last = -1;

        // // First occurrence
        // int low = 0;
        // int high = arr.length - 1;

        // while (low <= high) {
        //     int mid = low + (high - low) / 2;

        //     if (arr[mid] == target) {
        //         first = mid;
        //         high = mid - 1;   // left side me search karo
        //     }
        //     else if (arr[mid] < target) {
        //         low = mid + 1;
        //     }
        //     else {
        //         high = mid - 1;
        //     }
        // }

        // // Last occurrence
        // low = 0;
        // high = arr.length - 1;

        // while (low <= high) {
        //     int mid = low + (high - low) / 2;

        //     if (arr[mid] == target) {
        //         last = mid;
        //         low = mid + 1;    // right side me search karo
        //     }
        //     else if (arr[mid] < target) {
        //         low = mid + 1;
        //     }
        //     else {
        //         high = mid - 1;
        //     }
        // }

        // System.out.println("First occurrence = " + first);
        // System.out.println("Last occurrence = " + last);


        //upper bound and lower bound 

        // int target = 2;

        // int n = arr.length;

        // // Lower Bound
        // int low = 0;
        // int high = n - 1;
        // int lower = n;

        // while (low <= high) {
        //     int mid = low + (high - low) / 2;

        //     if (arr[mid] >= target) {
        //         lower = mid;
        //         high = mid - 1;
        //     } else {
        //         low = mid + 1;
        //     }
        // }

        // // Upper Bound
        // low = 0;
        // high = n - 1;
        // int upper = n;

        // while (low <= high) {
        //     int mid = low + (high - low) / 2;

        //     if (arr[mid] > target) {
        //         upper = mid;
        //         high = mid - 1;
        //     } else {
        //         low = mid + 1;
        //     }
        // }

        // System.out.println("Lower Bound = " + lower);
        // System.out.println("Upper Bound = " + upper);


// search in rotated sorted array 
        int target = 0;
        int low = 0;
        int high = arr.length - 1;
        int index = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                index = mid;
                break;
            }

            // Left part is sorted
            if (arr[low] <= arr[mid]) {

                if (arr[low] <= target && target < arr[mid]) {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }

            // Right part is sorted
            else {

                if (arr[mid] < target && target <= arr[high]) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }

        System.out.println("Index = " + index);



    }
}





  
