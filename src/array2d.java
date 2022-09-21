/*
in this section now we will look 2d arrays , how it works , what are pros and cons of 2d array , why we use this array.
the array which have row and column or array of array is called 2d array.
 */
/*
Question section: we are given a no the first no is 123456 and the second no is 789654 we have to print this by using 2d arrays.
 */
public class array2d {
    public static void main(String[] args) {
         int arr [][] = {{1,2,3,4,5,6} , {7,8,9,6,5,4}};
        for (int i =0; i < 6; i++){
            for (int j =0 ; j <6; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
