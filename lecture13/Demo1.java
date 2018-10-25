package comp110.lecture13;

public class Demo1 {

    public static void main(String[] args) {

        Egg a = new Egg();
        Egg b = a;
        Egg c = new Egg();
        a.boil();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

}
