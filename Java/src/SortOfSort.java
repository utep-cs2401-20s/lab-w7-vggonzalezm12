public class SortOfSort {
    // algorithm using counter and reset it every 2 moves
    public static void sortOfSort(int[] arr) {
        int begin = 0;
        int end = arr.length -1;
        int counter = 0;
        while (begin < end) {

            if (counter < 2)  {
                for (int i = begin; i < arr[end]; ++i) {
                    // Find index of smallest remaining element
                    int indexMax = i;
                    for (int j = i + 1; j < arr[end]; ++j) {
                        if (arr[j] > arr[indexMax]) {
                            indexMax = j;
                        }
                    }
                    // Swap numbers[arr.length-1] and numbers[indexMax]
                    int temp = arr[arr.length - 1 - i];
                    arr[arr.length - 1 - i] = arr[indexMax];
                    arr[indexMax] = temp;
                    end--;
                }
            }

            if (counter == 2) {
                for (int i = 0; i < 2; ++i) {
                    // Find index of smallest remaining element
                    int indexMax = i;
                    for (int j = i + 1; j < arr.length; ++j) {
                        if (arr[j] > arr[indexMax]) {
                            indexMax = j;
                        }
                    }

                    // Swap numbers[arr.length-1] and numbers[indexMax]
                    int temp = arr[i];
                    arr[i] = arr[indexMax];
                    arr[indexMax] = temp;
                    begin++;
                }
            }
        }
    }



// recursive option
    
    public static void sortOfSortR(int[] arr, int  counter)
    {

            if (counter == 0) {
                for (int i = 0; i < 2; ++i) {
                    // Find index of smallest remaining element
                    int indexMax = i;
                    for (int j = i + 1; j < arr.length; ++j) {
                        if (arr[j] > arr[indexMax]) {
                            indexMax = j;
                        }
                    }
                    // Swap numbers[arr.length-1] and numbers[indexMax]
                    int temp = arr[arr.length - 1 - i];
                    arr[arr.length - 1 - i] = arr[indexMax];
                    arr[indexMax] = temp;

                }
                sortOfSortR(arr, 2);
            }

            if (counter == 2)
            {
                for (int i = 0; i < 2; ++i)
                {
                    // Find index of smallest remaining element
                    int indexMax = i;
                    for (int j = i + 1; j < arr.length; ++j)
                    {
                        if (arr[j] > arr[indexMax])
                        {
                            indexMax = j;
                        }
                    }

                    // Swap numbers[arr.length-1] and numbers[indexMax]
                    int temp = arr[i];
                    arr[i] = arr[indexMax];
                    arr[indexMax] = temp;
                }
                sortOfSortR(arr, 0);
            }
    }
}
