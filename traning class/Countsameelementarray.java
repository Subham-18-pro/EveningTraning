class Countsameelementarray{
    public static void main(String[] args){
        int arr1[]={5,6,7,5,10,11,5,5,9,6,2};
        int key=5;
        int length=arr1.length;
        int count=0; 
        for(int i=0;i<length;i++){
            if(key==arr1[i]){
                count++;
            }
        }
        System.out.println("My key value is "+count+" times appears");
    }
}