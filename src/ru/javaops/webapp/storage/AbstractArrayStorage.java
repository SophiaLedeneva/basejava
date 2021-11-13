package ru.javaops.webapp.storage;

import ru.javaops.webapp.model.Resume;

/**
 * Array based storage for Resumes
 */
public abstract class AbstractArrayStorage implements Storage {
    protected static final int STORAGE_LIMIT = 10000;
    protected Resume[] storage = new Resume[STORAGE_LIMIT];
    protected int size = 0;

    public int size() {
        return size;
    }

    public Resume get(String uuid) {
        int index = findIndex(uuid);
        if (index > -1) {
            return storage[index];
        } else {
            System.out.println("Resume " + uuid + " not found");
            return null;
        }
    }

    protected abstract int findIndex(String resume) ;
}
