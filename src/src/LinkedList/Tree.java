package LinkedList;

import java.util.*;
public class Tree {

    public static void main(String[] args) {
      int[] arr = {4,11};
      System.out.println(mctFromLeafValues(arr));
    }


    public static int mctFromLeafValues(int[] arr) {
        int res = 0;
        Stack<Integer> decStack = new Stack<>();
        System.out.println("Given Array is:" + Arrays.toString(arr));

        for (int i : arr) {
            System.out.println("i is:" + i);
            while (decStack.isEmpty() == false && decStack.peek() <= i) {
                System.out.println(decStack.peek());
                res += Math.min(decStack.peek(), i);
            }
            decStack.push(i);
        }
        return res;
    }
}
