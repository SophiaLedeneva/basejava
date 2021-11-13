package ru.javaops.webapp.storage;

import ru.javaops.webapp.model.Resume;

import java.util.Arrays;

/**
 * SLedeneva
 * 13.11.2021
 */
public class SortedArrayStorage extends AbstractArrayStorage{

    @Override
    public void clear() {

    }

    @Override
    public void update(Resume resume) {

    }

    @Override
    public void save(Resume resume) {

    }

    @Override
    public void delete(String uuid) {

    }

    @Override
    public Resume[] getAll() {
        return new Resume[0];
    }

    @Override
    protected int findIndex(String resume) {
        Resume searchKey = new Resume();
        searchKey.setUuid(resume);
        return Arrays.binarySearch(storage, 0, size, searchKey);
    }
}
