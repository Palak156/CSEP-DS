import java.util.Scanner;

public class twodarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter no. of row:");
       int r =sc.nextInt();
       System.out.print("Enter no. of column:");
       int c =sc.nextInt();
       int[][] matrix=new int[r][c];
      System.out.print("Enter elements of matrix:");
      for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            matrix[i][j]=sc.nextInt();
        }
      }

      //print matrix 
    //    System.out.print("Matrix:");
    //   for(int i=0;i<r;i++){
    //     for(int j=0;j<c;j++){
    //          System.out.print(" "+matrix[i][j]+" ");
    //     } 
    //     System.out.println();
    //   }


//print array in column major order 

    //    System.out.print("Matrix:");
    //   for(int j=0;j<c;j++){
    //     for(int i=0;i<r;i++){
    //          System.out.print(" "+matrix[i][j]+" ");
    //     } 
    //   }


//print sum of each row indirectly
// int sum=0;
//        System.out.print("Matrix:");
//       for(int i=0;i<r;i++){
//         for(int j=0;j<c;j++){
//            sum=sum+matrix[i][j];
//         } 
//         System.out.println(sum);
//       }

      //print sum of all the elements
    //    int sum=0;
    //    System.out.print("Matrix:");
    //   for(int i=0;i<r;i++){
    //     for(int j=0;j<c;j++){
    //        sum=sum+matrix[i][j];
    //     } 
    //   }
    //   System.out.println(sum);

    //print the diagonal with maximum value 
    //  System.out.print("Matrix:");
    //   for(int i=0;i<r;i++){
    //     for(int j=0;j<c;j++){
           
    //     } 
    //     System.out.println();
    //   }

    //linear search in 2d
//     int key = sc.nextInt();
//     boolean flag=false;
//     for (int i = 0 ; i <r;i++){
//     for(int j=0;j<c;j++){
//         if(matrix[i][j]==key){
//         System.out.print("Element found:"+i+" "+j+" ");
//         flag=true;
    
//      }
// }
//     }
//     if(flag==false){
//          System.out.print("Element not  found");
//      }

//transpose of matrix 
    
// System.out.print("Matrix:");
//       for(int i=0;i<r;i++){
//         for(int j=0;j<c;j++){
//              System.out.print(" "+matrix[j][i]+" ");
//         } 
//         System.out.println();
//       }


//rotate matrix 90 degree by transpose method                                                                              
// System.out.print("Transpose Matrix:");
//       for(int i=0;i<r;i++){
//         for(int j=i+1;j<c;j++){
//              int temp=matrix[i][j];
//              matrix[i][j]=matrix[j][i];
//              matrix[j][i]=temp;
//         } 
//       }
// for(int i=0;i<r;i++){
//   int start =0;
//   int end=r-1;
//   while(start<end){
//     int temp=matrix[i][start];
//     matrix[i][start]=matrix[i][end];
//     matrix[i][end]=temp;
//     start++;
//     end--;

//   }
// }
// System.out.print("ROtating Matrix:");
//       for(int i=0;i<r;i++){
//         for(int j=0;j<c;j++){
//              System.out.print(" "+matrix[i][j]+" ");
//         } 
//         System.out.println();

//     }

//rotate matrix 90 degree direct 
// int[][]rotate=new int [r][c];
// System.out.print("Print Matrix:");
//       for(int i=0;i<r;i++){
//         for(int j=0;j<c;j++){
//              System.out.print(" "+matrix[i][j]+" ");
//         }
//       }
// System.out.print("Rotate Matrix:");
//       for(int i=0;i<r;i++){
//         for(int j=0;j<c;j++){
//            rotate[j][r-1-i]=matrix[i][j];
//         } 
//       }
//  System.out.print("ROtating Matrix:");
//       for(int i=0;i<r;i++){
//         for(int j=0;j<c;j++){
//              System.out.print(" "+rotate[i][j]+" ");
//         } 
//         System.out.println();
// }

//sparse matrix
int left=0;
    int right=r-1;
    int top=0;
    int bottom=c-1;
for(int i = 0;i<r;i++){
  for(int j=0;j<r;j++){
    while(left<right){
      System.out.println(matrix[i][right]);
      top++;
    }
    while(top<bottom){
      System.out.println(matrix[j][bottom]);
      right--;
    }

  }
}

}
}