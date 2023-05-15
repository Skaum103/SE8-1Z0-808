import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Q47 {

    public static void main(String[] args) {
        List<Person> iList = Arrays.asList(new Person("Hank",45),
                new Person("Charlie",40), new Person("Smith",38));

        // Consumer interface to store a lambda function !!! function has to return void
        Consumer<Person> method = p -> System.out.println(p.getName());

        checkAge(iList, p -> p.getAge() > 40);
    }

    // Predicate<Person> : Interface, represents a function that takes
    // a Person object and do something with it.
    public static void checkAge(List<Person> list, Predicate<Person> predicate) {
        for (Person p:list
             ) {
            if (predicate.test(p)) {
                System.out.println(p.name + " ");
            }
        }
    }

    public static class Person {
        String name;
        int age;

        public Person(String n, int a) {
            this.name = n;
            this.age = a;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
