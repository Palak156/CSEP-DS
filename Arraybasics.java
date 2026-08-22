import java.util.Scanner;
public class Arraybasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// PRIINT SUM AND ODD INDEXES
    //  int[] arr={2,3,4,6,7,5};
    //  int sum=0,prod=1;
    //  for(int i=0;i<arr.length;i++){
    //     if (arr[i]%2==0){
    //         sum=sum+arr[i];
    //     }
    //     else{
    //         prod=prod*arr[i];
    //     }
    //  }
    //  System.out.println("SUM IS:" +sum);
    //  System.out.print("PRODUCT IS :"+prod);
    
     
    // // largest element in array 
    // int[] arr={2,3,4,6,7,5};
    // int max = Integer.MIN_VALUE;
    //     for (int i = 0 ; i <arr.length;i++){
    //         if(arr[i]>max){
    //             max=arr[i];
    //     }
    // }
        
    //     System.out.println("MAX:" +max);

        // second largest in an array 
    //     System.out.print("Enter size of Array:");//input size and element in array 
    //     int n=sc.nextInt();
    //     int[] arr =new int [n];
    //     System.out.print("Enter element of Array:");
    //     for (int i = 0 ; i <arr.length;i++){
    //         arr[i]=sc.nextInt();
    //     }
    //     int max = Integer.MIN_VALUE;
    //     for (int i = 0 ; i <arr.length;i++){
    //         if(arr[i]>max){
    //             max=arr[i];
    //     }
    // }
        
    //     System.out.println("MAX:" +max);

    //     int smax = Integer.MIN_VALUE;
    //     for (int i = 0 ; i <arr.length;i++){
    //         if(arr[i]>smax && arr[i]!=max){
    //             smax=arr[i];
    //     }
    // }
        
    //     System.out.print("SMAX:" +smax);
  
    //array is sorted or not
//      System.out.print("Enter size of Array:");//input size and element in array 
//         int n=sc.nextInt();
//         int[] arr =new int [n];
//          boolean sorted=false;
//         System.out.print("Enter element of Array:");
//         for (int i = 0 ; i <arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         for (int i = 0 ; i <arr.length-1;i++){
//         if(arr[i+1]>arr[i]){
//              sorted=true;
//              break;

//         }
//     }
//     if(sorted){
//    System.out.print("Array is  sorted");
//     }
//         else {
//         System.out.print("Array is not sorted");
//         }
    

   // Copy of element in new array 
        // System.out.print("Enter size of Array:");//input size and element in array 
        // int n=sc.nextInt();
        // int[] arr =new int [n];
        // System.out.print("Enter element of Array:");
        // for (int i = 0 ; i <arr.length;i++){
        //     arr[i]=sc.nextInt();
        // }
        // int[] brr=new int [n];
        // for (int i = 0 ; i <arr.length;i++){
        //     brr[i]=arr[i];
        // }
        //  System.out.print("Elements of new Array:");
        // for (int i = 0 ; i <arr.length;i++){
        //     System.out.print(brr[i]+" ");
        // }

     // swap alternate element
    // System.out.print("Enter size of Array:");//input size and element in array 
    // int n=sc.nextInt();
    // int[] arr =new int [n];
    // System.out.print("Enter element of Array:");
    //     for (int i = 0 ; i <arr.length;i++){
    //         arr[i]=sc.nextInt();
    //     }
    //     int temp;
    //     for (int i = 0 ; i <arr.length-1;i+=2){
    //              temp=arr[i];
    //              arr[i]=arr[i+1];
    //              arr[i+1]=temp;
    //     }
    //     System.out.print("SWAP Array :");
    //     for (int i = 0 ; i <arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }

    // element in the array greater than the avg 

    // System.out.print("Enter size of Array:");//input size and element in array 
    // int n=sc.nextInt();
    // int[] arr =new int [n];
    // System.out.print("Enter element of Array:");
    //     for (int i = 0 ; i <arr.length;i++){
    //         arr[i]=sc.nextInt();
    //     }
    //     int sum=0,avg=0;
    //     for (int i = 0 ; i <arr.length;i++){
    //         sum=sum+arr[i];
    //     }
    //     avg=sum/n;
    //     for (int i = 0 ; i <arr.length;i++){
    //         if(avg<arr[i]){
    //        System.out.println(arr[i]);
    //     }
    // }


//     update each index value with cube 
// System.out.print("Enter size of Array:");//input size and element in array 
//  int n=sc.nextInt();
// int[] arr =new int [n];
// System.out.print("Enter element of Array:");
//         for (int i = 0 ; i <arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         int[] brr=new int [n];
//          System.out.print("New Array with cube :");
//         for (int i = 0 ; i <arr.length;i++){
//             brr[i]=arr[i];
//         }
//         for (int i = 0 ; i <arr.length;i++){
//             System.out.print(brr[i]*brr[i]*brr[i]+" ");
//     }

    

//Duplicate in the array 
//        System.out.print("Enter size of Array:");
//         int n=sc.nextInt();
//         int[] arr =new int [n];
//         System.out.print("Enter element of Array:");
//         for (int i = 0 ; i <arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         for (int i = 0 ; i <arr.length;i++){
//                for (int j = i+1 ; j <arr.length;j++){
//                 if(arr[i]==arr[j]){
//                     System.out.print("Duplicatte :"+arr[i]);
//                     break;
//                 }
//         }
// }

// print arr in reverse using second arr
        // System.out.print("Enter size of Array:");//input size and element in array 
        // int n=sc.nextInt();
        // int[] arr =new int [n];
        // System.out.print("Enter element of Array:");
        // for (int i = 0 ; i <arr.length;i++){
        //     arr[i]=sc.nextInt();
        // }
        // int[] brr=new int [n];
        // for (int i = 0 ; i<arr.length ;i++){
        //     brr[i]=arr[arr.length-1-i];
        // }
        //  System.out.print("Elements of new Array:");
        // for (int i = 0 ; i <arr.length;i++){
        //     System.out.print(brr[i]+" ");
        // }


        // print arr in reverse  without using second arr
        //  System.out.print("Enter size of Array:");//input size and element in array 
        // int n=sc.nextInt();
        // int[] arr =new int [n];
        // System.out.print("Enter element of Array:");
        // for (int i = 0 ; i <arr.length;i++){
        //     arr[i]=sc.nextInt();
        // }
        // int temp;
        // for (int i = 0 ; i <arr.length/2;i++){
        //     temp=arr[i];
        //     arr[i]=arr[arr.length-1-i];
        //     arr[arr.length-1-i]=temp;

        // }
        //  System.out.print("Elements of new Array:");
        // for (int i = 0 ; i <arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }

        //two pointer approach
        // System.out.print("Enter size of Array:");//input size and element in array 
        // int n=sc.nextInt();
        // int[] arr =new int [n];
        // System.out.print("Enter element of Array:");
        // for (int i = 0 ; i <arr.length;i++){
        //     arr[i]=sc.nextInt();
        // }
        // int i=0,j=arr.length-1,temp;
        // while(i<j){
        //      temp=arr[i];
        //      arr[i]=arr[j];
        //      arr[j]=temp;
        //      i++;
        //      j--;
        // }
        //  System.out.print("NEW Array:");
        // for(int num:arr){
        //     System.out.print(num+" ");
        // }
        

        
    
}
}
