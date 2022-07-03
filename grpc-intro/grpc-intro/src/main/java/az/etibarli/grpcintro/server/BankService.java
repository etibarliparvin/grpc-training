package az.etibarli.grpcintro.server;

import az.etibarli.models.Balance;
import az.etibarli.models.BalanceCheckRequest;
import az.etibarli.models.BankServiceGrpc;
import io.grpc.stub.StreamObserver;

public class BankService extends BankServiceGrpc.BankServiceImplBase {

    @Override
    public void getBalance(BalanceCheckRequest request, StreamObserver<Balance> responseObserver) {
        int accountNumber = request.getAccountNumber();
        Balance balance = Balance.newBuilder()
                .setAmount(accountNumber * 10)
                .build();
        responseObserver.onNext(balance);
        responseObserver.onCompleted();
    }
}
