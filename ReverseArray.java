public class ReverseArray {
    static void Reverse_Array(int arr[],int start,int end)
    {
        int temp;
        while(start<end)
        {
            temp= arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    static void printArray(int arr[],int size)
    {
        for(int i=0;i<size;i++)
        System.out.println(arr[i]+" ");
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[]={4,5,4,7,8,6,1};
        printArray(arr,7);
        Reverse_Array(arr,0,6);
        System.out.println("Reverse array is \n");
        printArray(arr,7);
    }
}
