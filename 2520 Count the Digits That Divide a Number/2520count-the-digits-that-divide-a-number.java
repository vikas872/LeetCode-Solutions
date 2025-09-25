class Solution {
    public int countDigits(int num) {
        int cnt = 0;
        // int i = 0;
        // int rem = 0;
        int n = num;
        // int[] arr = new int[100];
        // HashSet<Integer> set = new HashSet<>();
        while(n>0){
            int rem  = n%10;
           if(rem!=0){
             if(num%rem ==0){
                cnt++;
            }
           }
            n = n/10;
            // arr[i] = rem;
            // i++;
        }
        // for(int j:arr){
        //     if(j!=0){
        //         if(n%j==0){
        //         cnt++;
        //     }
        //     }
    //  /   }
        return cnt;
    }
}