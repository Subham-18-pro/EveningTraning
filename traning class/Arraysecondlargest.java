class Arraysecondlargest{
    public static void main(String[] args){
        int arr1[]={10,20,40,60,30,35,60};
        int length=arr1.length;
        int large=-1;
        int secondlarge=-1;
        for(int i=0;i<length;i++){
            if(arr1[i]>large){
                secondlarge=large;
                large=arr1[i];
            }
            else if(arr1[i]>secondlarge && arr1[i]!=large){
            secondlarge=arr1[i];
            }
        }
        System.out.println("second largest is "+secondlarge);
    }
    
}