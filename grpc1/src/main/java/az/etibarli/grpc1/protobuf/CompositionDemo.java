package az.etibarli.grpc1.protobuf;

import az.etibarli.grpc1.Address;
import az.etibarli.grpc1.Car;
import az.etibarli.grpc1.Person;
import com.google.protobuf.Int32Value;

public class CompositionDemo {

    public static void main(String[] args) {
        Address address = Address.newBuilder()
                .setPostbox(123)
                .setStreet("main street")
                .setCity("Atlanta")
                .build();

        Car accord = Car.newBuilder()
                .setMake("Honda")
                .setModel("Accord")
                .setYear(2020)
                .build();

        Car civic = Car.newBuilder()
                .setMake("Honda")
                .setModel("Civic")
                .setYear(2005)
                .build();

        Person sam = Person.newBuilder()
                .setName("sam")
                .setAge(Int32Value.newBuilder().setValue(25).build())
                .addCar(accord)
                .addCar(civic)
                .setAddress(address)
                .build();

        System.out.println(sam);
    }
}
