package bg.swift.lectures.debugging;

public class Demo1 {

    public static void main(String[] args) {

        int a = 5;

        print("hello" + a);


    }

    public static void print(String message) {
        System.out.println(message);
    }

        /* You can manually force the generation of a stack trace using either the following statements.
        * Throwable().printStackTrace() to generate a trace of the method's code at a single point in time.
        * The trace will show the method's calls across threads.
        *
        * Thread.currentThread.dumpStack() to generate a snapshot of the current thread only.
        */
}
