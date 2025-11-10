class SubarraySum{
    public static void main(String[] args) {
        int arr[]={1,2,-3,5,6,-4,-5};
        int l=arr.length;
        int result=arr[0];
        for(int i=0;i<l;i++){
            int sum=0;
             for(int j=i+1;j<l;j++){
               sum+=arr[j];
               result=Math.max(result,sum); 
            }
        }
        System.out.println(result);
    }
}