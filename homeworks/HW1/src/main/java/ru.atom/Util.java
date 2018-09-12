package ru.atom;

/**
 * In this assignment you need to implement the following util methods.
 * Note:
 *  throw new UnsupportedOperationException(); - is just a stub
 */
public class Util {

    public static void main(String args[]){
        System.out.print(args);
        System.out.print( max([1,2,3,4,5,99]) );
    }

    /**
     * Returns the greatest of {@code int} values.
     *
     * @param values an argument. Assume values.length > 0.
     * @return the largest of values.
     */
    public static int max(int[] values) {
        int max = 0;
        for (int i = 0; i < values.length; i++) {
            if (i == 0) {
                max = values[i];
            }

            if (max < values[i]) {
                max = values[i];
            }
        }
        return max;
    }

    /**
     * Returns the sum of all {@code int} values.
     *
     * @param values an argument. Assume values.length > 0.
     * @return the sum of all values.
     */
    public static long sum(int[] values) {
        long sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }
}
