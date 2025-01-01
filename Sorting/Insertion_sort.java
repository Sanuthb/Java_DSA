public class Insertion_sort {
    static void insertionsort(int arr[]){
        int j,key;
        for(int i=0;i<arr.length;i++){
            key=arr[i];
            j=i-1;
            while(j>=0&&key<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
            
        }
        System.out.println("Sorted array is:");
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,6};
        insertionsort(arr);
    }
}
