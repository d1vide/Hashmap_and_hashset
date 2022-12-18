package hashsets.number1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static <T> Set<T> createTree(Set<T> hashSet) {
        Set<T> treeSet = new TreeSet<>(hashSet);
        return treeSet;
    }

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("A");

        Set<String> treeSet = createTree(hashSet);
        System.out.println(treeSet);
    }
}
