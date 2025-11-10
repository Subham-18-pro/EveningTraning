public class Arrayreverse2{
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5};
		int length=arr.length;
        int left = 0;
        int right = length-1;
		int temp;
        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}