package com.company;

import java.io.Closeable;

public class CloseableResource implements AutoCloseable {
    private int a;
    private int b;

    public CloseableResource(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int div() {
        return a/b;
    }


    public void close()  {

        System.out.println("close resource");
    }
}
