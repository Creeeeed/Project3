package util;
import org.testng.annotations.Test;

import java.util.Stack;

@Test
public class StackTest {

    public static void main(String[] args) {
        Stack<Integer> label = new Stack<Integer>();

        label.push(1);
        label.push(2);
        label.push(3);

        System.out.println(label);
        System.out.println("Stack size is " + label.size());
        System.out.println(label.pop());
        System.out.println(label.empty());


    }



}
