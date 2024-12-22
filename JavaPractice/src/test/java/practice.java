

class practice {
        public static void main(String[] args) {
            int[] arr={3,6,7,8,92,50,22,56,13};
            //char[] chars=sentence.toCharArray();
            int sum=0;
            int avg=0;
            for(int i=0;i<arr.length;i++){
                sum=sum+arr[i];
                avg=sum/arr.length;
            }
            System.out.println(avg);


        }
    }
