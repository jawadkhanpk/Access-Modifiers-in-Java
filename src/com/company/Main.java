package com.company;

class C1{
    public int x = 5;
    protected int y = 20;
    int a = 90;                 // no modifier
    private  int z = 43;

// same class example
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);

    }

}

public class Main {
    public static void main(String[] args) {
	// write your code here

        C1 c = new C1();
        c.meth1();

        // same package example
        System.out.println(c.x);
        System.out.println(c.y);
//        System.out.println(c.z);    // so here we can not access private variable within the same package.
        System.out.println(c.a);



    }
}
