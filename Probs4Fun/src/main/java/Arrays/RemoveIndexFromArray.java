package Arrays;

public class RemoveIndexFromArray {


    public static void main(String[] args) {


//    char[] array = {'a', 'b', 'c', 'd', 'e'};
//    int index = 2;
//    System.out.println(array);
//    removeIndexFromArray(array, index);
//        removeIndexFromArray2(array, index);


//        char[] array = {'f', 'o', 'r', 'd'};
//        int index = 1;
//        System.out.println(array);
//        removeIndexFromArray(array, index);
//        removeIndexFromArray2(array, index);

        char[] array = {'j', 'o', 'h', 'n'};
        int index = 2;
        System.out.println(array);
        removeIndexFromArray(array, index);
        removeIndexFromArray2(array, index);




    }


    // Given: char[] someArray, int index
    // Remove index from someArray
    // return new array with index removed

    // {a, b, c, d, e}, int index 2 -> {a, b, d, e}
    // {f, o, r, d}, int index 1 -> {f, r, d}

    // I am going to take an iterative approach to this.
    // Loop through until index, every element gets sent to newArray
    // Manually skip index
    // Loop through after index until end, every element goes to newArray
    // return newArray

    public static char[] removeIndexFromArray(char[] someArray, int index) {

        char[] newArray = new char[someArray.length-1];

        for (int i = 0; i < index; i++) {

            newArray[i] = someArray[i];
        }

        // here is where I manually skip the given index

        for (int i = index + 1; i <= someArray.length-1; i++) {

            newArray[i-1] = someArray[i];
        }

        System.out.println(newArray);
        return newArray;

    }


    public static char[] removeIndexFromArray2(char[] someArray, int index) {

        // another way to solve
        // you do one for loop
        // simply do 2 if statements for when i < index and i > index.
        // add elements to newArray and return.

        char[] newArray = new char[someArray.length-1];

        for (int i = 0; i < someArray.length; i++) {
            if (i < index) {
                newArray[i] = someArray[i];
            }
            else if (i> index) {
                newArray[i-1] = someArray[i];
            }
        }

        System.out.println(newArray);
        return newArray;
    }

}
