package ObjectOrientedProgramming.WrapperClasses;

public class WrapperClasses {
    public static void main(String[] args){
        System.out.println(Integer.toString(10));
        System.out.println(Integer.valueOf(10));
        System.out.println(Integer.valueOf("10"));
        System.out.println(Integer.parseInt("10"));
        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Float.parseFloat("1.2"));
        System.out.println(Boolean.parseBoolean("true"));
        System.out.println(Double.valueOf("1.231"));
        System.out.println(Byte.decode("123"));
        System.out.println(Short.valueOf("1"));
        System.out.println(Long.bitCount(123));
    }
}
