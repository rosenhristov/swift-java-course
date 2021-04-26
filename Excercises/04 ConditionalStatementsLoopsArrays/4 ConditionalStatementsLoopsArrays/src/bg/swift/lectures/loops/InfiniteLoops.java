package bg.swift.lectures.loops;

/**
 * Created by Anatoli.
 */
public class InfiniteLoops {
    public static void main(String[] args) {
        for (int i = 1; i > 0; i++) {
            // pseudo infinite loop
        }

        while (true) {
            // infinite while
        }

        do {
            // infinite do
        } while (true);

        //Не е въведено условие, след изпълнението на което, цикълът да прекрати работата си.
        for(;;) {
            // infinite for
        }

    }

}
