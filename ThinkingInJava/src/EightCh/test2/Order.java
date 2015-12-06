package EightCh.test2;

/**
 * Created by lvrh on 15/12/6.
 */
public class Order {
    public static void main(String[] args) {
        Parent p = new Child();
    }
}
class Parent {
    int p;

    public Parent() {
        System.out.println("init parent");
        System.out.println("p=" + p);
    }
}
class Child extends Parent {
    public Child() {
        this.p = 2;
        System.out.println("init child");
        System.out.println("p=" + p);
    }
}