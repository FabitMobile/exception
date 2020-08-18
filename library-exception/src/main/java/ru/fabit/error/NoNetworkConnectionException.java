package ru.fabit.error;


public class NoNetworkConnectionException extends Exception {

    public NoNetworkConnectionException() {
        super();
    }

    public NoNetworkConnectionException(String detailMessage) {
        super(detailMessage);
    }
}