package ru.javaops.webapp.exception;

/**
 * SLedeneva
 * 20.11.2021
 */
public class ExistStorageException extends StorageException{
    public ExistStorageException(String uuid) {
        super("Resume " +  uuid + " already exist", uuid);
    }
}
