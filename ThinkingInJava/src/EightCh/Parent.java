package EightCh;

/**
 * Created by lvrh on 15/12/6.
 */
public class Parent {
    private void test() {
        System.out.println("this is parent test");
    }

    public static void main(String[] args) {
        Parent p = new Child();
        p.test();
    }
}

class Child extends Parent {
    public void test() {
        System.out.println("this is child test");
    }
}