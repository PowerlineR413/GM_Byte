package lesson5.t2;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Ого, метод м1 что-то вернул. Он вернул число " + m1());
        System.out.println("Числа из методов сложились и получилось " + m1() + " и " + m2());
    }
    public static byte m1() {
        byte a = 27;
        byte b = -3;
        return(byte) (a + b);
    }
    public static byte m2() {
        byte a = 18;
        byte b = -5;
        return(byte) (a + b);
    }
}
