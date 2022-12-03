// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//     }
// }
// Looping Through Array Elements
// class Main {
//     public static void main(String[] args) {
//         int[] age = { 12, 4, 5, 2, 5 };

//         // access each array elements
//         System.out.println("Accessing Elements of Array:");
//         System.out.println("First Element: " + age[0]);
//         System.out.println("Second Element: " + age[1]);
//         System.out.println("Third Element: " + age[2]);
//         System.out.println("Fourth Element: " + age[3]);
//         System.out.println("Fifth Element: " + age[4]);
//     }
// }

// Looping through Array elements
// class Main {
//     public static void main(String[] args) {
//         //create an array
//         int[] age = { 12, 4, 5 };

//         // loop through the array
//         // using for loop
//         System.out.println("Using for loop: ");
//         for (int i = 0; i < age.length; i++) {
//             System.out.println(age[i]);
//         }
//     }
// }

// Using for-each loop
// class Main {
//     public static void main(String[] args) {

//         // create an array
//         int[] age = { 12, 4, 5 };

//         // loop through the array
//         // Using for loop
//         System.out.println("Using for-each Loop: ");
//         for (int a : age) {
//             System.out.println(a);
//         }
//     }
// }

// Computing Sum and Average of Array Elements
// class Main {
//     public static void main(String[] args) {
//         int[] numbers = { 2, -9, 0, 5, 12, -25, 22, 9, 8, 12 };
//         int sum = 0;
//         Double average;

//         // access all elements using for each loop
//         // add each element in sum
//         for (int number : numbers) {
//             sum += number;
//         }

//         // get the total number of elements
//         int arrayLength = numbers.length;

//         // calculate the average
//         // convert the averagae from int to double
//         average = ((double) sum / (double) arrayLength);

//         System.out.println("Sum = " + sum);
//         System.out.println("Average = " + average);
//     }
// }

// class TestArray {
//     public static void main(String[] args) {
//         double[] myList = { 1.9, 2.9, 3.4, 3.5 };

//         // Print all the Array elements
//         for (int i = 0; i < myList.length; i++) {
//             System.out.println(myList[i] + " ");
//         }

//         // Summing all elements
//         double total = 0;
//         for (int i = 0; i < myList.length; i++) {
//             total += myList[i];
//         }
//         System.out.println("Total is " + total);

//         // Finding the largest element
//         double max = myList[0];
//         for (int i = 1; i < myList.length; i++) {
//             if (myList[i] > max)
//                 max = myList[i];
//         }
//         System.out.println("Max is " + max);
//     }

// }

// class Test {
//     public static void printArray(int[] array) {
//         for (int i = 0; i < array.length; i++) {
//             System.out.println(array[i] + " ");
//         }
//     }

//     public static void main(String args[]) {
//         printArray(new int[] { 3, 1, 2, 6, 4, 2 });
//     }

// }


// public class Test {
//     // Driver method
//     public static void main(String args[]) {
//         int arr[] = { 3, 1, 2, 5, 4 };

//         //passing array to method m1
//         sum(arr);
//     }

//     public static void sum(int[] arr) {
//         //getting sum of array values
//         int sum = 0;

//         for (int i = 0; i < arr.length; i++) {
//             sum += arr[i];
//         }
//         System.out.println("Sum of array values: " + sum);
//     }
// }

public class multiDimensional {
    public static void main(String args[]) {
        // declaring and initializing 2D array
        int arr[][] = { { 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } };

        // printing 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");

                System.out.println();
            }
        }
    }
}