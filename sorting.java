public class sorting {
    public static void main(String[] args) {
        int[] arr={1,7,9,4,3,6,8};
        int n=arr.length;

        //selection sort
        
        // for(int i=0;i<n-1;i++){
        //     int min=Integer.MAX_VALUE,mindx=-1;
        //     for(int j=i;j<n;j++){
        //         if(arr[j]<min){
        //             min=arr[j];
        //             mindx=j;
        //         }
        //     }
        //     int temp=arr[i];
        //     arr[i]=arr[mindx];
        //     arr[mindx]=temp;
        // }
        // for(int ele:arr){
        //     System.out.println(ele);
        // }


        for(int i=0;i<n-1;i++){
            int max=Integer.MIN_VALUE,maxdx=-1;
            for(int j=i;j<n;j++){
                if(arr[j]>max){
                    max=arr[j];
                    maxdx=j;
                }
            }
        
         for(int k=n-1;k>0;k--){
         int temp=arr[k];
            arr[k]=arr[maxdx];
            arr[maxdx]=temp;
     }
        }
        for(int ele:arr){
            System.out.print(ele);
        }
    }
}

