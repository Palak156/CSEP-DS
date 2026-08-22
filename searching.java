import java.util.Scanner;
public class searching {
    public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    // System.out.print("Enter size of Array:");//input size and element in array 
    // int n=sc.nextInt();
    // int[] arr =new int [n];
    // System.out.print("Enter element of Sorted Array:");
    //     for (int i = 0 ; i <arr.length;i++){
    //         arr[i]=sc.nextInt();
    //     }

     //Linear search 
//     int key=6;
//     boolean flag=false;
//     for (int i = 0 ; i <arr.length;i++){
//         if(arr[i]==key){
//         flag=true;
//         break;
//      }
// }
//     if(flag==false){
//          System.out.print("Element found");
//      }
//     else{
//          System.out.print("Element NOT found");
//     }
      

//binary search 

    // System.out.print("Enter target :");
    // int target =sc.nextInt();
    // int low=0,high=n-1;
    // int mid=0;
    // boolean found =false;
    // while (low<=high){
    //     mid=low+((high-low))/2;
    //     if(arr[mid]==target){
    //         found=true;
    //         break;
    //     }
    //     else if(arr[mid]>target){
    //         high=mid-1;
    //     }
    //     else{
    //         low=mid+1;
    //     }
    //     }

    //     if(found){
    //      System.out.print("Element found at index:" +mid+" ");
    //  }
    //     else{
    //      System.out.print("Element NOT found");
    // }
    
      
//search in rotated sorted array
Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of Array:");//input size and element in array 
    int n=sc.nextInt();
    int[] arr =new int [n];
    System.out.print("Enter element of Rotated Sorted Array:");
        for (int i = 0 ; i <arr.length;i++){
            arr[i]=sc.nextInt();
        }
    System.out.print("Enter target :");
    int target =sc.nextInt();
    int low=0,high=n-1;
    int mid=0;
   while(low<=high){
    mid=low+(high-low)/2;
    if (arr[mid]==target){
        System.out.print("Element found :" +mid+ " ");
         return;
    }
    if(arr[low]<=arr[mid]){
        if(arr[low]<=target && target<arr[mid]){
                high=mid-1;
        }
        else{
            low=mid+1;
        }
    }
    
}
System.out.print("Element not found ");

}
}