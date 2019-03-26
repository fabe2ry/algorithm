package com.fabe2ry.sort;

public class Test {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        long c = 3l;
        System.out.println(c == (a + b));

        Long d = 3l;
        System.out.println(d.equals(a + b));

        int e = 3;
        System.out.println(e == (a + b));
        Integer f = 3;
        System.out.println(f.equals(a + b));

        System.out.println(3l == 3);
    }
}
