import java.util.ArrayList;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("Nkem Uba", "Aberdeen", 20);
        Person person2 = new Person("Ifeoma", "Nigeria", 35);
        Person person3 = new Person("Rapheal", "Abuja", 40);
        

        System.out.println("\n" + person + "\n");
        person.decreaseAge();
        System.out.println(person.toString() + "\n");
        ArrayList<Person> group = new ArrayList<>();
        group.add(person);
        group.add(person2);
        group.add(person3);

        for (Person member: group){
            System.out.println(member);
        }
        person2.increaseAge();
        person.setAge(63);

        for(Person member: group){
            System.out.println(member);
        }

    }


}
