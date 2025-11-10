public class Stock1{
    public static void main(String[] args){
    int arr[]={5,3,1,6,9,7,8};
    int l=arr.length;
    int profit=0;
    int min=arr[0];
    for(int i=1;i<l;i++){
        min=Math.min(min,arr[i]);
        profit=Math.max(profit,arr[i]-min);
    }
    System.out.println("profit="+profit);
    }
}