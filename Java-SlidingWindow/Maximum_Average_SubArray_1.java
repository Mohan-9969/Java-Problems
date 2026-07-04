public class Maximum_Average_SubArray_1 {
    public static void main(String[] args) {
        // input num = 1,12,-5,-6,50,3
        // k=4
        // output=12.75

        int [] num ={1,12,-5,-6,50,3};
        int k=4;

        int windowSum = 0;
        for(int i=0;i<k;i++){
            windowSum += num[i];
        }
        
        int max = windowSum;
        int startIndex =0;

        for(int i=k;i<num.length;i++){
            windowSum += num[i]-num[i-k];
            if(windowSum>max){
                max = windowSum;
                startIndex = i-k+1;

            }
        }
        System.out.println((double)max/k);

        for(int i=startIndex;i<startIndex+k;i++){
            System.out.print(num[i]+" ");
        }
    }
    
}

// output
// 12.75
// 12 -5 -6 50 
