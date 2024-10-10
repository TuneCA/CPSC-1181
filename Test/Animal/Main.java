package Animal;

public class Main {
    public static void main(String[] args) {
        Animal v = new Animal();
        System.out.println(v);

        Animal s = new Bird(true);
        System.out.println(s.canFly());

        Parrot p = new Bird(true);
        System.out.println(p.action());

        Animal c = new Coral();
        System.out.println(c);

        Bird m = new Parrot();
        System.out.println(m);

        Parrot x = new Parrot();
        System.out.println(x.canFly());

        Coral k = new Coral();
        System.out.println(k.action());

        Animal d = new Bird(false);
        System.out.println(d);
        
        Coral j = new Coral();
        System.out.println(j);
    }
}
