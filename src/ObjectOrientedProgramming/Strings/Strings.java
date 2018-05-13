package ObjectOrientedProgramming.Strings;

public class Strings {
    public static void main(String[] args){
        String s = "string";

        /**
         * In practice that method is like below:
         * new StringBuilder(s).append("a").toString();
         * So it's complicated. In practice we create a new object, use two methods and constructor.
         * It's not efficient.
         * In case that you use it in some loop (e.g. 10000 iterations) you create 10000 objects.
         */
        s = s + "a";
        System.out.println(s);

        String test1 = "a";

        long start1 = System.nanoTime();
        for(int i = 0; i < 10000; i++)
            test1 = test1 + "a";

        System.out.println("First time: " + (System.nanoTime() - start1));

        /**
         * In second approach we create only one StringBuilder and use only one method append.
         * It's the fastest solution.
         */

        String test2 = "a";

        long start2 = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder(test2);

        for(int i = 0; i < 10000; i++)
            stringBuilder.append("a");

        test2 = stringBuilder.toString();
        System.out.println("Second time: " + (System.nanoTime() - start2));

        /**
         * Third approach using StringBuffer
         */
        String test3 = "a";

        long start3 = System.nanoTime();;
        StringBuffer stringBuffer = new StringBuffer(test3);

        for(int i = 0; i < 10000; i++)
            stringBuffer.append("a");

        test3 = stringBuffer.toString();
        System.out.println("Third time: " + (System.nanoTime() - start3));


        /**
         * Results for 100 000 elements:
         * First time: 3961839587
         * Second time: 1030054 ~3846x faster
         * Third time: 3424230 ~1157x faster
         */
    }
}
