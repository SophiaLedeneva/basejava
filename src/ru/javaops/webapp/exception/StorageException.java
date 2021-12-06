package ru.javaops.webapp.exception;

/**
 * SLedeneva
 * 20.11.2021
 */
public class StorageException extends RuntimeException{
    private final String uuid;

    public StorageException(String message, String uuid) {
        super(message);
        this.uuid = uuid;
    }

    public String getUuid() {
        return uuid;
    }
}
