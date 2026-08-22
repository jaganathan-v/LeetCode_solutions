class Solution {
    public int maxProduct(int n) {
     int temp = n,digits=0;
      while(temp != 0){ 
        digits++;
        temp /= 10;
      }

      int[] arr=new int[digits];
      int i=0;
      while(n !=0){ 
        arr[i] = n%10;
        n/=10;
        i++;
      }
      int max=0;
      for(int k=0;k<arr.length;k++){ 
        for(int j=k+1;j<arr.length;j++){ 
            int product = arr[k]*arr[j];
            if(product > max){ 
                max=product;
            }
        }
      }
      return max;
    }
}