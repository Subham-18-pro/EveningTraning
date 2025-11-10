public class Stock{
    public static void main(String[] args){
    int arr[]={5,3,1,6,9,7,8};
    int l=arr.length;
    int profit=0;
    for(int i=0;i<l;i++){
        for(int j=i+1;j<l;j++){
            profit=Math.max(profit,arr[j]-arr[i]);
            }
        }
        System.out.println(profit);
    }
}