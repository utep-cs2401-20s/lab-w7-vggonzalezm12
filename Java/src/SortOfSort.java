public class SortOfSort
{
    // algorithm using counter and reset it every 2 moves
    private int [] arr;
    private int length;
    public SortOfSort( int [] arr)
    {
        this.arr = arr;
    }

    public void sortOfSort()
    {
        int indexMax;
        int counter = 0;
        int begin = 0; // beginning of the array
        int end = arr.length-1; // end of the array

        while (begin < end)   // take into account to only use the elements of the array that are not ordered (between begin and end)
                            // help provided by Antoine during Office hours and at Lab
        {

            if(counter < 2)
            {
                indexMax = begin;
                // Find max index of  elements
                for (int i = begin; i <= end; i++)
                    if (arr[i] >=  arr[indexMax])
                    {
                        indexMax = i;
                    }
            // Swap arr[end position of the array] and arr[indexMax]
                int temp = arr[indexMax];
                arr[indexMax] = arr[end];
                arr[end] = temp;
                counter++;
                end --;
            }
            else
            {
                indexMax = begin;
                // Find max index of  elements
                for (int i = begin; i <= end; i++)
                    if (arr[i] >=  arr[indexMax])
                    {
                        indexMax = i;
                    }
            // Swap arr[end position of the array] and arr[indexMax]
                int temp = arr[indexMax];
                arr[indexMax] = arr[begin];
                arr[begin] = temp;
                begin++;
                counter++;
            }

            if (counter == 4)
            {
                counter = 0; // reset
            }

        }
    }

}
