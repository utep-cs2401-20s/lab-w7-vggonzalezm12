import org.junit.Test;


import static java.lang.System.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortOfSortTester {


        @Test
        public void sortOfSortTest()   // first test created to see if once it compares the two first elements are compared and the largest one is send to the end of the array
                                        // see if the method compares the 8 again or with the new number after the first swap or if the method keeps advancing in reading the next index
        {

            int [] array = new int [] {8, 9, 5, 4, 1};
            int[] expected = new int[] {5, 4, 1, 8, 9}; // expected outcome: {5, 4, 1, 8, 9} and the result of the method sortOfSort successfully passed the test
            SortOfSort test1 = new SortOfSort(array);
            test1.sortOfSort();
            /*for(int i = 0 ; i < array.length; i++)
            {
                System.out.print(array[i]);
            }*/
            assertArrayEquals(expected, array);
        }


        @Test
        public void sortOfSortTest2()   // first test created to see if an array of an odd length is ordered properly
        {

            int [] array = new int [] {7, 9, 6, 4, 1};
            int[] expected = new int[] {6, 4, 1, 7, 9}; // expected outcome: {6, 4, 1, 7, 9} and the result of the method sortOfSort successfully passed the test
            SortOfSort test2 = new SortOfSort(array);
            test2.sortOfSort();
                /*for(int i = 0 ; i < array.length; i++)
                {
                    System.out.print(array[i]);
                }*/
            assertArrayEquals(expected, array);
        }

        @Test
        public void sortOfSortTest3()   // first test created to see if an array of an even length is ordered properly
        {

            int [] array = new int [] {7, 1, 6, 4};
            int[] expected = new int[] {4, 1, 6, 7}; // expected outcome: {4, 1, 6, 7} and the result of the method sortOfSort successfully passed the test
            SortOfSort test3 = new SortOfSort(array);
            test3.sortOfSort();
                    /*for(int i = 0 ; i < array.length; i++)
                    {
                        System.out.print(array[i]);
                    }*/
            assertArrayEquals(expected, array);
        }

        @Test
        public void sortOfSortTest4()   // first test created to see if an array of length 1 element remains the same
        {

            int [] array = new int [] {7};
            int[] expected = new int[] {7}; // expected outcome: {7} and the result of the method sortOfSort successfully passed the test
            SortOfSort test4 = new SortOfSort(array);
            test4.sortOfSort();
                        /*for(int i = 0 ; i < array.length; i++)
                        {
                            System.out.print(array[i]);
                        }*/
            assertArrayEquals(expected, array);
        }

        @Test
        public void sortOfSortTest5()   // first test created to see if an array of length 2 elements is ordered from the lowest to the largest number
        {

            int [] array = new int [] {7,4};
            int[] expected = new int[] {4,7}; // expected outcome: {4,7} and the result of the method sortOfSort successfully passed the test
            SortOfSort test5 = new SortOfSort(array);
            test5.sortOfSort();
                            /*for(int i = 0 ; i < array.length; i++)
                            {
                                System.out.print(array[i]);
                            }*/
            assertArrayEquals(expected, array);
        }

        @Test
            public void sortOfSortTest6()
            {                              // first test created to see if an array with repeated numbers is arranged properly

                int [] array = new int [] {7, 4, 7, 4, 5, 6};
                int[] expected = new int[] {6, 5, 4, 4 ,7, 7}; // expected outcome: {6, 5, 4, 4 ,7, 7} the result of the method sortOfSort successfully passed the test
                SortOfSort test6 = new SortOfSort(array);
                test6.sortOfSort();
                                /*for(int i = 0 ; i < array.length; i++)
                                {
                                    System.out.print(array[i]);
                                }*/
                assertArrayEquals(expected, array);


        }

        @Test
        public void sortOfSortTest7()
        {                              // first test created to see if an array with negative numbers are arranged properly

            int [] array = new int [] {-9, -4, -7, -2, -5, -1};
            int[] expected = new int[] {-4, -5, -9, -7 ,-2, -1}; // expected outcome: {-4, -5, -9, -7 ,-2 -1} the result of the method sortOfSort successfully passed the test
            SortOfSort test6 = new SortOfSort(array);
            test6.sortOfSort();
                                    /*for(int i = 0 ; i < array.length; i++)
                                    {
                                        System.out.print(array[i]);
                                    }*/
            assertArrayEquals(expected, array);


        }



        @Test
        public void sortOfSortTest8()
        {                              // first test created to see if an array with negative numbers and positive numbers are arranged properly

            int [] array = new int [] {-9, 4, 7, -2, -5, -1};
            int[] expected = new int[] {-1, -2, -9, -5 ,4, 7}; // expected outcome: {-4, -5, -9, -7 ,-2 -1} the result of the method sortOfSort successfully passed the test
            SortOfSort test6 = new SortOfSort(array);
            test6.sortOfSort();
                                        /*for(int i = 0 ; i < array.length; i++)
                                        {
                                            System.out.print(array[i]);
                                        }*/
            assertArrayEquals(expected, array);


        }

    @Test
    public void sortOfSortTest8()
    {                              // first test created to see if an array with negative numbers and positive numbers are arranged properly

        int [] array = new int [] {200, 34, 67, 4, 0, 1.1};
        int[] expected = new int[] {34, 4, 0, 1.1 ,67, 200}; // expected error since the array made of integers cannot accept elements that are doubles
        // error appeared in the terminal, compiling error
        SortOfSort test6 = new SortOfSort(array);
        test6.sortOfSort();
                                        /*for(int i = 0 ; i < array.length; i++)
                                        {
                                            System.out.print(array[i]);
                                        }
        assertArrayEquals(expected, array);


    }
*/

    @Test
    public void sortOfSortTest9()
    {                              // first test created to see if an array with negative numbers and positive numbers are arranged properly

        int [] array = new int [] {200, 34, 67, 4, 0,};
        int[] expected = new int[] {34, 4, 0 ,67, 200}; // expected error since the array made of integers cannot accept elements that are doubles

        SortOfSort test6 = new SortOfSort(array);
        test6.sortOfSort();
                                        /*for(int i = 0 ; i < array.length; i++)
                                        {
                                            System.out.print(array[i]);
                                        }*/
        assertArrayEquals(expected, array);


    }


    @Test
    public void sortOfSortTest10()
    {                              // first test created to see if an array with null element

        int [] array = new int [] {7, 6, , 4 , 8, 9,};
        int[] expected = new int[] {7, 6,  , 4, 8, 9,}; // expected error since the array made of integers cannot handle null elements
                                // error appeared in the terminal, compiling error
        SortOfSort test6 = new SortOfSort(array);
        test6.sortOfSort();
                                        /*for(int i = 0 ; i < array.length; i++)
                                        {
                                            System.out.print(array[i]);
                                        }*/
        assertArrayEquals(expected, array);


    }
}
