public class AllTripletsWithZeroSum {
    public static void main(String[] args){
        int arr[]={0, -1, 2, -3, 1};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=i+2;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        System.out.printf("number present at index %s %s %s",i,j,k);
                        System.out.println();
                    }

                }

            }
        }



    }
}
