package ru.javaops.webapp.exception;

/**
 * SLedeneva
 * 20.11.2021
 */
public class NotExistStorageException extends StorageException{
    public NotExistStorageException(String uuid) {
        super("Resume " +  uuid + " not exist", uuid);
    }
}
