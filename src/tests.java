import java.util.Arrays;

public class tests {
    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        Arrays.copyOf(a, 2);
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
