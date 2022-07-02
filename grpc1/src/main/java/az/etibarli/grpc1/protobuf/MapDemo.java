package az.etibarli.grpc1.protobuf;

import az.etibarli.grpc1.BodyStyle;
import az.etibarli.grpc1.Car;
import az.etibarli.grpc1.Dealer;

public class MapDemo {

    public static void main(String[] args) {

        Car accord = Car.newBuilder()
                .setMake("Honda")
                .setModel("Accord")
                .setBodySyle(BodyStyle.COUPE)
                .setYear(2020)
                .build();

        Car civic = Car.newBuilder()
                .setMake("Honda")
                .setModel("Civic")
                .setYear(2005)
                .build();

        Dealer dealer = Dealer.newBuilder()
                .putModel(2005, civic)
                .putModel(2020, accord)
                .build();

        System.out.println(dealer.getModelOrThrow(2005));
        System.out.println(dealer.getModelMap());
        System.out.println(dealer.getModelOrThrow(2005).getBodySyle());
    }
}
