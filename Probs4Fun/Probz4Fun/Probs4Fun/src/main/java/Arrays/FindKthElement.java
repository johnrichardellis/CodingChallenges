package Arrays;

public class FindKthElement {

    public static void main(String[] args) {




    }

    // Given two sorted arrays of Integers, find the Kth element of the combined sorted arrays.
    // {2, 3, 6, 7, 9}, {1, 4, 8, 9}, and int k = 5 -> return 6
    // { 1, 5, 7, 11, 99}, {-1, 8, 42, 43}, and int k = 2 -> return 1


    public static int removeKthElement(int[] array1, int[] array2, int k) {

        // will need to combine the two arrays, then sort the arrays
        // then return the element in the k position (index will be k-1)

        // how to combine arrays?
        // I could create an arraylist to combine them, then convert to an object[] at end?
        // could create new array of combined length, then iterate and place each element in newArray.
            // might get a little tricky once we get to the second array
        // once combined, could use bubble sort
        // then return the element at k position (index k-1)

        return 0;

    }


}
