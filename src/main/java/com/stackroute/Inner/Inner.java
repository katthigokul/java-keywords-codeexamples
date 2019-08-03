package com.stackroute.Inner;

class Outer {
    // Simple nested inner class
    class Inner {
        public void show() {
            System.out.println("Nested class method");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner();
        in.show();
    }
}