package az.etibarli.grpc1.protobuf;

import az.etibarli.grpc1.Person;
import az.etibarli.grpc1.json.JPerson;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.Int32Value;

import java.io.IOException;

public class PerformanceTest {

    public static void main(String[] args) throws IOException {
        // json
        JPerson person = new JPerson();
        person.setName("Sam");
        person.setAge(10);
        ObjectMapper mapper = new ObjectMapper();
        Runnable json = () -> {
            try {
                byte[] bytes = mapper.writeValueAsBytes(person);
                System.out.println(bytes.length);
                JPerson person1 = mapper.readValue(bytes, JPerson.class);
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        // protobuf
        Person sam = Person.newBuilder()
                .setName("Sam")
                .setAge(Int32Value.newBuilder().setValue(10).build())
                .build();
        Runnable proto = () -> {
            try {
                byte[] bytes = sam.toByteArray();
                System.out.println(bytes.length);
                Person sam1 = Person.parseFrom(bytes);
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        runPerformanceTest(json, "JSON");
        runPerformanceTest(proto, "PROTO");
    }

    private static void runPerformanceTest(Runnable runnable, String method) {
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 1; i++) {
            runnable.run();
        }
        long time2 = System.currentTimeMillis();
        System.out.println(method + " : " + (time2 - time1) + " ms");
    }
}
