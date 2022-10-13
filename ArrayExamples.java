

public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    for(int i = 0; i < (arr.length / 2); i += 1) { // changed "arr.length" to "(arr.length / 2)"
      int temp = arr[i]; // added line to perform swap
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp; // added line to perform swap
    }
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      newArray[i] = arr[arr.length - i - 1]; //was assigning newArray to arr, not the other way around
    }
    return newArray; //was returning arr, not newArray
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    if(arr.length < 2) { return 0.0; }
    double lowest = arr[0];
    for(double num: arr) {
      if(num < lowest) { lowest = num; }
    }
    double sum = 0;
    for(double num: arr) {
      sum += num; // changed from only adding nums != to lowest to adding all
    }
    sum -= lowest; // added line to simply minus lowest once to "ignore" it
    return sum / (arr.length - 1);
  }
}