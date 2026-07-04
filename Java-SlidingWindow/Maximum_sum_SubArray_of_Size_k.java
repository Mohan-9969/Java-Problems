public class Maximum_sum_SubArray_of_Size_k{
    public static void main(String[] args) {
        
        // input - 2,1,5,1,3,2
        // k=3
        // output - 9 {5,1,3}

        int [] num ={2,1,5,1,3,2};
        int k = 3;
        int windowSum = 0;
        for(int i=0;i<k;i++){
            windowSum += num[i];
        }
        int max = windowSum;

        for(int i=k;i<num.length;i++){
            windowSum+= num[i]-num[i-k];
            max = Math.max(max,windowSum);
        }
        System.out.println(max);

    }

}