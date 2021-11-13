package ru.javaops.webapp.storage;

import ru.javaops.webapp.model.Resume;

import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage implements Storage {
    private static final int STORAGE_LIMIT = 10000;
    private Resume[] storage = new Resume[STORAGE_LIMIT];
    private int size = 0;

    public void clear() {
        Arrays.fill(storage,0, size, null);
        size = 0;
    }

    public void update(Resume resume) {
        int index = findIndex(resume.getUuid());
        if (index > -1) {
            storage[index] = resume;
        } else {
            System.out.println("Resume " + resume.getUuid() + " not found");
        }
    }

    public void save(Resume resume) {
        int index = findIndex(resume.getUuid());
        if ((index == -1) && (size <= 9999)) {
           storage[size] = resume;
           size++;
       } else if (index == -1){
            System.out.println("Resume " + resume.getUuid() + " exist");
        } else {
            System.out.println("Storage overflow");
        }
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

    public void delete(String uuid) {
        int index = findIndex(uuid);
        if (index > -1) {
            storage[index] = storage[size - 1];
            storage[size - 1] = null;
            size--;
        } else {
            System.out.println("Resume " + uuid + " not found");
        }
    }

    public Resume[] getAll() {
        return Arrays.copyOfRange(storage, 0, size);
    }

    public int size() {
        return size;
    }

    private int findIndex(String resume) {
        for (int index = 0; index < size; index++) {
            if (storage[index].toString().equals(resume)) {
                return index;
            }
        }
        return -1;
    }
}
