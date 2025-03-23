class Solution {
    public void swap(int a, int b, int[] arr){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public void moveZeroes(int[] arr) {
        int n=arr.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
        for(int i=j;i<n;i++){
            arr[i]=0;
            }
        }
    }
