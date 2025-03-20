package com.ivoyant.exception;

public class MultipleCatch {
    public static void main(String[] args) {
        int[] num = {1, 4, 5};
        String s = null;

        try {
            int i = num[2];
            int res = num[1]/i;
            System.out.println(res);
            System.out.println(num[3]);//if exception occur in this line then it will not check for the next line
            System.out.println(s.length());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Division by zero. ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception: ");
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception: ");
        } catch (Exception e) { // Catching more general exceptions
            System.out.println("An unexpected exception occurred: ");
        }
//        the order of declaration should be subclass to superclass
//        if it is from superclass to subclass it becomes unreachable code(compile time error)
        finally {
            System.out.println("Finally block executed.");
            // Code that always executes, regardless of exceptions
        }
    }
}
