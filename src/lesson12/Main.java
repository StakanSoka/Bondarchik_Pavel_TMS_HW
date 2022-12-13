package lesson12;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String as = "123";
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        for (int i = 0; i < arrayList.size(); i++) {
            if (i == 1) arrayList.remove(i);
        }
    }
}
