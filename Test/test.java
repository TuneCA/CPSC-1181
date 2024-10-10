// Test program
import java.util.ArrayList;
public class test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Burnaby");
        list.add ("Vancouver");
        list.add("25");
        String city =list.get(0);
        list.set(2, "Richmond");
        System.out.println(list.get (2));
    }
}
