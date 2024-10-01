public class CheckFibonaci {
    public static void main(String[] args) {
        long[] arr = new long[20];
        long n1 =0,n2=1,n3=0,sum=0;
        for(int i=0;i< arr.length;){
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            if(n3 % 2 == 0 && n3 != 0){
                arr[i] = n3;
                i++ ;

            }

        }
        for(int j = 0; j<arr.length;j++){
            sum += arr[j];
            System.out.println("A["+j+"]="+arr[j]);
            
            
        }
        System.out.println("Sum = "+sum);
    }
}
