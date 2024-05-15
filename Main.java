import java.util.List;;

//https://jupyter.cscms.me/lab/tree/Adv%20Java

class Demo {

    public static String title(String name) {
        String prefix = name.contains("a") ? "Mrs. " : "Mr. ";
        return prefix + name;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(5, 3, 1, 4, 2, 6);
        List<String> names = List.of("John", "Jane", "Jack", "Jill", "Yo", "Dol", "Boss");

        // Stream<Integer> test = list.stream();
        // Stream<Integer> mappedTest = test.map(n -> 2 + n);
        list.stream().filter(n -> n % 2 == 1).sorted().map(n -> 2 * n).forEach(n -> System.out.println(n));
        // list.stream().sorted().map(n -> n + 2).filter(n -> n % 2 == 0).forEach(n ->
        // System.out.println(n));

        List<String> namename = names.stream().filter(n -> n.charAt(1) != 'o').map(n -> title(n)).toList();

        System.out.println(namename);

        // test.forEach(n -> System.out.println(2 * n));
        // mappedTest.forEach(n -> System.out.println(n));
    }
}