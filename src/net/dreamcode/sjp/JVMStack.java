package net.dreamcode.sjp;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Copyright
 */
public class JVMStack {

    Deque<DataType> stack = new LinkedList<>();

    public void push(DataType type) {
        stack.push(type);
    }

    public DataType pop() {
        return stack.pop();
    }

}
