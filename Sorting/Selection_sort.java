public class Selection_sort {
    static void selectionsort(int arr[]){
        int j;
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        System.out.println("Sorted array is:");
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,6};
        selectionsort(arr);
    }
}
