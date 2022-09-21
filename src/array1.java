/*
In this section we will see how array works , what is array , type of arrays and lot more.
 */
/*
Question section: Java program to illustrate creating an array of integers, puts some values in the array,
and prints each value to standard output.
 */
/*
Solution section: first step we will make a array of size 5 and then we will store value in it & then print it.
 */
public class array1 {
    public static void main(String[] args) {
       int[] arr;
         arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        for ( int i =0; i <= arr.length; i++){
            System.out.println("element of array" + i + " : " + arr[i]);
        }
    }
}
/*
logics: first we initialize the array variable which is arr then we put no of array we have it is 5 and then we put value in it
and by the help of for loop we are printing the array value. one thing we have to notice that if we want to print only index value then
simply write 'i' and if we want to print value then we have to print arr[i]. that all
Thank you........
 */
