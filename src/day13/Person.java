package day13;

import java.util.Objects;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printProfile() {
        System.out.printf("나이 : %d , 이름 : %s", age, name);
    }

    @Override
    public boolean equals(Object object) {
        if ((object instanceof Person)) {
            Person person = (Person) object;
            return name.equals(person.name);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
