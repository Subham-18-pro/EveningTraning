class Arrayreverse1{
    public static void main(String[] args){
        int arr1[]={1,2,3,4,5};
        int length=arr1.length;
        int j=0;
        int arr2[]=new int[length];
        for(int i=length-1;i>=0;i--){
            arr2[j]=arr1[i];
            System.out.print(arr2[j]+" ");
            j++;
        }
    }
}