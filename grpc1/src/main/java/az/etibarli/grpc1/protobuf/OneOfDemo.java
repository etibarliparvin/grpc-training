package az.etibarli.grpc1.protobuf;

import az.etibarli.grpc1.Credentials;
import az.etibarli.grpc1.EmailCredentials;
import az.etibarli.grpc1.PhoneOTP;

public class OneOfDemo {

    public static void main(String[] args) {
        EmailCredentials emailCredentials = EmailCredentials.newBuilder()
                .setEmail("test@gmail.com")
                .setPassword("admin")
                .build();

        PhoneOTP phoneOTP = PhoneOTP.newBuilder()
                .setNumber(123)
                .setCode(456)
                .build();

        Credentials credentials = Credentials.newBuilder()
                .setPhoneMode(phoneOTP)
                .setEmailMode(emailCredentials)
                .build();

        login(credentials);
    }

    private static void login(Credentials credentials) {

        switch (credentials.getModeCase()) {
            case EMAILMODE:
                System.out.println(credentials.getEmailMode());
                break;
            case PHONEMODE:
                System.out.println(credentials.getPhoneMode());
                break;
        }
//        System.out.println(credentials.getEmailMode());
        System.out.println(credentials.getPhoneMode());
    }
}
