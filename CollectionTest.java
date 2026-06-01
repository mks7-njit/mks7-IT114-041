import java.util.ArrayList;
public class CollectionTest {
    public static void main(String[] args) {
        String[] a1 = new String[2];

        ArrayList<String> a2 = new ArrayList<>();
        a2.add("1");
        a2.add("2");
        a2.add("3");
        a2.add("4");

        for (int i = 0; i < a2.size(); i++) {
            System.out.println(a2.get(i));
        }

        ArrayList<Integer> a3 = new ArrayList<>();
        a3.add(1);
        a3.add(2);
        a3.add(3);
        a3.add(4);

        for (int i = 0; i < a3.size(); i++) {
            System.out.println(a3.get(i));
        }


    }
}
