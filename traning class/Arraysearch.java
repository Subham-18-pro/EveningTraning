class Arraysearch{
    public static void main(String[] args){
        int arr1[]={1,2,3,4,5};
        int s = 5;
        int f =0;

        for(int i=0; i<arr1.length; i++){
            if(s == arr1[i]){
                 f= 1;
                break;
            }
        }
        if(f == 1){
            System.out.println("Element " + s + " is present in the array.");
        } else {
            System.out.println("Element " + s + " is not present in the array.");
        }
        
    }
    
}