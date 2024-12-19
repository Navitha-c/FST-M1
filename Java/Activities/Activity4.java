package Activity1;

public class Activity4 {
    public static void main(String[] args) {
        int[] array = {4, 7, 2, 13, 5, 12};

        System.out.println("Array before sorting:");
        displayArray(array);
        
        insertionSort(array);
        
        System.out.println("\nArray after sorting:");
        displayArray(array);
    }

    
    public static void insertionSort(int[] arr) {
        
        for (int i = 1; i < arr.length; i++) {
            int X = arr[i]; 
            int j = i - 1;

            
            while (j >= 0 && arr[j] > X) {
                arr[j + 1] = arr[j]; 
                j--;  
            }

            arr[j + 1] = X;
        }
    }

    
    public static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); 
    }
}
