class nextpermutation1{
    public static void main(String[] args) {
        int arr[]={4,3,2,1};
        int n=arr.length;
        int pivot=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]>arr[i-1]){
                pivot=i-1;
                break;
            }
        }
        if(pivot==-1){
            int start=pivot+1;
            int end=n-1;
            while(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }else{
        System.out.println("pivot index is :"+pivot);
        for(int i=n-1;i>=pivot;i--){
            if(arr[i]>arr[pivot]){
                int temp=arr[i];
                arr[i]=arr[pivot];
                arr[pivot]=temp;
                break;
        }
        }
        int start=pivot+1;
        int end=n-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
}