public static void insertionSort(int[] array) {  
    for (int i = 1; i < array.length; i++) {
        int current = array[i];
        int j = i - 1;
        while(j >= 0 && current < array[j]) {
            array[j+1] = array[j];
            j--;
        }
         // here point for exit so j is like -1 
         // of in first elem. were  >= a[j]
        array[j+1] = current;
    }
}
