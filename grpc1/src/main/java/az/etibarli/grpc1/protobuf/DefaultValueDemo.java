package az.etibarli.grpc1.protobuf;

import az.etibarli.grpc1.Person;

public class DefaultValueDemo {

    public static void main(String[] args) {
        Person person = Person.newBuilder().build();

        System.out.println(person);
    }
}
