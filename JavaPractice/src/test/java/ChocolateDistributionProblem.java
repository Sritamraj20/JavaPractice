import java.util.*;

public class ChocolateDistributionProblem {
    public static void main(String args[]){
        int arr[]={7, 3, 2, 4, 9, 12, 56};

        int students=3;

        //int maxns=arr[0];
        int mins=Integer.MAX_VALUE;
        //int small=arr[0];
        int minms=Integer.MAX_VALUE;
        HashMap<Integer, Integer[]> hmap=new HashMap<>();
        for(int i=0;i<arr.length-2;i++){

            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    List<Integer> li=new ArrayList<>();
                    li.add(arr[i]);
                    li.add(arr[j]);
                    li.add(arr[k]);

                    System.out.println(li);
                    //Object arr1[]=li.toArray();
                    Integer arr1[]=li.toArray(new Integer[0]);
                    System.out.println(Arrays.toString(arr1));
                    int max=0;
                    int minValue=arr1[0];
                    for(int l=0;l<arr1.length;l++){
                        if(arr1[l]>max){
                            //minValue=max;
                            max=arr1[l];
                        } else if (arr1[l]<minValue) {
                            minValue=arr1[l];
                        }

                    }
                    System.out.println(max+" "+minValue);

                    int minimalDifference=max-minValue;
                    System.out.println(minimalDifference);
                    minms=Math.min(minms,minimalDifference);



                    hmap.put(minimalDifference,li.toArray(new Integer[0]));
                    System.out.println("----------------------------------------");

                }

            }
        }

        hmap.forEach((key, value) -> System.out.println(key + " -> " + Arrays.toString(value)));
        System.out.println(minms);

        Iterator itr=hmap.keySet().iterator();

        while(itr.hasNext()){
            //int a=(int)itr.next();
            if((int)itr.next()==minms){
                System.out.println(hmap);
            }
        }
    }
}
