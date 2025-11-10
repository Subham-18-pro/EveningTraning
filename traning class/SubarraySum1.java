class SubarraySum1{
    public static void main(String[] args) {
        int arr[]={1,2,-3,5,6,-4,-5};
        int l=arr.length;
        int result=arr[0];
        int MaxEnd=arr[0];
        for(int i=0;i<l;i++){
            MaxEnd=Math.max(MaxEnd+arr[i],arr[i]);
            result=Math.max(result,MaxEnd);
            }
        System.out.println(result);
    }
}   